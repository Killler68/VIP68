package practics.kotlinpractics

fun main() {
    println( hasPrefix("prefix"))//все кроме prefix выдает false
    val x = 3
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        3 -> print("x == 3")
        else -> {
            print("x не равен ни 1, ни 2, ни 3")
        }
    }
    when (x) {
        1, 2 -> print("x == 1 или 2")
        3 -> print("x == 3")
        else -> print("otherwise")
    }
    val s = 5
    when (x) {
        s -> print("s encodes x")
        else -> print("s does not encode x")
    }
    when (x) {
        in 1..5 -> print("yes")
        !in 10..15 -> {
            print("Не входит")
        }
        else -> {
            print("Нет такого")
        }
    }
//    when {
//        x.isOdd() -> print("x is odd")
//        y.isEven() -> print("y is even")
//        else -> print("x+y is odd")
//    }


}
fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false

}


