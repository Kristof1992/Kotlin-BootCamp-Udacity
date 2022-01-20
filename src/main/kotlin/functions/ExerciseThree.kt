package functions

fun main(args: Array<String>) {
//    eagerExample()
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val eagerTwo = spices.filter { it.contains("curry") }.sortedBy {it.length} // filters out values then sorts them according to length
//    println(eagerTwo)

    val something = { 5 * 5}
    println(something())
}

fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val eager = decorations.filter { it[0] == 'p' }
//    println(eager)

    // apply filter lazily
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
//    println(filtered)
//    println(filtered.toList())

    // apply map lazily
    val lazyMap = decorations.asSequence().map {
        println("map: $it")
        it
    }

    println(lazyMap)
//    println("first: ${lazyMap.first()}")
    println("all: ${lazyMap.toList()}")
}



fun isVeryHot(temperature: Int): Boolean = temperature > 35
fun isSadRainyCold(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0
fun isHappySunny(mood:String, weather: String) = mood == "happy" && weather == "sunny"

fun whatShouldIDoToday(mood: String, weather: String = "Sunny", temperature: Int = 24): String {
    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}
