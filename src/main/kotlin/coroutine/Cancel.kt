package coroutine

import kotlinx.coroutines.*

suspend fun main() = coroutineScope{
    val downloader: Job = launch{
        try {
            println("�������� �������� ������")
            for(i in 1..5){
                println("�������� ���� $i")
                delay(500L)
            }
        }
        catch (e: CancellationException ){
            println("�������� ������ ��������")
        }
        finally{
            println("�������� ���������")
        }
    }
    delay(800L)     // ��������� ��������, ����� ��������� ������ �����������
    println("������� �����, ���� ��� ����� ����������. ������-�� � ��������...")
    //downloader.cancel()    // �������� ��������
    //downloader.join()      // ������� ���������� ��������
    downloader.cancelAndJoin()
    println("������ ��������� ���������")
}