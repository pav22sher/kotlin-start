package function

/**
 * ����� �� ������������ ������ ��������� �������� �������.
 * ������� ���������� ��������� ��������.
 * � Kotlin ������� ����������� � ������� ��������� ����� fun,
 * ����� �������� ���� �������� �������.
 * ����� ����� �������� � ������� ����������� ������ ����������.
 * ���� ������� ���������� �����-���� ��������,
 * �� ����� ������ ���������� ����� �������
 * ����� ������� ��� ������������� ��������.
 * � ����� � �������� ������� ���� ���� �������.
 *
 * ������� ����� ���������� � ����� ��� ������ ������� ��� �������,
 * ���� �� ����, ��� ��������, ������������ ������� main.
 * ����� ������� ��� �������� ��������� �������� ������ (top-level functions).
 *
 * �� ��������� ��� ��������� ������� ����������� val-����������,
 * ������� �� �������� ������ ��������.
 *
 * ���� ������� �� ���������� ������-���� ����������,
 * �� ���������� ������ ��� ���������� �������� ���� Unit.
 * ���� ��� ���������� ���� void � ���� ������ ����������������,
 * ������� ���������, ��� ������� ������ �� ����������.
 */
fun main() {
    hello()
    showMessage("Hello Kotlin")
    //��������� �� ���������
    displayUser("Tom", 23, "Manager")
    displayUser("Alice", 21)
    displayUser("Kate")
    //����������� ���������(postgres)
    displayUser("Tom", position = "Manager", age = 28)
    displayUser(age = 21, name = "Alice")
    displayUser("Kate", position = "Middle Developer")
    //vararg - ���������� ���-�� ����������
    printStrings("1", "2", "3")
    //�������� * (spread operator)
    printStrings(*arrayOf("1", "2", "3"))
    //Return - ������������ ��������
    println(sumInt(4, 3))
    //������������ ������� (single expression function)
    println(square(9))
    //��������� �������
    compareAge(20, 23)
}

fun hello() {
    println("Hello")
}

fun showMessage(message: String) {
    println(message)
}

fun displayUser(name: String, age: Int = 18, position: String = "unemployed") {
    println("Name: $name   Age: $age  Position: $position")
}

fun printStrings(vararg strings: String) {
    for (str in strings) {
        print("$str ")
    }
}

fun sumInt(x: Int, y: Int): Int {
    return x + y
}

/**
 * ������������ ������� (single expression function)
 * ���������� ����������� ��������� ����������� ������� � ���� ������ ���������.
 * ��� ����� ��������� �������� ������������ ��� � �������� return.
 * fun ���_������� (���������_�������) = ����_�������
 */
fun square(x: Int) = x * x

/**
 * ���� ������� ����� ���� ���������� ������ ������ �������.
 * ���������� ��� ��������� ������� ��� �������� ����������.
 */
fun compareAge(age1: Int, age2: Int) {
    fun ageIsValid(age: Int) = age in 1..110
    if (!ageIsValid(age1) || !ageIsValid(age2)) {
        println("Invalid age")
        return
    }
    when {
        age1 == age2 -> println("age1 == age2")
        age1 > age2 -> println("age1 > age2")
        age1 < age2 -> println("age1 < age2")
    }
}