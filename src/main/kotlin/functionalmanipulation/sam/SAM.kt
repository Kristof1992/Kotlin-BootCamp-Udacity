package functionalmanipulation.sam

// SAM - Single Abstract Method

//interface Runnable<T> {
//    fun run()
//}
//
//interface Callable<T> {
//    fun call(): T
//}

fun example() {
    val runnable = object: Runnable {
        override fun run() {
            println("I'm a runnable")
        }
    }
// Ver. 1
//    JavaRun.runNow(runnable)
// Ver. 2
//    (JavaRun::runNow)(runnable)
}

// Ver. 3 The best Kotlin way with lambdas
fun exampleTwo() {
    JavaRun.runNow {
        println("Passing a lambda as a runnable")
    }
}

fun main(args: Array<String>) {
    example()
}