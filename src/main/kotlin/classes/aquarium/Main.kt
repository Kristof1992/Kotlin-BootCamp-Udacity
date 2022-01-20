package classes.aquarium

fun main(args: Array<String>) {
    buildAquarium()
}
// public, internal, private
private fun buildAquarium() {
//    val myAquarium = Aquarium()
//
//    println("Length: ${myAquarium.length} " +
//            "Width: ${myAquarium.width} " +
//            "Height: ${myAquarium.height}")
//
//    println("Volume: ${myAquarium.volume}")
//
//    myAquarium.height = 80
//
//    println("Volume: ${myAquarium.volume}")

//    println("Height: ${myAquarium.height} cm")
//    println("Volume: ${myAquarium.height} liters")

//    println(myAquarium.volume)

    val spicesList = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    val spicelist = spicesList.filter {it.heat < 5}
//    spicelist.forEach{ println(it.name)}

//    val myAquarium2 = Aquarium(numberOfFish = 9)

//    println(myAquarium2.height)

//    val fish = makeDefaultFish()

//    val book = Book("1984", "George Orwell")
//    println(book._currentPage)
//    book.readPage()
//    println(book._currentPage)

    makeFish()

}


fun feedFish(fish: FishAction) {
    fish.eat()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \nPlecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}