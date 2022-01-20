package functionalmanipulation

/**
 * Making T covariant meaning it can take a generic subtype.
 *
 * Notes:
 * In general, a class or interface generic type may be prefixed with out if the class has functions that
 * use it as a return type, or if the class has val properties of that type. You can’t, however, use out if
 * the class has function parameters or var properties of that generic type.
  */
interface Retailer<out T> {
    fun sells(): T
}

open abstract class Pet(var name: String)
class Cat(name: String) : Pet(name)
class Dog(name: String) : Pet(name)
class AFish(name: String) : Pet(name)

// Retailers
class CatRetailer : Retailer<Cat> {
    override fun sells(): Cat {
        println("sold cat")
        return Cat("")
    }
}

class DogRetailer : Retailer<Dog> {
    override fun sells(): Dog {
        println("sold dog")
        return Dog("")
    }
}

class FishRetailer : Retailer<AFish> {
    override fun sells(): AFish {
        println("sold fish")
        return AFish("")
    }
}

class Car(var name: String)

class CarRetailer : Retailer<Car> {
    override fun sells(): Car {
        println("sold car")
        return Car("")
    }
}

// Contest takes a Pet type "IN" as parameter
// We are making a contravariant
class Contest<T: Pet>(var vet: Vet<in T>) {
    // Initializes a new Map
    val scores: MutableMap<T, Int> = mutableMapOf()
    // Adds the type and score
    fun addScore(t: T, score: Int = 0) {
        if (score>=0) scores.put(t, score)
    }

    /**
     * @return a mutableSet<T> of the winners
     */
    fun getWinners(): MutableSet<T> {
        val winners: MutableSet<T> = mutableSetOf()
        val highScore = scores.values.maxOrNull()
        for ((t, score) in scores) {
            if (score == highScore) winners.add(t)
        }
        return winners
    }
}

class Vet<T: Pet> {
    fun treat(t: T) {
        println("Treat Pet ${t.name}")
    }
}

fun main(args: Array<String>) {
    val catRetailer: Retailer<Cat> = CatRetailer()
    val dogRetailer: Retailer<Dog> = DogRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()

//    val carRetailer: Retailer<Car> = catRetailer // type mismatch Car in ot a Pet

    val catList: List<Cat> = listOf(Cat("A"), Cat("B"))
    val petList: List<Pet> = catList

    val catVet = Vet<Cat>()
    val fishVet = Vet<AFish>()
    val petVet = Vet<Pet>()

    catVet.treat(Cat("Fuzz Lightyear"))
    petVet.treat(Cat("Katsu"))
    petVet.treat(AFish("Finny McGraw"))

    val catXContest = Contest<Cat>(petVet)

    // We want to store a subtype in a supertype reference
    var foodSeller: Seller<Food>
    foodSeller = FoodSeller()
    foodSeller = VeganFoodSeller()

    // We want to store a supertype in a subtype reference
    var veganFoodConsumer: Consumer<VeganFood>
    veganFoodConsumer = Vegan()
    veganFoodConsumer = Person()
}



open class Food

class VeganFood: Food()

//Sellers

interface Seller<out T>

class FoodSeller: Seller<Food>
class VeganFoodSeller: Seller<VeganFood>

// Consumers
interface Consumer<in T>

class Person: Consumer<Food>
class Vegan: Consumer<VeganFood>

