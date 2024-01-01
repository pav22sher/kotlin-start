package additional

fun main() {
    try {
        println(checkAge(5))
        println(checkAge(-115))
    }
    catch (e: Exception){
        println(e.message)
    }
}
fun checkAge(age: Int): Int{
    if(age < 1 || age > 110) throw  Exception("Invalid value $age. Age must be greater than 0 and less than 110")
    println("Age $age is valid")
    return age
}