package function

/**
 * Одним из строительных блоков программы являются функции.
 * Функция определяет некоторое действие.
 * В Kotlin функция объявляется с помощью ключевого слова fun,
 * после которого идет название функции.
 * Затем после названия в скобках указывается список параметров.
 * Если функция возвращает какое-либо значение,
 * то после списка параметров через запятую
 * можно указать тип возвращаемого значения.
 * И далее в фигурных скобках идет тело функции.
 *
 * Функции можно определять в файле вне других функций или классов,
 * сами по себе, как например, определяется функция main.
 * Такие функции еще называют функциями верхнего уровня (top-level functions).
 *
 * По умолчанию все параметры функции равносильны val-переменным,
 * поэтому их значение нельзя изменить.
 *
 * Если функция не возвращает какого-либо результата,
 * то фактически неявно она возвращает значение типа Unit.
 * Этот тип аналогичен типу void в ряде языков программирования,
 * которое указывает, что функция ничего не возвращает.
 */
fun main() {
    hello()
    showMessage("Hello Kotlin")
    //аргументы по умолчанию
    displayUser("Tom", 23, "Manager")
    displayUser("Alice", 21)
    displayUser("Kate")
    //именованные аргументы(postgres)
    displayUser("Tom", position = "Manager", age = 28)
    displayUser(age = 21, name = "Alice")
    displayUser("Kate", position = "Middle Developer")
    //vararg - переменное кол-во параметров
    printStrings("1", "2", "3")
    //Оператор * (spread operator)
    printStrings(*arrayOf("1", "2", "3"))
    //Return - возвращаемое значение
    println(sumInt(4, 3))
    //Однострочные функции (single expression function)
    println(square(9))
    //Локальные функции
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
 * Однострочные функции (single expression function)
 * используют сокращенный синтаксис определения функции в виде одного выражения.
 * Эта форма позволяет опустить возвращаемый тип и оператор return.
 * fun имя_функции (параметры_функции) = тело_функции
 */
fun square(x: Int) = x * x

/**
 * Одни функции могут быть определены внутри других функций.
 * Внутренние или вложенные функции еще называют локальными.
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