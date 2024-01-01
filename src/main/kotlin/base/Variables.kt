package base

/**
 * Переменная представляет именованный участок памяти,
 * который хранит некоторое значение.
 * Каждая переменная характеризуется определенным именем,
 * типом данных и значением.
 * Определение переменной: val|var имя_переменной: тип_переменной
 *
 * Kotlin позволяет выводить тип переменной на основании данных
 * Однако нельзя сначала объявить переменную без указания типа,
 * а потом где-то в программе присвоить ей какое-то значение.
 * Есть базовый тип Any.
 */

/**
 * Константа должна объявляться на самом верхнем уровне.
 * Константе необходимо присвоить значение сразу при определении.
 */
const val maxAge: Int = 25 // константа
fun main() {
    //val - immutable variable - нельзя изменить значение после присваивания
    val immutableAge: Int = 18
    //var - mutable variable - можно изменять значение
    var mutableAge: Int = 23
    // Типы данных:
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
    //Многострочный текст
    val text: String = """
                        Мне вас не жаль, года весны моей,
                        Протекшие в мечтах любви напрасной,
                        Мне вас не жаль, о таинства ночей,
                        Воспетые цевницей сладострастной,
                    """.trimIndent()
    println(text)
    //Шаблоны строк
    val firstName = "Павел"
    val lastName = "Щербаков"
    println("Имя: $firstName Фамилия: $lastName Возраст: ${18+18}")
}