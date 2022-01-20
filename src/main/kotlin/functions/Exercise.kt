package functions

fun main(args: Array<String>) {
    var fortune: String
    for (i in 0..9) {
        fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")
        if (fortune == "Take it easy and enjoy life!") break
    }
}
// age is picked by age % size
fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    print("Enter your birthday: ")
    val age = readLine()?.toIntOrNull() ?: 1
    return fortunes[age % fortunes.size]
}