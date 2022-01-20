package essentials.generics

/**
 * In type: keyword "in"
--in type can be used anytime the generic is only used as an arguments to functions.
-- more specifically, in types can only be passed into an object
-- in type can be used as parameter

out type: keyword "out"
-- out types can only be passed out of an object or returned
-- Special case: Constructors can take out types as arguments, but function never can
-- out type can be used as return values.
 */

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

/**
 * Now T is upper bounded
 * Out types can only be passed out of an object.
 * Or returned
 *
  */
class Aquarium<out T: WaterSupply>(val waterSupply: T) {

    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessed) {
            cleaner.clean(waterSupply)
        }

        println("adding water from $waterSupply")
    }

}

// In types can only be passed into an object
interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${aquarium.waterSupply.needsProcessed}")
}

// Reified makes R a real type
// Non-reified types are only available at compile-time
// and can't be used at run-time
inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T

fun genericExample() {
//    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    aquarium.hasWaterSupplyOfType<TapWater>() // true
    aquarium.waterSupply.isOfType<LakeWater>() // false
}




fun main(args: Array<String>) {
    genericExample()
}

