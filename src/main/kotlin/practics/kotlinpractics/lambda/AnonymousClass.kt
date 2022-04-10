package practics.kotlinpractics.lambda


fun main() {
    val anonymousClass = AnonymousClass()
anonymousClass.ma()

}

class AnonymousClass {
    fun ma() {
        var ob = {
            var x1 = 10
            var x2 = 20
            var str = "hello"
            fun sum(): Int {
                return x1 + x2
            }
        }
    }
}