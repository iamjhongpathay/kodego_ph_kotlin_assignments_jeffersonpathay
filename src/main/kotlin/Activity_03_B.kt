/*
Covered Topic(s) : Functions

Instructions :

1. Create an ArrayList of bookname with 20 entries.
2. Create a function "isBookInRecord" that will accept a String and return true if the book is found, otherwise false.
3. Create a function "addBook" that will accept a String and add it to the ArrayList.
4. Create a function "removeBook"  that will accept a name and remove it from the ArrayList if it exactly matches the book name.
5. Create a function "countBooks" that will return the size of the ArrayList.
6. Create a function "searchBookWildSearch" that will accept a String and search if that string is found with in the ArrayList, it will return an ArrayList of books that matched if there are.
7. Create a function  "searchBookName" that will accept a String and search if there is an exact match of the String input, it will return an ArrayList of books that matched if there are.
8.  Create a function "showBooks" that will print all the entries in the ArrayList.
 */

fun main(){

    var booksObject = Books()

    var inputTitle: String = ""
    var inputUserChoose: String = ""

    //User Interface/Interaction
    println("[      Welcome to KodeGo       ]" +
            "\n[Mobile Application Development]" +
            "\n[      Library Management      ]")

    var loopMainMenuBook: Boolean = true
    while (loopMainMenuBook){
        println()
        println("[1] List of all Book" +
                "\n[2] Add Book" +
                "\n[3] Remove Book" +
                "\n[4] Count Book" +
                "\n[5] Search" +
                "\n[6] Check Book in Record" +
                "\n[X] Exit")
        print("Choose a number that available on the list or [X] to Exit: ")
        inputUserChoose = readln().uppercase()

        if(inputUserChoose == "1"){
            println()
            println("[----------LIST OF BOOKS----------]")
            println()
            booksObject.showBooks()

        }else if(inputUserChoose == "2"){
            println()
            println("[----------ADD BOOKS----------]")

            var loopAddBook: Boolean = true
            while (loopAddBook){

                print("Enter Title: ")
                inputTitle = readln()
                booksObject.addBook(inputTitle)

                println()
                print("Do you want to add another Book?" +
                        "\n[Y]es or [N]o: ")
                inputUserChoose = readln().uppercase()
                println("----------------------------")

                if (inputUserChoose == "N"){
                    loopAddBook = false

                }else if(inputUserChoose == "Y"){
                    loopAddBook = continue
                }else{
                    println("Invalid! Please choose between [Y]es or [N]o")
                    loopAddBook = false
                }
            }
        }else if(inputUserChoose == "3"){
            println()
            println("[----------REMOVE BOOKS----------]")
            var loopRemoveBook: Boolean = true
            while (loopRemoveBook){

                print("Enter Title: ")
                inputTitle = readln()
                booksObject.removeBook(inputTitle)

                println()
                print("Do you want to remove another Books?" +
                        "\n[Y]es or [N]o: ")
                inputUserChoose = readln().uppercase()

                if (inputUserChoose == "N"){
                    loopRemoveBook = false

                }else if(inputUserChoose == "Y"){
                    loopRemoveBook = continue

                }else{
                    println("Invalid! Please choose between [Y]es or [N]o")
                    loopRemoveBook = false
                }
            }
        }else if(inputUserChoose == "4"){
            println()
            println("[----------TOTAL BOOKS----------]")
            booksObject.countBooks()

        }else if(inputUserChoose == "5"){
            println()
            println("[----------SEARCH BOOKS----------]")

            print("Enter Title: ")
            inputTitle = readln()
            booksObject.searchBook(inputTitle)

        }else if(inputUserChoose == "6"){
            println("[----------CHECK THE BOOK IN THE RECORD----------]")
            print("Enter Title: ")
            inputTitle = readln()
            booksObject.isBookInRecord(inputTitle)
        }else if(inputUserChoose == "X"){
            println()
            println("Shutting down..." +
                    "\n------------------------------------------------------")
            loopMainMenuBook = false
        }else{
            println("[ERROR: The number you've been enter is not on the list]")
        }
    }

}

class Books(){
    var bookList = ArrayList<String>(20)

    fun isBookInRecord(title: String): Boolean{

        if (bookList.contains(title)){
            println("TRUE")
            true
        }else{
            println("FALSE")
            false
        }
        return true
    }

    fun addBook(title: String){
        if(bookList.size >= 20){
            println("[REMINDER]: Book data is full, you can only add 20 books!")

        }else{
            bookList.add(title)
            println("(${title}) successfully added to database!")
        }
    }

    fun removeBook(title: String){
        if(bookList.contains(title)){
            println("Are you sure to remove $title on the list?" +
                    "\n[Y]es or [N]o: ")
            var userChoiceToRemove: String = readln().uppercase()
            if(userChoiceToRemove == "Y"){
                bookList.remove(title)
                println("(${title}) successfully removed from database!")
            }

        }else{
            println("The (${title}) not on the List of Books!")
        }
    }

    fun countBooks(){
        println("The total are ${bookList.count()} books.")

    }

    fun searchBookWildSearch(title: String){
        val filterTitle : List<String> = bookList.filter { it.startsWith(title) }

        if(filterTitle.isEmpty()){
            println("[NO BOOKS AVAILABLE]")
        }else{
            println("All of titles searched:")
            for (list in filterTitle.indices){
                println("${list+1}. ${filterTitle[list]}")
            }
        }
    }

    fun searchBooksTitle(title: String){
        var filterTitle: List<String> = bookList.filter { it == title }

        if(filterTitle.isEmpty()){
            println("[NO BOOKS AVAILABLE]")
        }else{
            println("All of titles searched:")
            for (list in filterTitle.indices){
                println("${list+1}. ${filterTitle[list]}")
            }
        }

    }

    fun searchBook(title: String){

        if (title.length <= 3){
            searchBookWildSearch(title)
        }else{
            searchBooksTitle(title)
        }
    }

    fun showBooks(){
        if(bookList.isEmpty()){
            println("[NO BOOKS AVAILABLE]")
        }else{
            for (list in bookList.indices) {
                println("${list+1}. ${bookList[list]}")
            }
        }
    }
}