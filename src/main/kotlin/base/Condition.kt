package base

fun main() {
    //конструкция if может возвращать значение
    ex0(10, 20)
    //Конструкция when
    ex1(true)
    ex2(20)
    ex3(10)
    ex4(1, 2)
    ex5(100)
}

fun ex5(sum: Int = 100) {
    val rate = when (sum) {
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }
    println(rate)
}

fun ex4(a: Int, b: Int) {
    val a = 15
    val b = 6
    when {
        (a > 10) -> println("a больше 10")
        (b > 10) -> println("b больше 10")
        else -> println("и a, и b меньше или равны 10")
    }
}

private fun ex3(range: Int = 10) {
    when (range) {
        in 10..19 -> println("a в диапазоне от 10 до 19")
        in 20..29 -> println("a в диапазоне от 20 до 29")
        !in 10..20 -> println("a вне диапазона от 10 до 20")
        else -> println("неопределенное значение")
    }
}

private fun ex2(varible: Int = 10) {
    var result = varible
    when (varible) {
        1, 2 -> {
            println("a = 1 or 2")
            result *= 1
        }

        10 -> {
            println("a = 10")
            result *= 2
        }

        20 -> {
            println("a = 20")
            result *= 5
        }

        else -> {
            println("неопределенное значение")
        }
    }
    println(result)
}

private fun ex1(isEnabled: Boolean = false) {
    when (isEnabled) {
        false -> println("isEnabled off")
        true -> println("isEnabled on")
    }
}

private fun ex0(a: Int = 1, b: Int = 2) {
    val c = if (a > b || a == b) {
        println("a = $a")
        a
    } else {
        println("b = $b")
        b
    }
    println("c = $c")
}