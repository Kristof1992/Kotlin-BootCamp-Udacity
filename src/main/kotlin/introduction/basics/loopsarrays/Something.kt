package introduction.basics.loopsarrays

    fun main(args: Array<String>) {
        // Lists
        val myList = mutableListOf("tuna", "salmon", "shark")
        myList.remove("shark")

//        println(myList) prints tuna, salmon

        var fish = 12
        var plants = 5

        val swarm = listOf(fish, plants)
//        swarm.forEach(::println)

        val mix = arrayOf("fish", 2)
//        println(Arrays.toString(mix))

        val array = Array(5) {it * 2}
        println(array.asList())

        val mySwarm = listOf(fish, plants)
//        for (element in mySwarm) print("$element,")

        for ((index, element) in swarm.withIndex()) {
            println("Fish at $index is $element")
        }

//        for (i in 'b'..'g') print(i)

//        for (i in 1..5) print(i)

//        for (i in 5 downTo 1) print(i)

//        for (i in 2..6 step 2) print(i)

//        val arrayX = Array(7) {1000.0.pow(it)}
//        println(Arrays.toString(arrayX))

        var arrayY = mutableListOf<Int>()
        for (i in 11..15) arrayY.add(i)
//        println(arrayY)

        var arrayU = mutableListOf<String>()
        for (i in 11..15) arrayU.add(i.toString())
//        println(arrayU)

        var arrayI = mutableListOf<Int>()
        for (i in 0..100 step 7) arrayI.add(i)
        println(arrayI)

    }