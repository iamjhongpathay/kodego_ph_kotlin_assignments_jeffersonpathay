import java.util.*

/*
You are tasked to automate a school’s library.
Identify the items that can be borrowed in a Library.
After listing the different items, identify the characteristics of the items.

Use the proper data types.
 */
fun main(){

    var bookNumber1: String = "TGG1925"
    var bookTitle1: String = "The Great Gatsby"
    var bookAuthor1: String = "F. Scott Fitzgerald"
    var bookEdition1: Int = 1925
    var availability1: Boolean = true

    var bookNumber2: String = "L1955"
    var bookTitle2: String = "Lolita"
    var bookAuthor2: String = "Vladimir Nabokov"
    var bookEdition2: Int = 1955
    var availability2: Boolean = true

    var bookNumber3: String = "DQ1605"
    var bookTitle3: String = "Don Quixote"
    var bookAuthor3: String = "Miguel de Cervantes"
    var bookEdition3: Int = 1605
    var availability3: Boolean = false

    var bookNumber4: String = "LOTR1954"
    var bookTitle4: String = "Lord of the Rings"
    var bookAuthor4: String = "J.R.R. Tolkien"
    var bookEdition4: Int = 1954
    var availability4: Boolean = false

    var bookNumber5: String = "HPATSS1997"
    var bookTitle5: String = "Harry Potter and the Sorcerer's Stone"
    var bookAuthor5: String = "J.K. Rowling"
    var bookEdition5: Int = 1997
    var availability5: Boolean = true

    var loopUI: Boolean = true

    //User Interface/Interaction
    println("[      Welcome to KodeGo       ]" +
            "\n[Mobile Application Development]" +
            "\n[  Library Management System   ]")

    //looping the user interface
    while(loopUI){
        println()
        println("[----------LIST OF BOOKS----------]")

        println()
        println("Book No.: $bookNumber1" +
                "\nTitle: $bookTitle1 by $bookAuthor1" +
                "\nAvailability: $availability1")

        println()
        println("Book No.: $bookNumber2" +
                "\nTitle: $bookTitle2 by $bookAuthor2" +
                "\nAvailability: $availability2")

        println()
        println("Book No.: $bookNumber3" +
                "\nTitle: $bookTitle3 by $bookAuthor3" +
                "\nAvailability: $availability3")

        println()
        println("Book No.: $bookNumber4" +
                "\nTitle: $bookTitle4 by $bookAuthor4" +
                "\nAvailability: $availability4")

        println()
        println("Book No.: $bookNumber5" +
                "\nTitle: $bookTitle5 by $bookAuthor5" +
                "\nAvailability: $availability5")

        //Once user enter a book number it will show all the details of the book
        println()
        print("[Enter Book No. to see all details or enter [X] to Exit]: ")
        var enterBookNo: String = readln().uppercase(Locale.getDefault())

        if(enterBookNo == "TGG1925"){
            println()
            println("[----------BOOK DETAILS----------]")
            println("Book No.: $bookNumber1" +
                    "\nTitle: $bookTitle1" +
                    "\nAuthor: $bookAuthor1" +
                    "\nEdition: $bookEdition1" +
                    "\nAvailability: $availability1")

            println()
            println("[TYPE any Character and PRESS Enter to exit.] ")
            var exit: String = readln()

        }else if(enterBookNo == "L1955"){
            println()
            println("[----------BOOK DETAILS----------]")
            println("Book No.: $bookNumber2" +
                    "\nTitle: $bookTitle2" +
                    "\nAuthor: $bookAuthor2" +
                    "\nEdition: $bookEdition2" +
                    "\nAvailability: $availability2")

            println()
            println("[TYPE any Character and PRESS Enter to exit.] ")
            var exit: String = readln()

        }else if(enterBookNo == "DQ1605") {
            println()
            println("[----------BOOK DETAILS----------]")
            println("Book No.: $bookNumber3" +
                    "\nTitle: $bookTitle3" +
                    "\nAuthor: $bookAuthor3" +
                    "\nEdition: $bookEdition3" +
                    "\nAvailability: $availability3")

            println()
            println("[TYPE any Character and PRESS Enter to exit.] ")
            var exit: String = readln()

        }else if(enterBookNo == "LOTR1954") {
            println()
            println("[----------BOOK DETAILS----------]")
            println("Book No.: $bookNumber4" +
                    "\nTitle: $bookTitle4" +
                    "\nAuthor: $bookAuthor4" +
                    "\nEdition: $bookEdition4" +
                    "\nAvailability: $availability4")

            println()
            println("[TYPE any Character and PRESS Enter to exit.] ")
            var exit: String = readln()

        }else if(enterBookNo == "HPATSS1997") {
            println()
            println("[----------BOOK DETAILS----------]")
            println("Book No.: $bookNumber5" +
                    "\nTitle: $bookTitle5" +
                    "\nAuthor: $bookAuthor5" +
                    "\nEdition: $bookEdition5" +
                    "\nAvailability: $availability5")

            println()
            println("[TYPE any Character and PRESS Enter to exit.] ")
            var exit: String = readln()

        }else if(enterBookNo == "X") {

            println()
            print("[----------Have a good day, GOODBYE!----------]")
            loopUI = false

        }else{
            println("ERROR:The Book No. you've been enter is not on the list.")
        }
    }
}