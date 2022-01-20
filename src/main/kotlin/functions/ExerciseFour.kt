package functions

import java.util.*

fun main(args: Array<String>) {

    val rollDice = { Random().nextInt(12)+1}
    val rollDice2 = { sides: Int ->
        Random().nextInt(sides) + 1
    }
    val rollDice3 = { sides:Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }
    gamePlay(rollDice2(4))

//    println(rollDice())
//    println(rollDice3(0))

}
fun gamePlay(diceRoll: Int) {
    println(diceRoll)
}