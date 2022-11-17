package advanced

class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages((0..book.pages).random())
    }
}