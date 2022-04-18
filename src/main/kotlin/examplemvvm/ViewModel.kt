package examplemvvm

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.BehaviorSubject

class ViewModel(
    private val model: Model,
    private val model1: Model1

) {

    private val _data: BehaviorSubject<List<String>> = BehaviorSubject.create()
    val data: Observable<List<String>> get() = _data

    fun loadData() {
        val data = model.getData()
        val data1 = model1.getData1()

        _data.onNext(data)
        _data.onNext(data1)

    }
}