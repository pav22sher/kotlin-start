package oop

fun main() {
    val car: Movable = Car()
    car.move()
    car.stop()
}

interface Movable{
    var speed: Int  // объявление свойства
    fun move()      // определение функции без реализации
    fun stop(){     // определение функции с реализацией по умолчанию
        println("Остановка")
    }
}
class Car : Movable{
    override var speed = 60
    override fun move(){
        println("Машина едет со скоростью $speed км/ч")
    }
}