package practics.kotlinpractics.inheritance

class Mouse : Animal() {

    override val image = "gameOver.jpg"
    override val food = "cheese"
    override val habitat = "ground"

    override fun makeNoise() {
        println("пищит")
    }

    override fun eat() {
        println("Мышка ест $food")
    }

    }
