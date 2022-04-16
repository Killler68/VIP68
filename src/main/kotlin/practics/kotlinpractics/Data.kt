package practics

fun main() {

    val cat = Cat("", 4)
    cat.whiteCat()// Cat(name=Черныш, age=3)
    blackCat()
    hashCodes()
    println(cat6)
    println("$title $author")



}

data class Cat(var name: String, var age: Int) {
    fun whiteCat() {
        val cat = Cat("Черныш", 3)
        println(cat)
    }
}

data class Kitten(
    var name: String,
    var lives: Int = 9
)

fun blackCat() {
    val murzik = Kitten("Murzik")
    println(murzik.lives)// 9
    val barsik = Kitten("Barsik", 8)
    println(barsik.lives)// 8
    println(murzik == barsik)//true //     println(murzik.equals(barsik))
    println(murzik === murzik)//true
}

// ----------hashCode()-------------------
data class Cats(var name: String, var age: Int)

val cat1 = Cats("Тимоша", 4)
val cat2 = Cats("Тимоша", 4)
val cat3 = Cats("Тимоша", 9)


fun hashCodes() {
    println(cat1.hashCode())//Cats(name=Тимоша, age=4)
    println(cat2.hashCode())
    println(cat3.hashCode())
    println(cat3)
    println(cat1)

}

// ---------------Copy()-------------------
data class Kitty(var name: String, var age: Int)

val cat4 = Kitty("Мурзик", 7)
val cat5 = Kitty("Богатырь", 6)
val cat6 = cat4.copy(age = 3)//поменял возраст

//--------------Destructive assignment(component)------------
data class Music(val title: String, val author: String)

val music = Music("Калинка", "Abba")
val title = music.component1()
val author = music.component2()
//val title = music.title
//val author = music.author

//data class RedCat(val name: String, val age: Int, val city: String)
//val redCat = RedCat("Пушистик", 4, "Moscow")
//val (catName, catAge, place) = RedCat
//println(catName)
//println(catAge)
//println(place)

//------------Multiple Constructors------------------------
data class Dog(val name: String) {
    var age = 0
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }
}
data class Dogs @JvmOverloads constructor(val name: String, val age: Int? = 0) {

}




