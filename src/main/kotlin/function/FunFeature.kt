package function

/**
 * � Kotlin ��� �������� ��������, � ��� ����� � �������.
 * � �������, ��� � ������ �������, ����� ������������ ���.
 * ��� ������� ������������ ��������� �������:
 * (����_����������) -> ������������_���
 */
fun main() {
    // ��� �������
    val message: () -> Unit
    message = ::helloKotlin
    message()
    // ������� ������� �������
    displayMessage(::morning)
    displayMessage(::evening)
    val action = selectAction(1)
    println(action(8, 5))
    // ��������� �������
    val hello = fun() = println("Hello")
    hello()
    // ������-���������
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
    // ����������� ������������� ����������
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
 * ���� ��������, ������� ��������� �������, �������� ��������� � ������,
 * �� ��� �������� ��� ������-���������,
 * ���� ������ ����� ��������� ����� ������ ����������.
 */
fun doOperation(x: Int, y: Int, op: (Int, Int) ->Int){
    val result = op(x, y)
    println(result)
}