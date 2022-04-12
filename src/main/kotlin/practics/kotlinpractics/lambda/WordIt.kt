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

fun messageNum(): String {
    val a = Scanner(System.`in`)
    println("Введите число ")
    for (i in a) {
        return if (i < 5.toString()) {
            "года"
        } else {
            "лет"
        }
    }
    return a.toString()
}


fun an(): String {
    val messageFunction: (String, Int) -> String =
        { catName, age ->
            val year = 2022
            "$catName! Добро пожаловать в $year. Тебе в этом $year году исполнилось $age ${messageNum()}"
        }
    return messageFunction("Уголек", 4)

}

