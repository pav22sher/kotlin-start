package additional

fun main() {
    val s: String = "12"
    val d: Int = s.toInt()
    println(d)

    toString("Hello")
    toString(123)

    toStringMsg("Hello")
    toStringMsg(123)

    //явные преобразования
    val hello: String? = "Hello Kotlin"
    val message: String = hello as String
    println(message)
}

fun toString(msg: Any) {
    if (msg is String) {
        println("String: $msg")
    } else {
        println("Any ${msg}")
    }
}

fun toStringMsg(msg: Any) {
    val message = msg as? String
    if (message != null) {
        println("is String")
    } else {
        println("is not a String")
    }
}