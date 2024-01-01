package oop

fun main() {
    val alice: Man = Man("Alice", 24)
    val kate = alice.copy(name = "Kate")
    println(alice.toString())
    println(kate.toString())
}

/**
 * При компиляции такого класса компилятор автоматически добавляет в класс функции:
 * equals(): сравнивает два объекта на равенство
 * hashCode(): возвращает хеш-код объекта
 * toString(): возвращает строковое представление объекта
 * copy(): копирует данные объекта в другой объект
 */
data class Man(val name: String, val age: Int) {
    fun hello() {
        println("Hello world!")
    }
    override fun toString(): String {
        return "Name: $name  Age: $age"
    }
}