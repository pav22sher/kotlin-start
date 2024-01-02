package coroutine

import kotlinx.coroutines.*

/**
 *  онтекст корутины включает себ€ такой элемент как диспетчер корутины.
 * ƒиспетчер корутины определ€ет какой поток или какие потоки
 * будут использоватьс€ дл€ выполнени€ корутины.
 *
 * — помощью переменной Thread.currentThread().name
 * мы можем получить им€ потока.
 *
 * “ипы диспетчеров:
 * - Dispatchers.Default:
 * примен€етс€ по умолчанию, если тип диспетчера не указан €вным образом.
 * - Dispatchers.IO:
 * использует общий пул потоков, создаваемых по мере необходимости,
 * и предназначен дл€ выполнени€ операций ввода-вывода
 * - Dispatchers.Main:
 * примен€етс€ в графических приложени€х, например, в приложени€х Android
 * - Dispatchers.Unconfined:
 * корутина не закреплена четко за определенным потоком или пулом потоков.
 * - newSingleThreadContext и newFixedThreadPoolContext:
 * позвол€ют вручную задать поток/пул дл€ выполнени€ корутины
 */
suspend fun main() = coroutineScope{
    launch {
        println(" орутина выполн€етс€ на потоке: ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Unconfined) {
        println("ѕоток корутины (до остановки): ${Thread.currentThread().name}")
        delay(500L)
        println("ѕоток корутины (после остановки): ${Thread.currentThread().name}")
    }
    launch(newSingleThreadContext("Custom Thread")) {
        println("ѕоток корутины: ${Thread.currentThread().name}")
    }
    println("‘ункци€ main выполн€етс€ на потоке: ${Thread.currentThread().name}")
}