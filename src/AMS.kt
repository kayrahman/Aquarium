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

}

fun shouldChangeWater(day: String,temperature:Int = 22, dirty:Int = 20) : Boolean {
    return true
}

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
