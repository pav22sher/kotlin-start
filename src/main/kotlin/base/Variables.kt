package base

/**
 * ���������� ������������ ����������� ������� ������,
 * ������� ������ ��������� ��������.
 * ������ ���������� ��������������� ������������ ������,
 * ����� ������ � ���������.
 * ����������� ����������: val|var ���_����������: ���_����������
 *
 * Kotlin ��������� �������� ��� ���������� �� ��������� ������
 * ������ ������ ������� �������� ���������� ��� �������� ����,
 * � ����� ���-�� � ��������� ��������� �� �����-�� ��������.
 * ���� ������� ��� Any.
 */

/**
 * ��������� ������ ����������� �� ����� ������� ������.
 * ��������� ���������� ��������� �������� ����� ��� �����������.
 */
const val maxAge: Int = 25 // ���������
fun main() {
    //val - immutable variable - ������ �������� �������� ����� ������������
    val immutableAge: Int = 18
    //var - mutable variable - ����� �������� ��������
    var mutableAge: Int = 23
    // ���� ������:
    //Byte, Short, Int, Long
    val a: Byte = -10
    val b: Short = 45
    val c: Int = -250
    val d: Long = 30000
    //Float, Double
    val height: Double = 1.78
    val width: Double = 1.78
    val pi: Float = 3.14F
    //Boolean
    val t: Boolean = true
    val f: Boolean = false
    //Char
    val char: Char = 'A'
    //String
    val name: String = "Eugene"
    //������������� �����
    val text: String = """
                        ��� ��� �� ����, ���� ����� ����,
                        ��������� � ������ ����� ���������,
                        ��� ��� �� ����, � �������� �����,
                        �������� �������� ��������������,
                    """.trimIndent()
    println(text)
    //������� �����
    val firstName = "�����"
    val lastName = "��������"
    println("���: $firstName �������: $lastName �������: ${18+18}")
}