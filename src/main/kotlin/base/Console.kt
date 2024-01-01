package base

fun main() {
    print("Введите имя: ")
    val name = readlnOrNull()
    print("Введите email: ")
    val email = readlnOrNull()
    print("Введите адрес: ")
    val address = readlnOrNull()
    println("Ваше имя: $name")
    println("Ваш email: $email")
    println("Ваш адрес: $address")
}