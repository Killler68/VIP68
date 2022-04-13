package practics.kotlinpractics.lambda

import java.util.Scanner

fun main() {
    games()
    charNumber()
    //println(messageNum())
    println(an())
}

fun games() {
    val messageNum: (String) -> String =
        {
            val year = 2021
            "$it! Добро пожаловать в $year"
        }
    println(messageNum("Hello"))


}

fun charNumber() {
    val charNum = "Пушок".count { it -> it == 'у' }
    println(charNum)

}
//fun messageNum(): Pair<Int?, String?> { //TODO(Поменять цикл на nextInt)
//    val a = Scanner(System.`in`)
//    var age: Int? = null
//    println("Введите число ")
//    var name: String? = null
//        a.nextInt() = {
//        name = if (i < 5.toString()) "года" else "лет"
//        age = i.toInt()
//        break
//    }
//    return Pair(age, name)
//}
//a.nextInt() = {

//fun messageNum(): Pair<Int?, String?> {
//    val a = Scanner(System.`in`)
//    var age: Int? = null
//    println("Введите число ")
//    var name: String? = null
//    val c = a.nextInt()
//    val num: (String) -> Unit =
//        {
//            name = if (c < 5) "года" else "лет"
//            age = c
//        }
//
//    return Pair(age, name)
//}


fun an(): String {
    val num = messageNum()

    val messageFunction: (String, Int?) -> String =
        { catName, age ->
            val year = 2022
            "$catName! Добро пожаловать в $year. Тебе в этом $year году исполнилось $age ${num.second}"
        }
    return messageFunction("Уголек", num.first)

}

fun messageNum(): Pair<Int?, String?> { //TODO(Поменять цикл на nextInt)
    val a = Scanner(System.`in`)
    var age: Int? = null
    println("Введите число ")
    var name: String? = null
    for (i in a) {
        name = if (i < 5.toString()) "года" else "лет"
        age = i.toInt()
        break
    }
    return Pair(age, name)
}