/*
Implement Activity 01 -  B using data structure.
 */
fun main(){

    //books data
    var bISBN = mutableMapOf<Int, Int>(
        1001 to 1001,
        1002 to 1002,
        1003 to 1003,
        1004 to 1004,
        1005 to 1005)
    var bTitle = mutableMapOf<Int, String>(
        1001 to "The Great Gatsby",
        1002 to "Lolita",
        1003 to "Don Quixote",
        1004 to "Lord of the Rings",
        1005 to "Harry Potter and the Sorcerer's Stone")
    var bAuthor = mutableMapOf<Int, String>(
        1001 to "F. Scott Fitzgerald",
        1002 to "Vladimir Nabokov",
        1003 to "Miguel de Cervantes",
        1004 to "J.R.R. Tolkien",
        1005 to "J.K. Rowling")
    var bPubDate = mutableMapOf<Int, String>(
        1001 to "1925",
        1002 to "1955",
        1003 to "1605",
        1004 to "1954",
        105 to "1997")
    var bAvailability = mutableMapOf<Int, Boolean>(
        1001 to false,
        1002 to false,
        1003 to true,
        1004 to true,
        1005 to false)
    var bBorrowerName = mutableMapOf<Int, String>(
        1001 to "David Blain",
        1002 to "Juan Gomez",
        1003 to "N/A",
        1004 to "N/A",
        1005 to "Narciso Quirino")
    var bBorrowerID = mutableMapOf<Int, String>(
        1001 to "0025-4652",
        1002 to "0001-1234",
        1003 to "N/A",
        1004 to "N/A",
        1005 to "0106-4623")
    var bBorrowedDate = mutableMapOf<Int, String>(
        1001 to "September 10, 2022",
        1002 to "September 09, 2022",
        1003 to "N/A",
        1004 to "N/A",
        1005 to "September 11, 2022")
    var bReturnDate = mutableMapOf<Int, String>(
        1001 to "September 25, 2022",
        1002 to "September 11, 2022",
        1003 to "N/A",
        1004 to "N/A",
        1005 to "September 18, 2022")
    var bLibrarianName = mutableMapOf<Int, String>(
        1001 to "librarian_jhong",
        1002 to "librarian_jhong",
        1003 to "N/A",
        1004 to "N/A",
        1005 to "librarian_jhong")

    //login users data
    var librarianUsername1: String = "librarian_jhong"
    var librarianPassword1: String = "jhong123"

    //data inputs
    var iISBN: Int = 0
    var iName: String = ""
    var iAuthor: String = ""
    var iPubDate: String = ""
    var iAvailability: Boolean = false
    var iBorrowedDate: String = ""
    var iReturnDate: String = ""
    var iBorrowerID: String = ""
    var iBorrowerName: String = ""
    var iLibrarianName: String = ""

    //User Interface/Interaction
    var loopLogIn: Boolean = true
    while (loopLogIn) {

        println()
        println("[      Welcome to KodeGo       ]" +
                "\n[Mobile Application Development]" +
                "\n[  Library Management System   ]")
        println()

        //login ui
        println("[--------LOGIN ACCOUNT---------]")
        print("Enter username: ")
        var usernameInput: String = readln()
        print("Enter password: ")
        var passwordInput: String = readln()

        //conditional statement for user login
        if ((usernameInput == librarianUsername1) && (passwordInput == librarianPassword1)) {



            var loopLibrary: Boolean = true
            while (loopLibrary){
                println()
                println("[-----------WELCOME------------]")

                //Library User Interface
                println("[account: $usernameInput]\n" +
                        "\n[1]List of all Books" +
                        "\n[2]Borrow" +
                        "\n[3]Return" +
                        "\n[X]Log out")
                print("Choose a number that available on the list to proceed.: ")
                var userChoose: String = readln().lowercase()

                //conditional statement for main menu
                if(userChoose == "1"){                                                          //[1]List of all Books
                    println()
                    println("[----------LIST OF BOOKS----------]")

                    //all books will display
                    for (key in bISBN.keys){
                        println("ISBN: $key" +
                                "\nTitle: ${bTitle[key]}" +
                                "\nAuthor: ${bAuthor[key]}" +
                                "\nAvailability: ${bAvailability[key]}")
                        println()
                    }

                    //loop the Question if incorrect input ISBN
                    var loopEnterISBN: Boolean = true
                    while (loopEnterISBN){
                        try{
                            println()
                            println("------------------------------------------------------")
                            print("Enter book ISBN to view details of the book. [0] to Exit." +
                                    "\nEnter here: ")
                            iISBN = readln().toInt()

                            if(iISBN == 0){ //Exit to Main Menu
                                loopEnterISBN = false

                            }else if(iISBN != bISBN[iISBN]){ //The ISBN Entered is incorrect
                                println("[REMINDER]: The ISBN you enter is not on our data.")

                                //Display the details of book
                            }else{
                                if(bAvailability[iISBN] == true){ //if the book is available
                                    println("[-------------Available Data-------------]")
                                    println("ISBN: ${bISBN[iISBN]}")
                                    println("Title: ${bTitle[iISBN]}")
                                    println("Author: ${bAuthor[iISBN]}")
                                    println("Published: ${bPubDate[iISBN]}")
                                    println("Availability: ${bAvailability[iISBN]}")
                                    println("[----------------------------------------]")

                                }else if(bAvailability[iISBN] == false){ //if the book is not available
                                    println("[-------------Available Data-------------]")
                                    println("ISBN: ${bISBN[iISBN]}")
                                    println("Title: ${bTitle[iISBN]}")
                                    println("Author: ${bAuthor[iISBN]}")
                                    println("Published: ${bPubDate[iISBN]}")
                                    println("Availability: ${bAvailability[iISBN]}\n")
                                    println("Borrowed by: ${bBorrowerName[iISBN]} - ${bBorrowerID[iISBN]}")
                                    println("Date Borrowed: ${bBorrowedDate[iISBN]} ")
                                    println("Return Date: ${bReturnDate[iISBN]} ")
                                    println("Approved by: ${bLibrarianName[iISBN]} ")
                                    println("[----------------------------------------]")
                                }
                            }
                        }catch (e: Exception){
                            println("[REMINDER]: Please Input a Digit Only.")
                        }
                    }

                }else if(userChoose == "2"){                                                                //[2]Borrow


                    //loop if the ISBN entered is incorrect
                    var loopBorrowBook: Boolean = true
                    while (loopBorrowBook){
                        try{
                            println()
                            println("[----------BORROW BOOKS----------]")
                            print("Enter book ISBN to borrow. [0] to Exit." +
                                    "\nEnter here: ")
                            iISBN = readln().toInt()

                            if(iISBN == 0){ //Exit to Main Menu
                                loopBorrowBook = false

                            }else if(iISBN == bISBN[iISBN]){ //display the details of the book
                                println("[-------------Available Data-------------]")
                                println("ISBN: ${bISBN[iISBN]}")
                                println("Title: ${bTitle[iISBN]}")
                                println("Author: ${bAuthor[iISBN]}")
                                println("Published: ${bPubDate[iISBN]}")
                                println("Availability: ${bAvailability[iISBN]}")
                                println("[----------------------------------------]")

                                var loopQuestionBorrowBook: Boolean = true
                                while(loopQuestionBorrowBook){
                                    if(bAvailability[iISBN] == true){ //if the book is available it will ask the user to borrow the book

                                        println()
                                        println("[?]Are you sure to borrow this book? [Y/N]")
                                        var borrowThisBook: String = readln().uppercase()
                                        if(borrowThisBook == "Y"){

                                            var loopInputBorrowBook: Boolean = true
                                            while (loopInputBorrowBook){
                                                print("Enter Borrower ID: ")
                                                iBorrowerID = readln()
                                                print("Enter Borrower Name: ")
                                                iBorrowerName = readln()
                                                println("(!)Follow the date format 'Month Day, Year'(September 05, 1996)")
                                                print("Enter today's date: ")
                                                iBorrowedDate = readln()
                                                print("Enter return date: \n")
                                                iReturnDate = readln()
                                                println("Approved by the Librarian: ")
                                                println("Librarian Name: $usernameInput")
                                                iLibrarianName = usernameInput

                                                if((iBorrowerID.isEmpty()) || (iBorrowerName.isEmpty()) || (iBorrowedDate.isEmpty())
                                                    || (iReturnDate.isEmpty()) || (iLibrarianName.isEmpty())){
                                                    println()
                                                    println("[EMPTY FIELDS] Borrowed Date and Return Date should NOT EMPTY. Please follow the date format 'Month Day, Year'(September 05, 1996')")

                                                }else{
                                                    bBorrowerID.put(iISBN, iBorrowerID.toString())
                                                    bBorrowerName.put(iISBN, iBorrowerName)
                                                    bBorrowedDate.put(iISBN, iBorrowedDate)
                                                    bReturnDate.put(iISBN, iReturnDate)
                                                    bAvailability.put(iISBN, false)
                                                    bLibrarianName.put(iISBN, iLibrarianName)

                                                    println()
                                                    println("[SUCCESSFUL] You borrowed [${bTitle[iISBN]} by ${bAuthor[iISBN]}].\n" +
                                                            "You should return the book on or before [$iReturnDate].")

                                                    loopInputBorrowBook = false
                                                    loopBorrowBook = false
                                                }
                                            }

                                        }else if(borrowThisBook == "N"){
                                            loopQuestionBorrowBook = false

                                        }else{
                                            println("[REMINDER] Please Choose Between [Y] and [N].")

                                        }
                                    }else if(bAvailability[iISBN] == false){ //if the book is not available it will remind the user
                                        println("[SORRY!]: This book is not available to borrow.")
                                        loopQuestionBorrowBook = false
                                    }
                                }

                            }else if(iISBN != bISBN[iISBN]){ //Entered ISBN is incorrect
                                println("[REMINDER]: The ISBN you enter is not on our data.")
                            }

                        }catch (e: Exception){
                            println("[REMINDER]: Please Input a Digit Only.")
                        }
                    }

                }else if(userChoose == "3"){                                                                //[3]Return

                    var loopReturnBook: Boolean = true
                    while (loopReturnBook) {
                        try {
                            println()
                            println("[----------RETURN BOOKS----------]")
                            print("Enter book ISBN to return. [0] to Exit." +
                                    "\nEnter here: ")
                            iISBN = readln().toInt()
                            if(iISBN == 0){
                                loopReturnBook = false

                            }else if(iISBN == bISBN[iISBN]){
                                println("[-------------Available Data-------------]")
                                println("ISBN: ${bISBN[iISBN]}")
                                println("Title: ${bTitle[iISBN]}")
                                println("Author: ${bAuthor[iISBN]}")
                                println("Published: ${bPubDate[iISBN]}")
                                println("Availability: ${bAvailability[iISBN]}")
                                println()
                                println("Borrowed by: ${bBorrowerName[iISBN]} - ${bBorrowerID[iISBN]}")
                                println("Date Borrowed: ${bBorrowedDate[iISBN]} ")
                                println("Return Date: ${bReturnDate[iISBN]} ")
                                println("Approved by: ${bLibrarianName[iISBN]} ")
                                println("[----------------------------------------]")

                                var loopQuestionReturnBook: Boolean = true
                                while (loopQuestionReturnBook){
                                    if(bAvailability[iISBN] == false){
                                        println()
                                        println("[?]Are you sure to return this book? [Y/N]")
                                        var returnThisBook: String = readln().uppercase()
                                        if(returnThisBook == "Y"){
                                            bBorrowerName.replace(iISBN, "N/A")
                                            bBorrowerID.replace(iISBN, "N/A")
                                            bBorrowedDate.replace(iISBN, "N/A")
                                            bReturnDate.replace(iISBN, "N/A")
                                            bAvailability.replace(iISBN, true)
                                            bLibrarianName.replace(iISBN, "N/A")

                                            println("(!)Successful! You returned [${bTitle[iISBN]} by ${bAuthor[iISBN]}].")

                                            loopReturnBook = false

                                        }else if(returnThisBook == "N"){
                                            loopQuestionReturnBook = false

                                        }else{
                                            println("[REMINDER] Please Choose Between [Y] and [N].")
                                        }

                                    }else if(bAvailability[iISBN] == true){
                                        println("[REMINDER]: Cannot return this book. To borrow this books go to Main Menu and choose [2]Borrow.")
                                        loopQuestionReturnBook = false
                                    }
                                }

                            }else if(iISBN != bISBN[iISBN]){
                                println("[REMINDER]: The ISBN you enter is not on our data.")
                            }

                        } catch (e: Exception) {
                            println("[REMINDER]: Please Input a Digit Only.")
                        }
                    }
                }else if(userChoose == "x"){
                    println()
                    println("Logging out..." +
                            "\n------------------------------------------------------")
                    loopLibrary = false

                }
            }

        }else if((usernameInput != librarianUsername1) || (passwordInput != librarianPassword1)){

            println("[LOGIN FAILED]: Incorrect username or password." +
                    "\n------------------------------------------------------")
        }
    }


}