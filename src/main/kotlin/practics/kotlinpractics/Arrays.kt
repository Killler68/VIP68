package practics.kotlinpractics

import java.util.regex.Pattern

fun main() {
    println(countLetters("AAAXXXXCCCCCFFFFFFFFGGGGGAAACVBDDHDBDDCCNHAAHH"))
}

fun countLetters(str: String): String {
    var currentLetter = str[0]//переменная первой буквы в строке
    var count = 1//переменная счетчик
    var result = ""// переменная результат с пустой строкой, после добавляем значение и возвращаем его

    for (letter in str.substring(1)) {// итерирование по строке с возвращением подстроки
        if (currentLetter == letter) {// если первая буква равняется второй букве
            count++// то увеличиваем счетчик

        } else {// если буква другая то сменяем ее
            if (count == 1)
                result += currentLetter
            else//
                result += "$currentLetter$count"
            count = 1// сбрасывания переменной счетчик
            currentLetter = letter
        }
    }
    if (count == 1)//последние буквы
        result += currentLetter
    else result += "$currentLetter$count"

    return result//
}




