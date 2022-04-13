package practics.kotlinpractics


fun main() {
    println(One.cats.add("kirry"))
    One.callCat()
    Something.bar()
    println(Something.age)
    println(Something.dog.a)

}

object One {
    const val a = 10
    val cats = arrayListOf<String>()
    fun callCat() {
        for (cat in cats) {

        }
    }

}

class Something {
    companion object {
        @JvmField
        val dog = One
        const val age = 11
        fun bar() {
            println("Hey")
        }
    }
}
