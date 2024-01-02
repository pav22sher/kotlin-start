package coroutine

import kotlinx.coroutines.*

/**
 * async - ������� �����������,
 * ����� ���� �������� �� �������� ��������� ���������.
 */
suspend fun main() = coroutineScope{
    // �������� �������, �� �� ��������
    val sum: Deferred<Int> = async(start = CoroutineStart.LAZY){ sum(1, 2)}
    delay(1000L)
    println("Actions after the coroutine creation")
    sum.start()                      // ������ ��������
    println("sum: ${sum.await()}")   // �������� ���������
}
fun sum(a: Int, b: Int) : Int{
    println("Coroutine has started")
    return a + b
}