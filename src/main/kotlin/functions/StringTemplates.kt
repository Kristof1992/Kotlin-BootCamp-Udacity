import java.util.*
/*
 * String templates
 * To start a String template insert a $ sign before a variable
 * In a String template instead of a String we out instructions
 * for how to get a string; either from a variable or from an
 * expression.
 * We need to put args[0] to curly braces as it is not a value,
 * fetching the first element in the arrays is an expression!
 */
fun main(args: Array<String>) {
    println("Hi, ${args[0]}!")
}

// when or Java switch statement
fun dayOfWeek() {
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when(day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}
