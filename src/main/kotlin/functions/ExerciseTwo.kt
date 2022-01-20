package functions

fun main(args: Array<String>) {
    var fortune: String
    repeat(10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) return
    }

}

fun getFortune(birthday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
//    return fortunes[birthday % fortunes.size]
    val index = when(birthday) {
        in 1..7 -> 0
        in 8..15 -> 5
        21, 22 -> 4
        else -> birthday.rem(fortunes.size) // rem is like modulus
    }
    return fortunes[index]
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}