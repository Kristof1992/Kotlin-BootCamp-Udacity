package introduction.basics

    fun main(args: Array<String>) {
        // *** Types/Primitives ***
        val fish = 2
        fish.times(6)
        fish.div(10)
        fish.plus(3)
        fish.minus(2)

        // use primitive 'int' as an object
        1.toLong()

        // or put it in a box
        val boxed: Number = 1
        boxed.toLong()

        // Types of variables in Kotlin changeable and unchangeable
        val aquarium = 1 // only assigned once
//        aquarium = 2 Gives an error
        var fishTwo = 2
        fishTwo = 2*2

        val b: Byte = 1
        val i: Int = b.toInt() // type casting 'primitives' -> casted to int

        val hexBytes = 0xFF_EC_DE_5E
        val bytes = 0b11010010_01101001_10010100_10010010
        val byteX: Byte = 127

        // *** Nullability ***

        // ? indicates nullable type
        var rocks: Int? = null

        // can contain a list of nulls
        var lotsOfFish: List<String?> = listOf(null, null)
        // can contain a null
        var everMoreFish: List<String>? = null
        // can contain both
        var definitelyFish : List<String?>? = null

        // *** Double Bang ***

        // Not null assertion operator !! -> Double Bang operator not safe
        var goldFish: Int? = null
//        goldFish!!.minus(2) Throws null pointer exception

        var fishFoodTreats: Int? = 5

        var treats: Int? = doSthing(fishFoodTreats)
        println(treats) // returns 0 instead of null

        // *** Strings ***
        val numberOfFish = 5
        val numberOfPlants = 12
        // String templates - allows us to build strings combined with values
        val myString = "I have $numberOfFish fish and $numberOfPlants plants"
        println(myString)
        // String templates version 2
        val myStringTwo = "I have ${numberOfFish + numberOfPlants} fish and plants"

        val myFish = "fish"
        val myPlant = "plant"

        // == Equals by value comparison
        println(myFish == myPlant) // false
        println(myFish == myFish) // true

        // *** Ranges ***
        // If fish is in the range 1 to 100 it does sthing
        val fishes = 50
        if (fish in 1..100) println(fish)

        // *** Kotlin's switch is 'when' ***

        // numberOfFish = 5
        when(numberOfFish) {
            0 -> println("Empty tank")
            5-> println("Shallow tank")
            else -> println("Perfect!")
        }

        var fishName = "John"
        when(fishName.length) {
            0 -> println("Error")
            in 3..4 -> println("Good fish name")
            else -> println("OK fish name")
        }

    }

    fun doSthing(param: Int?): Int {
        return param?.dec() ?: 0 // ?: -> Elvis operator
        // If param is not null decrements param by 1 otherwise returns 0
    }


