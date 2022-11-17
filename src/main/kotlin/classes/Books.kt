package classes

open class Book (var title: String, var author: String) {
    private var currentPage: Int = 0

    open fun printBook() {
        println("The book $title by $author is on page $currentPage.")
    }

    open fun readPage() {
        currentPage += 1
    }
}

class EBook(title: String, author: String, var format: String = "text") : Book(title, author) {
    private var wordCount: Int = 0

    override fun printBook() {
        println("The eBook $title by $author, in $format format, has $wordCount words read.")
    }

    override fun readPage() {
        wordCount += 250
    }
}

fun main() {
    val book1 = Book("A Song of Cats and Dogs", "Garage K. K. Putin")
    book1.printBook()
    book1.readPage()
    book1.printBook()
    val book2 = EBook("Productivity", "Steven Yang")
    book2.printBook()
    book2.readPage()
    book2.printBook()
}