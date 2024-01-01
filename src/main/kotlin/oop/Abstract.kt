package oop

fun main() {
    val rec = Rectangle(2f, 4f)
    println(rec.perimeter())
    println(rec.area())
}

// абстрактный класс фигуры
abstract class Figure {
    // абстрактный метод для получения периметра
    abstract fun perimeter(): Float
    // абстрактный метод для получения площади
    abstract fun area(): Float
}
// производный класс прямоугольника
class Rectangle(val width: Float, val height: Float) : Figure()
{
    // переопределение получения периметра
    override fun perimeter(): Float{
        return width * 2 + height * 2;
    }
    // переопределение получения площади
    override fun area(): Float{
        return width * height;
    }
}