package practics.kotlinpractics

import practics.kotlinpractics.inheritance.Animal

open class Canine : Animal() {
    override fun roam() {
        println("Животные класса волчьих скитаются")
    }
}

class Wolf : Canine() {
    override val image = "rosa.png"
    override val food = "мясо"
    override val habitat = "лес"

    override fun makeNoise() {
        println("Воет уУУУУууу!!!")
    }

    override fun eat() {
        println("Волк ест $food")
        val wolf = Wolf()
        wolf.makeNoise()
    }
}