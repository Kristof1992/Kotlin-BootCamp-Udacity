package essentials.constants

import java.lang.reflect.Field

/** Top level constants - Assigns value at compile-time
 * Only works at the top-level and in classes declared with
 * object.
 */
const val rocks = 3

// Determined at run-time
val number = 5
const val  num = 5

val result = complexFunctionCall()

fun complexFunctionCall(): Int {
    return 10
}

object Constants {
    const val CONSTANT2 = "object constant"
}

val foo = Constants.CONSTANT2

class MyClass(param1: String) {
    /**
     * Difference between basic objects and companion objects is:
     * Companion objects are initialized from the static constructor
     * of the containing class. They are created when the object is
     * created.
     *
     * Plain objects are initialized lazily on the first access to that
     * object. When they are first used.
     */

    companion object {
        const val CONSTANT3 = ""

        fun companionFun() {
            println("companionFun() executed!")
        }

    }

    object myObject {
        val xxy = "xxy"

        fun objectFun() {
            println("objectFun() executed!")
        }
    }

}


fun main(args: Array<String>) {

}