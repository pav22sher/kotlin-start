package additional

/**
 * Функции расширения (extension function) позволяют добавить функционал
 * к уже определенным типам. При этом типы могут быть определены где-то
 * в другом месте, например, в стандартной библиотеке.
 *
 * В функциях расширения мы можем обращаться к любым общедоступным свойствам
 * и методам объекта, однако не можем обращаться к свойствам и методам
 * с модификаторами private и protected.
 *
 * Если функция расширения имеет ту же сигнатуру,
 * что и уже имеющаяся функция класса,
 * то компилятор просто будет игнорировать подобную функцию расширения.
 *
 * this - ссылка на текущий объект данного типа
 */
fun main() {
    val hello: String = "hello world"
    println(hello.wordCount('l'))
    println(hello.wordCount('o'))
    println(4.square())
    println(6.square())
}
fun String.wordCount(c: Char) : Int{
    var count = 0
    for(n in this){
        if(n == c) count++
    }
    return count
}
fun Int.square(): Int{
    return this * this
}