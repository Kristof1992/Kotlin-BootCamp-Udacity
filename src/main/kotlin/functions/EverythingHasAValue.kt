package functions

/*
 * In Kotlin almost everything has a value, even
 * if that value is Unit
 */

fun main(args: Array<String>) {
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if(temperature > 50) true else false
    println(isHot)

    val message = "You are ${ if (temperature>50) "fried" else "safe"} fish"
    println(message)

    val time = "11"
    println("Good ${ if (time.toInt() < 12) "morning," else "afternoon"} Kotlin")
}