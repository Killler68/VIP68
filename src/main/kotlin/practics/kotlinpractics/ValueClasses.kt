package practics.kotlinpractics

@JvmInline
value class DisplayCatWeight(val value: Double) {
    private fun showCatWeight(weight: DisplayCatWeight) {
        println("Кот весит $weight")
    }

    fun setOnClickListener() {
        val murzikWeight = DisplayCatWeight(5.0)
        showCatWeight(murzikWeight)

    }

}

fun main() {
    val displayCatWeight = DisplayCatWeight(2.0)
    println(displayCatWeight.setOnClickListener())
}