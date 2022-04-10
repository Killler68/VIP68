package practics


fun main() {
    println("--------------Начало------------------------------------------------------------------------------")

    val test1: String = "Hello"
    val a = 30
    val b = 10
    var test2 = "Hi"
    test2 = "Hey"
    println(test2 + "kyky $test1")
    println(" сумма ${2 + 2} + и разность ${a - b}")
    println("--------------ЦИКЛЫ--------------------------------------------------------------------------------")
    val items = listOf("apple", "banana", "orange")
//mutableListOf("apple", "banana", "orange")

    for (item in items)
        println(item)
    //while
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }
    //Диапозоны (как в Python)
    println(5 in 3..10)//true

    for (i in 1..10)
        println(i)

    for (i in 1 until 10)
        println(i)

    for (i in 10 downTo 1)
        println(i)
    for (i in 0..100 step 10)
        println(i)
    println("---------ФУНКЦИИ------------------------------------------------------------------------------------")
    println(testSimple())
    println(testSIMPLE())
    println(hello(10, 15))
    println(testString(10, "Hey"))
    println(testNamedArguments(10, z = 15, y = 1))
    testDefaultArguments()
    testDefaultArguments(x = 15)
    printEven(5, 4, 6, 7, 8)
    printEven(*intArrayOf(1, 2, 3, 4, 5), 6, 7, 8, 9, 19)
    helloo()
    nulls()
    hello()
    testWhen(12)
    testWhen("hey")
    hi()
    lambda()
    hey()
    val p1 = Person("Tom", "Jones", 17)
    println(p1.firstName)
    val child = Person("Child", "Child", 10)
    val rectangle = Rectangle(10.0, 15.0)
    println(rectangle.perimeter)

}

fun testSimple(): Int {
    return 5 + 5
}

fun testSIMPLE(): Int = 5 + 5 // тоже самое

fun hello(x: Int, y: Int): Int = x + y

fun testString(x: Int, y: String): String {
    return "String is $x $y"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

fun testDefaultArguments(x: Int = 1, y: Int = 5) {
    println(x + y)
}

//вместо перегрузки
fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.toUpperCase() else name) + number
}

// vararg
fun printEven(vararg numbers: Int) { //целые числа
    numbers.forEach { e -> if (e % 2 == 0) println("vararg $e") }
}

fun helloo() {
    println("------------NULL--------------------------------------------------------------------------------")
}

fun nulls() {
    var a: String = "Hello"
    // a = null // NPE исключение
    println(a.length)
    var b: String? = "Test"
    b = null
    println(b)
    //b.length
    //Вернет длину b если null -> null(Никаких NPE!)
    b?.length // безопасный вызок
    // bob?.department?.head?.name -> null(никаких NPE!) если где то null то будет null

// Elvis оператор - ?:
//    val l = b?.length ?: -1 // если в b лежит строка то получаем длину если в b null то получаем -1
//    b = if ((0..10).random() > 5)"asdf" else null
//    // !! - выбрасывает NPE(null pointer exception
//    val t = b!!.length // выбрасывает null и будет ошибка

}

fun hello() {
    println("------------SWITCH--------------------------------------------------------------------------------")
}

fun testWhen(input: Any) {
    when (input) {
        1 -> println("Единица")
        2 -> println("Двойка")
        in 10..20 -> println("От 10 до 20")
        is String -> println("Была введена строка c длинной ${input.length}")
        else -> println("что то еще")

    }
}

fun hi() {
    println("------------LAMBDA--------------------------------------------------------------------------------")
}

fun lambda() {
    val a = listOf(1, 2, 3, 4, 5)
    a.forEach { e -> printEven(e) }
    println(a.map { e -> e * 2 })
    println(a.filter { e -> e % 2 == 0 }) // sum()
    println(a.reduce { sum, e -> sum + e })
    a.sortedByDescending { it } //it временная переменная
    a.any { it > 10 } // false
    a.all { it < 10 }
    a.sum()
    val numbers = listOf(1, 3, -4, 2, -11)
    val (positive, negative) = numbers.partition { it > 0 }
    println(positive)
    println(negative)
    val result = listOf("a", "b", "cc", "ad").groupBy { it.length }
    println(result) // HashMap или LinkedHashMap
}

fun hey() {
    println("------------HELLO--------------------------------------------------------------------------------")
}

class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() // ArrayList

    init {
        println("person is created $firstName")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person) :
            this(firstName, lastName, age) {
        children.add(child)

    }

    // конструктор без аргументов
    constructor() : this("Maksim", "Jonas", 15)


}

data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
    var test = 1
        get() = field + 1 // field == this (this.поле)
        set(value) {
            if (value < 0) println("negative value")
            field = value
        }

    fun area() = height + length
}
