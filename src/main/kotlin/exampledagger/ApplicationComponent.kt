package exampledagger

import dagger.Component

@Component(modules = [
    ApplicationModule::class
])
interface ApplicationComponent {

    fun getTestString(): String
}

