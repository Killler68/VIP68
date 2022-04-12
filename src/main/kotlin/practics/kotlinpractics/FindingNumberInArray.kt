package practics.kotlinpractics

fun main() {

    val array = intArrayOf(1, 2, 4, 6, 8, 9, 11, 42, 53, 1, 4, 6, 5)
    val num = 3
    var found = false
    for (x in array) {
        if (x == num) {
            found = true
            break
        }
    }
    if (found) println("Значение найдено")
    else println("Такого значения нет")

}