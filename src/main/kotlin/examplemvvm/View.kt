package examplemvvm

fun main() {
    View().init()
}

class View {

    private val model: Model = Model()
    private val viewModel: ViewModel = ViewModel(model)

    fun init() {
        viewModel.data.subscribe(::showData)

        viewModel.loadData()
    }

    private fun showData(data: List<String>) {
        data.forEach {
            println(it)
        }
    }
}

