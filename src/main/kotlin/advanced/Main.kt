package advanced

fun Book.weight(): Double {
    return this.pages * 1.5
}

fun Book.tornPages(pagesToTorn: Int) {
    this.pages -= pagesToTorn
}

fun main() {
    val book1 = Book("A", "B", 2022)
    println(book1.getTitleAndAuthor())
    val (title, author, year) = book1.getTitleAuthorAndYear()
    println("Here is your book $title written by $author in $year")


    val allBooks = setOf("流浪地球", "三体", "球状闪电")
    val library = mutableMapOf<String, String>()
    allBooks.forEach {
        library[it] = "刘慈欣"
    }
    println(library.any { it.key.contains("三体") })
    println(library.toString())

    val moreBooks = mutableMapOf("撒哈拉沙漠" to "三毛")
    moreBooks.getOrPut("超新星纪元") { "刘慈欣" }
    println(moreBooks.toString())

    book1.borrow()
    book1.borrow()
    println(book1.canBorrow())
    book1.borrow()
    book1.borrow()
    book1.borrow()
    book1.borrow()
    book1.borrow()
    println(book1.canBorrow())
    book1.printUrl()




    val puppy = Puppy()
    while (book1.pages > 0) {
        println(book1.pages)
        puppy.playWithBook(book1)
    }
}