package function

/**
 * В Kotlin все является объектом, в том числе и функции.
 * И функции, как и другие объекты, имеют определенный тип.
 * Тип функции определяется следующим образом:
 * (типы_параметров) -> возвращаемый_тип
 */
fun main() {
    // тип функции
    val message: () -> Unit
    message = ::helloKotlin
    message()
    // функции высшего порядка
    displayMessage(::morning)
    displayMessage(::evening)
    val action = selectAction(1)
    println(action(8, 5))
    // анонимные функции
    val hello = fun() = println("Hello")
    hello()
    // Лямбда-выражения
    val helloKotlin: ()->Unit = {println("Hello Kotlin")}
    helloKotlin()
    val sq: (Int) -> Int = {it*it}
    println(sq(5))
    // trailing lambda
    doOperation(3, 4, {a, b -> a * b})
    doOperation(3, 4) {a, b -> a * b}
}

fun helloKotlin() {
    println("Hello Kotlin")
}

fun displayMessage(function: () -> Unit) {
    function()
}

fun morning() {
    println("Good Morning")
}

fun evening() {
    println("Good Evening")
}

fun selectAction(key: Int): (Int, Int) -> Int {
    // определение возвращаемого результата
    when (key) {
        1 -> return ::sum
        2 -> return ::subtract
        3 -> return ::multiply
        else -> return ::empty
    }
}

fun empty(a: Int, b: Int): Int {
    return 0
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

/**
 * trailing lambda
 * Если параметр, который принимает функцию, является последним в списке,
 * то при передачи ему лямбда-выражения,
 * саму лямбду можно прописать после списка параметров.
 */
fun doOperation(x: Int, y: Int, op: (Int, Int) ->Int){
    val result = op(x, y)
    println(result)
}