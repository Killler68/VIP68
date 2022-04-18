package practics.kotlinpractics

fun main() {
    listsOf()
    val myCats = MyHappyCat("", 1, 1)
    myCats.myCat()
    myCats.myHappyCat()
    myCats.mySmallCat()
}

//------------listOf--------------------
fun listsOf() { // неизменяемый список
    val list = listOf("Перчик", 3, 9)
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf("Пушистик", "Огонек", "Рыжик")
    //  println(list.javaClass)//class java.util.Arrays$ArrayList
    println(list)
    println(list[1])
    val cats: List<String> = listOf("Барсик ", "Снежок ", "Окорочек ")
    val readOnlyCats = cats.toList()
    println(readOnlyCats.first())//выводит Барсик
    println(readOnlyCats)
    println(cats.get(2))// выводит ArrayIndexOutOfBoundsException если неправильно указан индекс
    println(cats.getOrElse(4) { "Неизвестный котик" })
    println(cats.getOrElse(4) { cats.first() })
    val cat = cats.getOrNull(4) // вернет null если не правильно указан индекс
    println(cat)
    for (i in cats) println(i)
    val map = list1.map { it * it }//переумножение элементов
    println(map)
    println(list1.any { it % 2 == 0 })//true хотя бы 1 делится без остатка
    println(list1.any { it > 10 }) //false ниодно число не больше 10
    println(list1.all { it % 2 == 0 })//false не все делятся без остатка
    println(list1.all { it < 7 })//true все числа меньше 7
    // println(list1.fold{ total, next -> total + next})
    list1.forEach { print(it) }// 12345
    val numberAndCount = hashMapOf<String, Int>();
    for (i in list1) {
        val count = numberAndCount.get("hi");
        numberAndCount.put(i.toString(), 2)
        print(count)//много null
    }
    println(list1.maxOrNull())//5 or minOrNull
    println(list1.sumBy { it + 5 })// 40 прибавляет последнее значение(5)
    println(list1.drop(3))//отсекает все левее 3 элемента 4,5
    println(list1.dropLast(3))//наоборот, отсекает все правее 3 элемента 1,2 (3,4,5)
    println(list1.dropLastWhile { it > 3 })// идет до 3(значения элемента), после отсекает(еще 3 то идет дальше) 1,2,3
    println(list1.take(2))//взять первые 2 элемента 1,2
    println(list1.takeLast(2))//взять последние 2 элемента 4,5
    println(list1.takeLastWhile { it > 3 })//числа больше 3    4,5  (takeWhile) обратная
    list2.takeIf {// Не выбирать элементы, если список содержит Пушистика
        it.contains("Пушистик")//в list2 пушистик отсутствует
    }.apply {
        this?.forEach {
            print("$it ")
        }
    }//                 list2.takeUnless    Выбрать элементы, если список не содержит Пушистика

}

class MyHappyCat(val name: String, val age: Int, val weight: Int) {
    fun myCat() {
        val myCats = listOf(
            MyHappyCat("Пушок", 2, 4),
            MyHappyCat("Бесятышь", 3, 5),
        )
        val associatedMap = myCats.associate { Pair(it.name, it.age) }
        println("\n$associatedMap")//строка ключ значение число
        val originalMap = mutableMapOf<String, Int>()
        myCats.associateTo(originalMap) { it.name to it.weight }
        println(originalMap)
        println(myCats.map(MyHappyCat::name))// выводит только имена
        println(myCats.map { it.age })//тоже самое только возраст
        println(myCats.filter { it.weight > 4 }.map { it.name })// Бесятышь
        // println(myCats.maxByOrNull(MyHappyCat ::weight ))
        println(myCats.sumOf { it.age * it.weight })// 2*4+3*5(работает и с разными типами элементов(Double+Int))
    }

    fun myHappyCat() {
        val result = listOf(listOf(1, 2, 3), listOf(4, 5, 6)).flatMap { it }
        println(result)
        println(result.all { it < 5 })//false  // все ли числа меньше 5
        println(result.none { it > 7 })// true не все числа больше 7
        println(result.count { it < 5 })// число элементов в списке соответствующие условию
        val dogs = listOf("Догги", "Мухтар", "Солнышко")
        dogs.forEachIndexed { index, value
            ->
            println("В позиции $index содержится $value")
        }
    }

    fun mySmallCat() {
        val cat = listOf(1, 2, 3, 4, 5)
        val cat1 = listOf("Пушистик", "Огонек", "Рыжик")
        println(cat.filter { it > 3 })// 4 5
        println(cat.filter { it % 2 == 0})// четные числа 2 4
        println(cat1.filter { it[3] == 'и' })// Пушистик Рыжик


    }
}
