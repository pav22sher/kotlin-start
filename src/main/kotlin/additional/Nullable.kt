package additional

fun main() {
    //Nullable тип
    var name : String? = null
    val random = (0..10).random()
    println(random)
    if(random > 5) name = "Pavel"
    //elves - оператор
    val length1 = name?.length ?: 0
    println(length1)
    //!! (not-null assertion operator) - мамай клянусь не null
    val length2 = name!!.length
    println(length2)
}