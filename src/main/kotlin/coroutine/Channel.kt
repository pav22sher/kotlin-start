package coroutine

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

//способ передачи данных от одной корутины к другой
suspend fun main() {
    //ex1()
    //ex2()
    ex3()
}

/**
 * Каналы позволяют передавать потоки данных. (Похоже на exchange)
 * Следует выделить два основных метода:
 * abstract suspend fun send(element: E): Unit - Отправляет объект element в канал.
 * abstract suspend fun receive(): E - Получает данные из канала
 */
private suspend fun ex1() = coroutineScope{
    val channel = Channel<Int>()
    launch {
        for (n in 1..5) {
            // отправляем данные через канал (метод должен запускаться в карутине)
            channel.send(n)
        }
    }
    // получаем данные из канала (повторяем 5 раз)
    repeat(5) {
        val number = channel.receive()
        println(number)
    }
    println("End")
}

/**
 * Чтобы указать, что в канале больше нет данных,
 * его можно закрыть с помощью метода close().
 * Если для получения данных из канала применяется цикл for,
 * то, получив сигнал о закрытии канала,
 * данный цикл получит все ранее посланные объекты до закрытия
 * и завершит выполнение.
 */
private suspend fun ex2() = coroutineScope{
    val channel = Channel<String>()
    launch {
        val users = listOf("Tom", "Bob", "Sam")
        for (user in users) {
            channel.send(user)  // Отправляем данные в канал
        }
        channel.close()  // Закрытие канала
    }

    for(user in channel) {  // Получаем данные из канала
        println(user)
    }
    println("End")
}

/**
 * Паттерн producer-consumer/
 */
private suspend fun ex3() = coroutineScope{
    val users = getUsers()
    //Для потребления данных из канала может применяться метод consumeEach()
    users.consumeEach { user -> println(user) }
    println("End")
}

/**
 * Функция produce() - построитель корутины, которая передает данные в канал
 */
private fun CoroutineScope.getUsers(): ReceiveChannel<String> = produce{
    val users = listOf("Tom", "Bob", "Sam")
    for (user in users) {
        send(user) //передаем данные в канал
    }
}