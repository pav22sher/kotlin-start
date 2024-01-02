package oop

fun main() {
    val rec = Rectangle(2f, 4f)
    println(rec.perimeter())
    println(rec.area())
}

// ����������� ����� ������
abstract class Figure {
    // ����������� ����� ��� ��������� ���������
    abstract fun perimeter(): Float
    // ����������� ����� ��� ��������� �������
    abstract fun area(): Float
}
// ����������� ����� ��������������
class Rectangle(val width: Float, val height: Float) : Figure()
{
    // ��������������� ��������� ���������
    override fun perimeter(): Float{
        return width * 2 + height * 2;
    }
    // ��������������� ��������� �������
    override fun area(): Float{
        return width * height;
    }
}