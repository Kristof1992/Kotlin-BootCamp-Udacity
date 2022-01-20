package essentials.pairs

import kotlin.random.Random

const val MAXNUMBEROFBOOKS = 2

// Exercise for Pairs

class Book(val title: String, val author: String, val year:Int, var pages: Int = 120) {

    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }

    fun getTriple(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(borrowedBooks: Int): Boolean {
        return (borrowedBooks < MAXNUMBEROFBOOKS)
    }

    private companion object CONSTANTS {
        const val BASE_URL = "https://www.books.co.uk/"
    }

}

class Puppy {
    fun playWithBook(book: Book): Int {
        if (book.pages <= 0) return book.pages
        book.tornPages((1..10).random())
        return playWithBook(book)
    }
}

fun Book.weight():Double { return pages * 1.5}
fun Book.tornPages(tornPages: Int) {
    this?.pages -= tornPages
}

fun main(args: Array<String>) {
    val equipment = "fishnet" to "catching fish" to "of big size" to "and strong"

    println(equipment.first)
    println(equipment.second)
    println(equipment.first)

    val book = Book("1984", "George Orwell", 1949)

    val pair = book.getTitleAuthor()
    val triple = book.getTriple()
    println(pair)

    println("Here is your book ${triple.first} by ${triple.second} written in ${triple.third}")


    println(book.pages)
    book.tornPages(10)
    println(book.pages)


    val puppy = Puppy()
    println(puppy.playWithBook(book))
    println(book.pages)



}


