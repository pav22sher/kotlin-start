package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf

/**
 * Корутины позволяют возвращать одиночные значения.
 * Для этого мы можем, к примеру, создавать корутину с помощью построителя async.
 * Но Kotlin также позволяет создавать асинхронные потоки (Asynchronous Flow),
 * которые возвращают набор объектов.
 * Позволяет вернуть не сразу все объекты, а по мере их получения
 * (Похоже на WebFlux - реактивное программирование).
 *
 * Потоки имеют терминальные функции и промежуточные функции.
 *
 * Терминальные функции потоков (terminal operators) представляют suspend-функции,
 * которые позволяют непосредственно получать объекты из потока
 * или возвращают какое-то конечное значение:
 * collect(): получает из потока переданные значения
 * count(): получает количество элементов в потоке
 * toList(): преобразует поток значений в коллекцию List
 *
 * Промежуточные функции (Intermediate operator) принимают поток и возвращают обработанный поток.
 * combine(): объединяет два потока в один
 * filter(): фильтрует поток
 * map(): применяет к элементам потока функцию преобразования
 */
suspend fun main(){
    //создание потока по функции
    val users = getUsers() // поток создан, но не запущен
    //запуск потока - обработка элемента при появлении его в потоке
    users.collect { user -> println(user) }

    //создание потока из элементов
    val numberFlow : Flow<Int> = flowOf(1, 2, 3, 5, 8)
    numberFlow.collect{n -> println(n)}

    //преобразование коллекции List<String> в поток
    val userFlow = listOf("Tom", "Sam", "Bob").asFlow()
    userFlow.collect({user -> println(user)})
}

/**
 * Таким образом, программа не ждет, когда функция getUsers возвратит все строки.
 * А получает строки по мере их отправки в поток через функцию emit().
 */
fun getUsers(): Flow<String> = flow {
    val database = listOf("Tom", "Bob", "Sam")  // условная база данных
    var i = 1;
    for (item in database){
        delay(400L) // имитация продолжительной работы
        println("Emit $i item")
        emit(item) // передаем значение в поток по мере обработки
        i++
    }
}