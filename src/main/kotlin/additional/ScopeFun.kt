package additional

/**
 * Scope-������� - ������� ��������� - ��������� ���������
 * ��� ���������� ������� ��������� ��� � ���� ������-���������.
 * ��� ������ �������� �������, ��������� ��������� ������� ���������.
 * � ���� ������� ��������� ����� ���������� � ������� ��� ������������� ��� �����.
 *
 * � Kotlin ���� ���� �������� �������: let, with, run, apply � also.
 * ��� ������� ������ �� ������ �������� � ����������� ������ �����
 * �� ���������� � ������������ �����������
 */
fun main() {
    testLet()
    testWith()
    testRun()
    testApply()
    testAlso()
}

fun testAlso() {
    val tom = Person("Tom", null)
    tom.also {
        if(it.email==null) it.email = "${it.name.lowercase()}@gmail.com"
    }
    println(tom.email) // tom@gmail.com
}

/**
 * run - inline fun <T, R> T.run(block: T.() -> R): R
 */
fun testRun() {
    val tom = Person("Tom", null)
    val emailOfTom = tom.run {
        if (email == null) email = "${name.lowercase()}@gmail.com"
        email
    }
    println(emailOfTom) // tom@gmail.com
}

/**
 * with - inline fun <T, R> with(receiver: T, block: T.() -> R): R
 */
private fun testWith() {
    val tom = Person("Tom", null)
    val emailOfTom = with(tom) {
        if (email == null) email = "${name.lowercase()}@gmail.com"
        email
    }
    println(emailOfTom) // tom@gmail.com
}

/**
 * let - inline fun <T, R> T.let(block: (T) -> R): R
 */
private fun testLet() {
    val sam = Person("Sam", "sam@gmail.com")
    // ����� Email: sam@gmail.com
    sam.email?.let { println("Email: $it") }
    sam.email?.let(::printEmail)
    // ������ ��� ������� let
    //if(sam.email!=null) println("Email:${sam.email}")
    val tom = Person("Tom", null)
    // ������� let �� ����� �����������
    tom.email?.let { println("Email: $it") }
    tom.email?.let(::printEmail)
}

data class Person(var name: String, var email: String?)

fun printEmail(email: String) {
    println("Email: $email")
}

/**
 * apply - inline fun T.apply(block: T.() -> Unit): T
 */
private fun testApply() {
    val bob = Employee()
    bob.name("Bob").age(26).company("JetBrains")
    println("${bob.name} (${bob.age}) - ${bob.company}") // Bob (26) - JetBrains
}

data class Employee(var name: String = "", var age: Int = 0, var company: String = "") {
    fun age(_age: Int): Employee = apply { age = _age }
    fun name(_name: String): Employee = apply { name = _name }
    fun company(_company: String): Employee = apply { company = _company }
}