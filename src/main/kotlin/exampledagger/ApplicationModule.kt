package exampledagger

import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {

    @Provides
    fun providesTestString(
        number: Int
    ): String =
        "test string $number"

    @Provides
    fun provideInteger(): Int = 123
}