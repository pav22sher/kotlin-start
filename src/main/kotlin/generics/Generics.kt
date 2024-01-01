package generics

/**
 * ¬ариантность описывает, как обобщенные типы,
 * типизированные классами из одной иерархии наследовани€,
 * соотнос€тс€ друг с другом.
 *
 * »нвариантность предполагает, что, если у нас есть классы
 * Base - базовый класс и Derived - производный класс от Base,
 * то класс C<Base> дл€ —<Derived> не €вл€етс€ ни базовым классом, ни производным.
 *
 *  овариантость предполагает, что, если у нас есть классы
 * Base - базовый класс и Derived - производный класс от Base,
 * то класс SomeClass<Base> €вл€етс€ базовым классом дл€ SomeClass<Derived>.
 * ќбобщени€ определ€етс€ с ключевым словом out - €вл€етс€ ковариантным
 * out - указывает, что значение может вернутьс€ из функции.
 *
 *  онтравариантность предполагает, что, если у нас есть классы
 * Base - базовый класс и Derived - производный класс от Base,
 * то объекту SomeClass<Derived> мы можем присвоить значение SomeClass<Base>.
 * ќбобщени€ определ€етс€ с ключевым словом in - €вл€етс€ контравариантным
 * in - указывает, что значение может приниматьс€ как параметр функции.
 */
fun main() {
    println(getBiggest(2, 5))

    display("Hello Kotlin")
    display(1234)

    val tom1: Person<Int> = Person(367, "Tom")
    println("${tom1.id} - ${tom1.name}")
    val bob1: Person<String> = Person("A65", "Bob")
    println("${bob1.id} - ${bob1.name}")

    val tom2 = Person(367, "Tom")
    println("${tom2.id} - ${tom2.name}")
    val bob2 = Person("A65", "Bob")
    println("${bob2.id} - ${bob2.name}")
}

//параметр_типа: ограничений
fun <T> getBiggest(a: T, b: T): T where T: Comparable<T>, T: Number{
    return if(a > b) a else b
}

//обобщенна€ функци€
fun <T> display(obj: T){
    println(obj)
}

//обобщенный класс
class Person<T>(val id: T, val name: String)