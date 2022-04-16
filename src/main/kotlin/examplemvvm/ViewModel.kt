package examplemvvm

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.BehaviorSubject

class ViewModel(
    private val model: Model
) {

    private val _data: BehaviorSubject<List<String>> = BehaviorSubject.create()
    val data: Observable<List<String>> get() = _data

    fun loadData() {
        val data = model.getData()

        _data.onNext(data)
    }
}