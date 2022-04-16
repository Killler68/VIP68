package practics.kotlinpractics

fun main() {
    mapsOf()
    mutableMaps()
    hashMapsOf()
    sortedMapsOf()
}

fun mapsOf() {  // создание не изменяемого map
    val map = mapOf(1 to "one", 3 to "three", 9 to "nine")
    val maps = mapOf("one" to 1, "three" to 3, "nine" to 9)
    /*  println(map.javaClass)// Вывод содержимого колекции (class java.util.LinkedHashMap)
      println(map)
      println(maps)
      println(maps.containsValue(1))//true
      println(maps.containsKey("one"))
      println(map.containsKey(1))
      println(map.containsValue("two"))//false
  */
    val number = map.getOrElse(2) { "No such number" }// выводит "No such ..." так как такого ключа не существует
    println(number)
    val num = map.getOrDefault(2, 0)// выводит 0
    println(num)

}

fun mutableMaps() {
    val map1 = mutableMapOf("one" to 1, "three" to 3)
    println(map1.getValue("one"))//1
    println(map1["three"])//3
    for ((key, value) in map1) {
        println("Ключ $key, значение $value")
    }
    println(map1.mapValues { it.key.toUpperCase() })// делает значения большими буквами

    val currencyMutableMap: MutableMap<String, String> = mutableMapOf(
        "Гривна" to "Украина", "Доллар " to "США",
        "Рубль" to "Россия"
    )
    println("Страны: ${currencyMutableMap.values}")
    println("Валюты: ${currencyMutableMap.keys}")
    currencyMutableMap.put("Йен", "Япония")//      currencyMutableMap["Йен"] = "Япония" тоже самое
    currencyMutableMap.remove("Гривна")
    println(currencyMutableMap)
    val mutableMaps = mutableMapOf("one" to 1, "three" to 3, "nine" to 9)
    mutableMaps.put("two", 2)
    println(mutableMaps)
    mutableMaps += "five" to 5
    val entry1 = Pair("ten", 10)
    val entry2 = Pair("four", 4)
    val entryToAdd = mapOf(entry1, entry2)
    mutableMaps.putAll(entryToAdd)
    println(mutableMaps)
    val map3 = mutableMapOf<String, Int>("a" to 1, "b" to 2)
    val map4 = mutableMapOf<String, Int>("a" to 3, "d" to 4) // при совпадении ключей побеждает более поздний (a) т.е 3
    map3.putAll(map4)
    println(map3)
    mutableMaps.putAll(map3)
    println(mutableMaps)
    mutableMaps.remove("a")// mutableMaps.remove("a", 3) тоже самое// mutableMaps.remove("a", 1) здесь не удалит
    println(mutableMaps)
    // mutableMaps.clear() // стер все и вывел {}
    val list = mutableMaps.toList() // [(one, 1), (three, 3)...)]
    println(list)
}

fun hashMapsOf() {
//val personsHashMap: java.util.HashMap<Int, String> = hashMapOf(1 to "Барсик", 2 to "Черныш", 3 to "Дымок")
    val personsHashMap = hashMapOf(1 to "Барсик", 2 to "Черныш", 3 to "Дымок")
    personsHashMap.put(4, "Мышонок")
    personsHashMap.remove(1)
    println(personsHashMap)
    println(personsHashMap[2])
/*fun byName(name: String): String = //TODO не работает
//    map.getOrDefault(name, "cat")
//private val map: Map<String, String> = hashMapOf(
//    "one" to "value one",
//    "two" to "value two",
//    "three" to "value three"
//)
//fun onCreate(savedInstanceState: String) {
//    onCreate(savedInstanceState)
//    println(byName("one"))
//    println(byName("barsik"))
//
//} */
}

fun linkedHashMaps() {
////val postalHashMap: java.util.LinkedHashMap<String, String> =
////linkedHashMaps("NG" to "Nigeria", "AU" to "Australia", "CA" to "Canada")
//    val postalHashMap = linkedHashMaps("NG" to "Nigeria", "AU" to "Australia", "CA" to "Canada")
//    postalHashMap.put("NA", "Nambia")
//    postalHashMap.remove("UA")
//    postalHashMap.get("CA")
//
//
}

fun sortedMapsOf() {// 1 2 5 (сортирует по ключу)
//    val personsSortedMap: java.util.SortedMap<Int, String> =
//        sortedMapOf(2 to "Мурзик", 1 to "Дымок", 3 to "Рыжик")
    val personsSortedMap = sortedMapOf(2 to "Мурзик", 1 to "Дымок", 3 to "Рыжик")
    personsSortedMap.put(5, "Тимоша")
    personsSortedMap.remove(3)
    println(personsSortedMap)
}

