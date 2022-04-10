package practics.kotlinpractics.inheritance

open class Animal() {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10
    open fun makeNoise() {
        println("Животное издает звук")
    }

    open fun eat() {
        println("Животное ест")
    }

    open fun roam() {
        println("Животное скитается")
    }

    fun sleep() {
        println("Животное спит")
    }

}
