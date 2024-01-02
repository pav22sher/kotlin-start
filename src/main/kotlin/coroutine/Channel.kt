package coroutine

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

//������ �������� ������ �� ����� �������� � ������
suspend fun main() {
    //ex1()
    //ex2()
    ex3()
}

/**
 * ������ ��������� ���������� ������ ������. (������ �� exchange)
 * ������� �������� ��� �������� ������:
 * abstract suspend fun send(element: E): Unit - ���������� ������ element � �����.
 * abstract suspend fun receive(): E - �������� ������ �� ������
 */
private suspend fun ex1() = coroutineScope{
    val channel = Channel<Int>()
    launch {
        for (n in 1..5) {
            // ���������� ������ ����� ����� (����� ������ ����������� � ��������)
            channel.send(n)
        }
    }
    // �������� ������ �� ������ (��������� 5 ���)
    repeat(5) {
        val number = channel.receive()
        println(number)
    }
    println("End")
}

/**
 * ����� �������, ��� � ������ ������ ��� ������,
 * ��� ����� ������� � ������� ������ close().
 * ���� ��� ��������� ������ �� ������ ����������� ���� for,
 * ��, ������� ������ � �������� ������,
 * ������ ���� ������� ��� ����� ��������� ������� �� ��������
 * � �������� ����������.
 */
private suspend fun ex2() = coroutineScope{
    val channel = Channel<String>()
    launch {
        val users = listOf("Tom", "Bob", "Sam")
        for (user in users) {
            channel.send(user)  // ���������� ������ � �����
        }
        channel.close()  // �������� ������
    }

    for(user in channel) {  // �������� ������ �� ������
        println(user)
    }
    println("End")
}

/**
 * ������� producer-consumer/
 */
private suspend fun ex3() = coroutineScope{
    val users = getUsers()
    //��� ����������� ������ �� ������ ����� ����������� ����� consumeEach()
    users.consumeEach { user -> println(user) }
    println("End")
}

/**
 * ������� produce() - ����������� ��������, ������� �������� ������ � �����
 */
private fun CoroutineScope.getUsers(): ReceiveChannel<String> = produce{
    val users = listOf("Tom", "Bob", "Sam")
    for (user in users) {
        send(user) //�������� ������ � �����
    }
}