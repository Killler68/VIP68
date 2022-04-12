package practics.kotlinpractics.lambda

fun main() {
    game()
}

fun game() {
    val hey: (String) -> String =
        { catName ->
            val year = 2019
            "$catName! Добро пожаловать $year"
        }
    println(hey("hello"))

    val hi: () -> String =
        {
            val year = 2019
            "Добро  $year"
        }
    println(hi())
}