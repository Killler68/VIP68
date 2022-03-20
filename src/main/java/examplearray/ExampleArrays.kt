package main.java.examplearray

import main.java.examplearray.models.City
import main.java.examplearray.models.User

object ExampleArrays {

    const val TAMBOV = "tambov"
    const val MOSCOW = "moscow"
    const val KIEV = "kiev"
    const val TULA = "tula"

    @JvmStatic
    fun getUsers(): MutableList<User> = mutableListOf(
        User(0, "denis", 17, City(KIEV)),
        User(1, "oleg", 20, City(TAMBOV)),
        User(2, "anton", 10, City(TAMBOV)),
        User(3, "andrey", 22, City(MOSCOW)),
        User(4, "bogdan", 23, City(KIEV)),
        User(5, "maxim", 19, City(TAMBOV)),
        User(6, "danil", 25, City(TULA)),
        User(7, "dasha", 22, City(MOSCOW)),
        User(8, "vadim", 32, City(TAMBOV)),
        User(9, "yulia", 26, City(TULA)),
        User(10, "nadezhda", 52, City(KIEV)),
        User(11, "vanya", 24, City(TAMBOV)),
        User(12, "maxim", 12, City(TULA))
    )
}