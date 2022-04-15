package practics.kotlinpractics


fun main() {

    val tom: Person = Person("Tom")
    val bob: Person = Person("Bob", 45)

    println("Name: ${tom.name}  Age: ${tom.age}")
    println("Name: ${bob.name}  Age: ${bob.age}")
}

class Person(_name: String) {
    val name: String = _name
    var age: Int = 0

    constructor(_name: String, _age: Int) : this(_name) {
        age = _age
    }
}

class Cats constructor(name: String, var weight: Int, val breed: String) {
    var name: String

    init {
        this.name = name
    }

    fun sleep() {
        println("Котейка спит")
    }
}

class WhiteCat(name: String, var weight: Boolean = true) {
    val cat = WhiteCat("Барсик")
}

open class RadCat(val name: String) { //суперкласс
    val x = 10
}

class SeaRedCat(name: String) : RadCat(name) {
    val a = 5
}

//----------------ВТОРИЧНЫЕ КОНСТРУКТОРЫ-----------------------------
class MyCat(var name: String, var age: Int, var address: String) {
    var email: String = ""

    constructor(name: String, age: Int, address: String, email: String) : this(name, age, address) {
        this.email = email
    }

    var vaska1 = MyCat("Васька", 7, "Tambov", "@mail.ru")
    var vaska2 = MyCat("Васька", 7, "Tambov")


}
