package advanced

const val maxBooks: Int = 6

class Book(
    private val title: String,
    private val author: String,
    private val year: Int,
) {
    private var borrowed = 0
    var pages: Int = (100..1000).random()

    fun getTitleAndAuthor() = title to author
    fun getTitleAuthorAndYear() = Triple(title, author, year)

    fun borrow() {
        borrowed += 1
    }
    fun canBorrow() = borrowed <= maxBooks

    fun printUrl() {
        val url = "$BASE_URL$title.html"
        println(url)
    }

    companion object {
        const val BASE_URL = "https://www.a-fei-books/"
    }
}
