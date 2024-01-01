package oop

/**
 * ¬ Kotlin есть следующие модификаторы видимости:
 * private - видны внутри класса или файла
 * protected - видны внутри класса и классов наследников
 * internal - видны внутри модул€
 * public - видны везде
 */
fun main() {
    var person: Person = Person()
    person = Person("Pavel")
    person = Person("Pavel", 26)
    println(person.name)
    println(person.age)
    person.sayHello()
    val employee = Employee("o-code")
    employee.printCompany()
    employee.sayHello()
}

//мб один первичный конструктор (primary constructor)
//мб один или несколько вторичных конструкторов (secondary constructor)
open class Person() {
    //primary constructor
    var name: String = "Undefined"
    var age: Int = 18
        set(value) {
            println("Call setter")
            if ((value > 0) and (value < 110)) {
                field = value
            }
        }
        get() {
            println("Call getter")
            return field
        }

    //secondary constructor
    constructor(_name: String, _age: Int = 18) : this() {
        name = _name
        age = _age
    }

    //блок инициализации
    init {
        println("init")
    }

    open fun sayHello() {
        println("Hello, my name is $name")
    }
}

//Ќаследование
class Employee(val company: String) : Person() {
    fun printCompany() {
        println(company)
    }
    override fun sayHello() {
        println("Hello employee, my name is $name")
    }
}