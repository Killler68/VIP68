package practics.kotlinpractics

fun main() {
    MapsOf()
}

fun MapsOf() {
    val map = mapOf(1 to "one", 3 to "three", 9 to "nine")// создание не изменяемого map
    val maps = mapOf("one" to 1, "three" to 3, "nine" to 9)
  /*  println(map.javaClass)// Вывод содержимого колекции (class java.util.LinkedHashMap)
    println(map)
    println(maps)
    println(maps.containsValue(1))//true
    println(maps.containsKey("one"))
    println(map.containsKey(1))
    println(map.containsValue("two"))//false
*/
    val number = map.getOrElse(2) {"No such number"}// выводит "No such ..." так как такого ключа не существует
    println(number)
    val num = map.getOrDefault(2, 0)// выводит 0
    println(num)
    val map1 = mutableMapOf("one" to 1, "three" to 3)
    println(map1.getValue("one"))//1
    println(map1["three"])//3
    for ((key, value ) in map) {
        println("Ключ $key, значение $value")
    }
    println(map.mapValues { it.value.toUpperCase() })// делает значения большими буквами


}

