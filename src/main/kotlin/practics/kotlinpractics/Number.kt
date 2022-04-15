package practics.kotlinpractics

fun main() {
    num()

}

fun num() {
    val number = 1..17
    for (i in number) {
        if (i % 2 == 0) {
            println("Число   четное $i")
        } else {
            println("Число нечетное $i")
        }
    }
}