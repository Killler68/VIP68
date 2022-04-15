package practics.kotlinpractics

import java.util.*

fun main() {
    val barsik: Cat = Cat("Барсик", 1100, "Британский")
    barsik.weight = 900
    println("Имя ${barsik.name} вес ${barsik.weight} Порода ${barsik.breed}. ${barsik.name}  идет ${barsik.sleep()}")

    println(barsik.cat())

    println(manul.name)
    val redCat: RedCat = RedCat("Рыжик", 3, "МейнКун")
    println("${redCat.breed} ${redCat.sleep()}")
    val blackCat: BlackCat = BlackCat("", 4, "Шотландец")
    println(blackCat.name)
    val random = Random()
    println(random.nextInt(100))
val a = Person("Tom")

}

class Cat(val name: String, var weight: Int, val breed: String) {
    fun sleep(): String {
        return if (weight <= 3) {
            "спать"
        } else {
            "храпеть"
        }
    }

    fun cat() {
        val cats = arrayOf(
            Cat("Тимоша", 900, "Персидский"),
            Cat("Черныш,", 1000, "Британский")
        )
    }
}


class WildCat(nameParam: String, weight_param: Int, _breed: String) {
    val name = nameParam // Как лучше испольвать 3 вида
    var weight = weight_param
    val breed = _breed
}

val manul = WildCat("Manulik", 3500, "Uknown")

class RedCat(val name: String, var weight: Int, breedParam: String) {
    var activities = arrayOf("play")
    fun sleep(): String {
        return if (weight < 1000) {
            "Сопит "
        } else {
            " Храпит "
        }

    }

    val breed = breedParam.toUpperCase()

}

class BlackCat(val name: String, var weight: Int, val breedParam: String) {
    init {
        println("Котейка $name хочет играть")
    }

    var activities = arrayOf("Plays")
    val breed = breedParam.toLowerCase()

    init {
        println("порода $breed весом ")
    }

}




