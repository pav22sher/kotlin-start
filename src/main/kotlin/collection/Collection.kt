package collection

/**
 * Kotlin не имеет собственной библиотеки коллекций
 * и полностью полагается на классы коллекций, которые предоставляет Java.
 * В то же время эти коллекции в Kotlin расширяются дополнительными возможностями.
 *
 * В Kotlin коллекции разделяются на изменяемые (mutable) и неизменяемые (immutable) коллекции.
 * Mutable-коллекция может изменяться, в нее можно добавлять,
 * в ней можно изменять, удалять элементы.
 * Immutable-коллекция также поддерживает добавление, замену и удаление данных,
 * однако в процессе подобных операций коллекция будет заново пересоздаваться.
 */
fun main() {
    //List - представляет последовательный список объектов.
    val numbers0: MutableList<Int> = mutableListOf(5, 6, 7)
    numbers0.add(12)
    numbers0.add(0, 23)
    numbers0.addAll(0, listOf(-3, -2, -1))
    numbers0.removeAt(0)
    numbers0.remove(5)
    for (n in numbers0) {
        print("$n ")
    }
    val numbers1: ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5)
    numbers1.add(4)
    for (n in numbers1) {
        print("$n ")
    }
    //Set - неупорядоченный набор уникальных объектов
    val people = setOf("Tom", "Sam", "Bob", "Mike")
    val employees = setOf("Tom", "Sam", "Kate", "Alice")
    println(people.union(employees))
    println(people.intersect(employees))
    println(people.subtract(employees))
    val set1: HashSet<Int> = hashSetOf(5, 6, 7)
    val set2: LinkedHashSet<Int> = linkedSetOf(25, 26, 27)
    val set3: MutableSet<Int> = mutableSetOf(35, 36, 37)
    //Map - пара ключ-значение (не расширяет интерфейс Collection)
    val maps = mapOf(1 to "Tom", 5 to "Sam", 8 to "Bob")
    for(map in maps){
        println("${map.key} - ${map.value}")
    }
    println(maps)
    val linkedMap = linkedMapOf(220 to "Tom", 225 to "Sam", 228 to "Bob")
    val hashMap = hashMapOf(220 to "Tom", 225 to "Sam", 228 to "Bob")
}