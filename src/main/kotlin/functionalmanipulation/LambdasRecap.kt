package functionalmanipulation

class Fish(val name: String)

val waterFilter = {dirty: Int -> dirty / 2}
val myFish = listOf(Fish("Flipper"), Fish("Moby Dick"), Fish("Dory"), Fish("Bullshit"))

fun main(args: Array<String>) {
    println(waterFilter(50))
    myFish.filter {
        it.name.startsWith("F")
    }.forEach {
        println( it.name)
    }

    val x = myFish.filter { it.name.contains("i") }.joinToString { it.name }
    println(x)


}

