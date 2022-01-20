package classes.aquarium

open class Book(val title: String , val author: String) {
    private var currentPage = 1
        val _currentPage get() = currentPage
    open fun readPage() {
        currentPage++
    }
}

class EBook(title: String, author: String, var format: String = "text") : Book(title, author) {
    private var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }
}