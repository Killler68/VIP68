package practics.kotlinpractics

interface Clickable {
    fun click()
    fun meow() = println("Я мяукаю")
}
interface FocusSable {
    fun setFocus(b: Boolean) = println("I ${if (b)"got" else "lost"} focus. ")
    fun meow() = println("Я рычу Р-р-Р-р!!")

}
interface Roamable{
    val velocity: Int
    get() = 10
}
class Button : Clickable, FocusSable, Roamable {
    override fun click() = println("hello")
    override fun meow() {
        super<Clickable>.meow()
        super<FocusSable>.meow()
    }

    override val velocity: Int
        get() {
           return  5
        }

}

fun main() {
    val a: Button = Button()
    println( a.meow())
    println(a.velocity)
}