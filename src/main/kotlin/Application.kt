private const val MAIN = "main"
private val ARGS = arrayOf("")

object Application {
    fun start(clazz: Class<*>) {
        //TODO: починить кодировку
        val main = clazz.methods.find { it.name == MAIN }
        main?.invoke(null, ARGS)
    }
}