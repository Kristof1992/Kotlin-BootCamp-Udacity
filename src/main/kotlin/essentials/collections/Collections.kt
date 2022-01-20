package essentials.collections

class Collections {

}

fun main(args: Array<String>) {
    // List functions
    val testList = listOf(11,12,13,14,15,16,17,18,19,20)
    val reversedList = reverseList(testList)
    println(reversedList)

    // Ver. 3
    println(testList.reversed())

    val symptoms = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")
    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    symptoms.contains("red")

    println(symptoms.subList(4, symptoms.size))

    listOf(1, 5, 3).sum() // 9

    val myList = listOf("a", "b", "cc").sumOf { it.length }
    println(myList)

    // Maps

    val cures = mapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(cures.get("white spots"))
    println(cures["white spots"])

    println(cures.getOrDefault("bloating", "sorry I don't know"))

    println(cures.getOrElse("bloating") { "No cure for this" })

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    inventory.remove("fish net")

    // Exercise

    val allBooks = setOf("A", "B", "C", "Hamlet")
    val library = mapOf("Shakespeare" to allBooks)
    println(library)
    val x = library.any{it.key.contains("Hamlet")}
    var myMutableMap = mutableMapOf("Surrounded by Setbacks" to "Thomas Erikson")
    myMutableMap.getOrPut("George Orwell") {"Animal Farm"}
    println(myMutableMap)


}

// Ver. 1
fun reverseList(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in 0..list.size-1) {
        result.add(list[list.size-i-1])
    }
    return result
}

// Ver. 2
fun reverseListAgain(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in list.size-1 downTo 0) {
        result.add(list.get(i))
    }
    return result
}