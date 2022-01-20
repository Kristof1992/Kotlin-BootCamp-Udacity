package essentials.labelledbreaks

fun labels() {
    loop@ for (i in 1..100) {
        println(i)
        for (j in 1..100) {
            if (i > 10) break@loop
        }
    }
}

fun main(args: Array<String>) {
    labels()
}