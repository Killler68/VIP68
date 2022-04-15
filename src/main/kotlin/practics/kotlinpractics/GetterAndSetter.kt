package practics.kotlinpractics

class Dog(val name: String, var weigth: Int,  breedParam: String) {
    val activities = arrayOf("player")
    val breed = breedParam.toUpperCase()
    val weigthInGramms: Int
        get() = weigth * 1000

    fun sleep() = println(if (weigth < 3) "Спит" else "Храпит ")

}

fun main() {
    val dog = Dog("BigBoy", 28, "Дворовый")
    val myDog = MyDog("Baby", 41, "Мастиф")
    println("${dog.weigthInGramms} грамм")
    //  dog.weigthInGramms = 1000 нет для него set
    println(myDog.weigthInGramm)
    myDog.weigthParam = 40000
    println(myDog.weigthParam)
    val rectangle = Rectangle(10,20)
    println(rectangle.isSquare)//false 10 не равно 20
}

class MyDog(val name: String, var weigthParam: Int, val breedParam: String) {
    private var weigth = weigthParam
        set(value) {
            if (value > 0) field = value
        }
    val weigthInGramm: Int
        get() = weigth * 1000
}

class Rectangle(val width: Int, val height: Int) {
    val isSquare: Boolean
        get() {
            return width == height
        }
//    get() = width == height или так

}