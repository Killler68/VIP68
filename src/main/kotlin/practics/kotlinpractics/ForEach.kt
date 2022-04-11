package practics.kotlinpractics

fun main() {

    // val num = 1..4

//for (i in 1..4) {
//    println(i)
// for (i in num) println("Элемент $i")
  /*  val cats = arrayListOf<String>()
    cats.add("Уголёк")
    cats.add("Тимоша")
    cats.add("Чернышь")
   */
//    for (cat in cats) println("Кот $cat")
// for (index in cats.indices) println("Кот ${cats[index]}")
//  for ((index, element) in cats.withIndex()) println("$index: $element") // индекс и значение
// for (i in 10 downTo 1 step 2) println(i) // уменьшение на 2 // можно без шага(step2)
//for (i in 0..cats.size - 2 ) println(cats[i]) // удаляет 2 элемент "Чернышь"
// for (i in 0 until cats.size - 2) println(cats[i]) // удаляет 2 элемента начиная с конца

    /* for (i in 1..5) {
    println(i)
if (i == 3)
    break } */

    /* for (i in 1..10 ) {
         if (i == 5) {
             println("Meow") // вместо 5 (Meow)
             continue
         }
         println(i)
     } */
//          ВЛОЖЕННЫЙ ЦИКЛ
    /*  for (x in 1..3) //      1  1        2  1        3  1
    for (y in 1..3)//   1  2        2  2        3  2
        println("$x  $y ")//   1  3        2  3        3  3
*/
    /*  outerLoop@ for (x in 1..5) {
   for (y in 1..5) {
       println("$x $y")
       if (x == 2 && y == 2) // заканчивает цикл на 2 2
           break@outerLoop
   }
}   */

    val daysOfWeek =
        listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    daysOfWeek.forEach {
        println(it)
        repeat(2) {
            println("Васька! Кушать $daysOfWeek")
            /*Sunday
            Васька! Кушать [Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]
            Васька! Кушать [Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]
            Monday
            Васька! Кушать [Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]
            Васька! Кушать [Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]
            Tuesday */
        }
    }
}

