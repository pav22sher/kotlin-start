package base

fun main() {
    //Диапазоны
    for (n in 1..9) {
        print("$n ")
    }
    println()
    for (n in 9 downTo 1) {
        print("$n ")
    }
    println()
    for (n in 1..<9 step 2) {
        print("$n ")
    }
    println()
    for (n in 1..<9) {
        if (n in 1..5) print("$n ")
    }
}