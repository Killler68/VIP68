package practics.kotlinpractics


fun main() {
    println(add(2, 4)) //6
    hey()// Hello
    println(any(3, 5)) // 5
    println(sayHello("Andrey", "Nikita")) // Andrey Nikita
    println(sayHello(helloTwo = "Maksim", helloOne = "Denis")) // Denis Maksim
    println(all())// группировка по 2
    (al())// тоже группировка по 2
    sayHey("kitty")
    forAr()
    forArray()
    arrayInt()
doIt("Kitty")
    // вызываем функцию
    getCat("barsik") // BARSIK12
    getCat("vaska")  // VASKA10
}

fun add(x: Int, y: Int): Int {
    return x + y
}

fun hey() {
    return println("Hello")
}

fun any(a: Int, b: Int): Int {
    return if (a > b) a
    else b
}
// fun any(a: Int, b: Int) = if( a > b) a  else  b // тоже что и выше

fun sayHello(helloOne: String, helloTwo: String): String {
    return "Здравствуй $helloOne $helloTwo"
}
// -----------------МАССИВЫ---------------------------------------------------------
fun all(): List<List<Int>> {
    val valuesToAdd = listOf(18, 73, 44, 6, 33, 22, 7, 5)
    return valuesToAdd.chunked(2)
}

fun al() {
    val valuesToAdd = listOf(8, 3, 4, 6, 3, 2, 7)
    val split = valuesToAdd.withIndex().partition { it.index % 2 == 0 }
    return println(split.first.zip(split.second) { a, b -> listOf(a.value, b.value) })
}

fun sayHey(name: String) = println("Hello $name")
// -----------------ЦИКЛЫ----------------------------------------------------------
fun arra(): Array<Int> {
    return arrayOf(5, 4, 3, 2, 1)
}
fun forArray() {
    for (i in arra())
        println("Индекс $i")
}

fun forAr() {
    val myArray = arrayOf(1, 2, 3, 4, 5)
    for (i in myArray) {
        println("$i ")

    }
}
fun printNumber(vararg integer: Int) { //VARARG
    for (num in integer) {
        print("Число $num ")
    }
}
fun arrayInt() {
    val a: IntArray = intArrayOf(6, 7, 8, 9, 10)
    return printNumber(1, 2, 3, 4, 5, *a)
}
// --------------------ВЛОЖЕННЫЕ ФУНКЦИИ------------------------------------------
fun doIt(param: String) {
    fun justDoIt(innerParam: String): String {
        return innerParam
    }
    println("\n${param.uppercase()} + ${justDoIt("hello")}")
}

fun getCat(name: String){

    fun makeStrange(): Int {
        return name.length * 2
    }

    println(name.uppercase() + makeStrange())
}
// ------------------------------------------------------------------------------

