package classes.aquarium.specialclasses

fun main(args: Array<String>) {
    val seaLion = SeaLion()
    val walrus = Walrus()
    matchSeal(seaLion)
    matchSeal(walrus)
}

object MobyDickWhale {

    val author = "Herman Melville"

    fun jump() {

    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

sealed class Seal

class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}