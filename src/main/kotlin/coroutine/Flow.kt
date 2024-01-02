package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf

/**
 * �������� ��������� ���������� ��������� ��������.
 * ��� ����� �� �����, � �������, ��������� �������� � ������� ����������� async.
 * �� Kotlin ����� ��������� ��������� ����������� ������ (Asynchronous Flow),
 * ������� ���������� ����� ��������.
 * ��������� ������� �� ����� ��� �������, � �� ���� �� ���������
 * (������ �� WebFlux - ���������� ����������������).
 *
 * ������ ����� ������������ ������� � ������������� �������.
 *
 * ������������ ������� ������� (terminal operators) ������������ suspend-�������,
 * ������� ��������� ��������������� �������� ������� �� ������
 * ��� ���������� �����-�� �������� ��������:
 * collect(): �������� �� ������ ���������� ��������
 * count(): �������� ���������� ��������� � ������
 * toList(): ����������� ����� �������� � ��������� List
 *
 * ������������� ������� (Intermediate operator) ��������� ����� � ���������� ������������ �����.
 * combine(): ���������� ��� ������ � ����
 * filter(): ��������� �����
 * map(): ��������� � ��������� ������ ������� ��������������
 */
suspend fun main(){
    //�������� ������ �� �������
    val users = getUsers() // ����� ������, �� �� �������
    //������ ������ - ��������� �������� ��� ��������� ��� � ������
    users.collect { user -> println(user) }

    //�������� ������ �� ���������
    val numberFlow : Flow<Int> = flowOf(1, 2, 3, 5, 8)
    numberFlow.collect{n -> println(n)}

    //�������������� ��������� List<String> � �����
    val userFlow = listOf("Tom", "Sam", "Bob").asFlow()
    userFlow.collect({user -> println(user)})
}

/**
 * ����� �������, ��������� �� ����, ����� ������� getUsers ��������� ��� ������.
 * � �������� ������ �� ���� �� �������� � ����� ����� ������� emit().
 */
fun getUsers(): Flow<String> = flow {
    val database = listOf("Tom", "Bob", "Sam")  // �������� ���� ������
    var i = 1;
    for (item in database){
        delay(400L) // �������� ��������������� ������
        println("Emit $i item")
        emit(item) // �������� �������� � ����� �� ���� ���������
        i++
    }
}