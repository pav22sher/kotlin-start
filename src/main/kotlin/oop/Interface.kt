package oop

fun main() {
    val car: Movable = Car()
    car.move()
    car.stop()
}

interface Movable{
    var speed: Int  // ���������� ��������
    fun move()      // ����������� ������� ��� ����������
    fun stop(){     // ����������� ������� � ����������� �� ���������
        println("���������")
    }
}
class Car : Movable{
    override var speed = 60
    override fun move(){
        println("������ ���� �� ��������� $speed ��/�")
    }
}