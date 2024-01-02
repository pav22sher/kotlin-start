package oop

fun main() {
    val alice: Man = Man("Alice", 24)
    val kate = alice.copy(name = "Kate")
    println(alice.toString())
    println(kate.toString())
}

/**
 * ��� ���������� ������ ������ ���������� ������������� ��������� � ����� �������:
 * equals(): ���������� ��� ������� �� ���������
 * hashCode(): ���������� ���-��� �������
 * toString(): ���������� ��������� ������������� �������
 * copy(): �������� ������ ������� � ������ ������
 */
data class Man(val name: String, val age: Int) {
    fun hello() {
        println("Hello world!")
    }
    override fun toString(): String {
        return "Name: $name  Age: $age"
    }
}