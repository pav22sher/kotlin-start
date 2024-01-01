package oop

fun main() {
    val day: Day = Day.FRIDAY
    println(day.name)
    println(day.ordinal)
    println(day.value)
    println(Day.MONDAY.value)
    println(day.getDuration(Day.MONDAY))
}

enum class Day(val value: Int){
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(100500), //trailing comma - конечная запятая
    ;
    fun getDuration(day: Day): Int{
        return value - day.value;
    }
}