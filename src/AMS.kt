import java.util.*

fun main(args:Array<String>){
    feedThefish()

}

fun feedThefish() {
    val randomDay = randomDay()
    val food = fishFood(randomDay)
    println("Today is $randomDay and fish eat $food")

    if(shouldChangeWater(randomDay)){
        println("Change the water today")
    }


    //Filters example

    eagerExample()

}

//filter
fun eagerExample() {
    val decorations = listOf("Rock","Flowerpot","Pagoda","Plastic plant","Alligator")
    val eager = decorations.filter { it[0] == 'P'}
    println(eager)

    val filtered = decorations.asSequence().filter { it[0] == 'P' }
    println(filtered.toList())

    val lazyMap = decorations.asSequence().map {
        println("map:$it")
        it
    }

    println(lazyMap)
    println("first: ${lazyMap.first()}")
    println("all: ${lazyMap.toList()}")

}

fun shouldChangeWater(day: String,temperature:Int = 22, dirty:Int = getDirtySensor()) : Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}
fun getDirtySensor() = 20

//compact functions
fun isTooHot(temperature: Int) = temperature >30
fun isDirty(dirty: Int) = dirty>20
fun isSunday(day: String) = day=="Sunday"


fun fishFood(randomDay: String): Any {
    return when(randomDay){
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        else -> "fasting"
    }
}

fun randomDay(): String {
val listOfDays = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return listOfDays[Random().nextInt(7)]
}
