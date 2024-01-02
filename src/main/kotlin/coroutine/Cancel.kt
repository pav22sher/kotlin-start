package coroutine

import kotlinx.coroutines.*

suspend fun main() = coroutineScope{
    val downloader: Job = launch{
        try {
            println("Начинаем загрузку файлов")
            for(i in 1..5){
                println("Загружен файл $i")
                delay(500L)
            }
        }
        catch (e: CancellationException ){
            println("Загрузка файлов прервана")
        }
        finally{
            println("Загрузка завершена")
        }
    }
    delay(800L)     // установим задержку, чтобы несколько файлов загрузились
    println("Надоело ждать, пока все файлы загрузятся. Прерву-ка я загрузку...")
    //downloader.cancel()    // отменяем корутину
    //downloader.join()      // ожидаем завершения корутины
    downloader.cancelAndJoin()
    println("Работа программы завершена")
}