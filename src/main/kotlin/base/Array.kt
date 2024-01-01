package base

fun main() {
    val numbers1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    for (number in numbers1) print("$number ")
    println()
    val numbers2 = Array(3, {5})
    for (number in numbers2) print("$number ")
    println()
    var i = 1;
    val numbers3 = Array(3, { i++ * 2})
    for (number in numbers3) print("$number ")
    println()
    println(2 in numbers3)
}