package generics

/**
 * ������������ ���������, ��� ���������� ����,
 * �������������� �������� �� ����� �������� ������������,
 * ����������� ���� � ������.
 *
 * �������������� ������������, ���, ���� � ��� ���� ������
 * Base - ������� ����� � Derived - ����������� ����� �� Base,
 * �� ����� C<Base> ��� �<Derived> �� �������� �� ������� �������, �� �����������.
 *
 * ������������� ������������, ���, ���� � ��� ���� ������
 * Base - ������� ����� � Derived - ����������� ����� �� Base,
 * �� ����� SomeClass<Base> �������� ������� ������� ��� SomeClass<Derived>.
 * ��������� ������������ � �������� ������ out - �������� ������������
 * out - ���������, ��� �������� ����� ��������� �� �������.
 *
 * ������������������ ������������, ���, ���� � ��� ���� ������
 * Base - ������� ����� � Derived - ����������� ����� �� Base,
 * �� ������� SomeClass<Derived> �� ����� ��������� �������� SomeClass<Base>.
 * ��������� ������������ � �������� ������ in - �������� ����������������
 * in - ���������, ��� �������� ����� ����������� ��� �������� �������.
 */
fun main() {
    println(getBiggest(2, 5))

    display("Hello Kotlin")
    display(1234)

    val tom1: Person<Int> = Person(367, "Tom")
    println("${tom1.id} - ${tom1.name}")
    val bob1: Person<String> = Person("A65", "Bob")
    println("${bob1.id} - ${bob1.name}")

    val tom2 = Person(367, "Tom")
    println("${tom2.id} - ${tom2.name}")
    val bob2 = Person("A65", "Bob")
    println("${bob2.id} - ${bob2.name}")
}

//��������_����: �����������
fun <T> getBiggest(a: T, b: T): T where T: Comparable<T>, T: Number{
    return if(a > b) a else b
}

//���������� �������
fun <T> display(obj: T){
    println(obj)
}

//���������� �����
class Person<T>(val id: T, val name: String)