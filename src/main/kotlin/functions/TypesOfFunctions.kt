package functions

import java.util.*


fun main(args: Array<String>) {
//    feedTheFish()
    canAddFish(10.0, listOf(3,3,3))
    canAddFish(8.0, listOf(2,2,2), hasDecorations = false)
    canAddFish(9.0, listOf(1,1,3), 3)
    canAddFish(10.0, listOf(), 7, true)

    repeat(2) {
        println("A fish is swimming")
    }
}

fun getDirtySensorReading() = 20

var dirty = 20

//
val waterFilter: (Int) -> Int = { dirty -> dirty/2}
fun feedFish(dirty: Int) = dirty + 10

// Higher Order Function
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty) // function arguments to be last
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter) // lambda passed in
    dirty = updateDirty(dirty, ::feedFish) // feedFish is a named function not a lambda
    // As we are passing it as the last parameter we don't have to put it inside function parentheses
    dirty = updateDirty(dirty) { dirty ->
        dirty + 50
    }
}


fun swim() {

}


fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {
    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}


fun makeNewAquarium() = println("Building a new aquarium......")

// Expensive default operation
fun aquariumStatusReport(aquarium: Any = makeNewAquarium()) {

}

fun isTooHot(temperature: Int): Boolean = temperature > 30
fun isDirty(dirty: Int):Boolean = dirty > 30
fun isSunday(day: String):Boolean = day == "Sunday"

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    if (shouldChangeWater(day)) {
        println("Change the water today")
    }

    // call dirty processor
    dirtyProcessor()
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed")
}


fun fishFood(day : String): String {
    return when(day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}
