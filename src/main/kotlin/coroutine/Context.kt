package coroutine

import kotlinx.coroutines.*

/**
 * �������� �������� �������� ���� ����� ������� ��� ��������� ��������.
 * ��������� �������� ���������� ����� ����� ��� ����� ������
 * ����� �������������� ��� ���������� ��������.
 *
 * � ������� ���������� Thread.currentThread().name
 * �� ����� �������� ��� ������.
 *
 * ���� �����������:
 * - Dispatchers.Default:
 * ����������� �� ���������, ���� ��� ���������� �� ������ ����� �������.
 * - Dispatchers.IO:
 * ���������� ����� ��� �������, ����������� �� ���� �������������,
 * � ������������ ��� ���������� �������� �����-������
 * - Dispatchers.Main:
 * ����������� � ����������� �����������, ��������, � ����������� Android
 * - Dispatchers.Unconfined:
 * �������� �� ���������� ����� �� ������������ ������� ��� ����� �������.
 * - newSingleThreadContext � newFixedThreadPoolContext:
 * ��������� ������� ������ �����/��� ��� ���������� ��������
 */
suspend fun main() = coroutineScope{
    launch {
        println("�������� ����������� �� ������: ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Unconfined) {
        println("����� �������� (�� ���������): ${Thread.currentThread().name}")
        delay(500L)
        println("����� �������� (����� ���������): ${Thread.currentThread().name}")
    }
    launch(newSingleThreadContext("Custom Thread")) {
        println("����� ��������: ${Thread.currentThread().name}")
    }
    println("������� main ����������� �� ������: ${Thread.currentThread().name}")
}