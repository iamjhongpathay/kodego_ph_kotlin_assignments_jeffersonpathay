import Activity_04_A.Student

/*
Covered Topic(s) : Classes

Instructions :
1. Use class to represent the student rather string.Make sure the student has a firstName, lastName, nickName, id and year enrolled
2. Update the searchStudentWildSearch to search for the wild string in the lastname, middle name, and firstname. Return the Arraylist of students
that match the searched string, if there are no entries return an empty ArrayList.
3. Add a function searchStudentWildSearch that will accept a string and either of the following values, lastname, middlename, nickname.
This will search the specific wild string depending on where it was mentioned to be searched for. Return the Arraylist of students that match the searched string,
if there are no entries return an empty ArrayList.
 */

fun main() {

    var student = Student()

//User Interface/Interaction
    println("[      Welcome to KodeGo       ]" +
            "\n[Mobile Application Development]" +
            "\n[      Students Directory      ]")
    println()
    var loopMenu: Boolean = true
    while (loopMenu){
        println()
        println("[1] Student List \n" +
                "[2] Add Student \n" +
                "[3] Search \n" +
                "[X] Exit")
        print("Choose a number that available on the list or [X] to Exit: ")
        var userChoose: String = readln()
        if (userChoose == "1"){
            println()
            println("[----------LIST OF STUDENTS----------]")
            println()
            student.displayAllStudent()
            println()
            println("[------------------------------------]")
            println()

        }else if(userChoose == "2"){
            try {
                println()
                println("[----------ADD STUDENT----------]")
                println()

                println("First Name: ")
                var iFirstName: String = readln()
                println("Middle Name: ")
                var iMiddleName: String = readln()
                println("Last Name: ")
                var iLastName: String = readln()
                println("Student ID: ")
                var iStudentID: Long = readln().toLong()
                println("Year Enrolled: ")
                var iYearEnrolled: Int = readln().toInt()

                if(iFirstName.isEmpty() || iLastName.isEmpty() || iStudentID.toString().isEmpty() || iYearEnrolled.toString().isEmpty()){
                    println()
                    println("[[!] First and last name, student ID and year enrolled is required]")
                    println()
                }else if(iMiddleName.isEmpty()){
                    student.addStudent(iFirstName, "N/A", iLastName, iStudentID, iYearEnrolled)
                }else{
                    student.addStudent(iFirstName, iMiddleName, iLastName, iStudentID, iYearEnrolled)
                }

            }catch (e: Exception){
                println("[Invalid] Enter Numbers Only > Student Id and Year Enrolled!")
            }

        }else if(userChoose == "3"){
            println()
            println("[----------SEARCH STUDENT----------]")

            var enterName: String = ""

            var loopSearch: Boolean = true
            while (loopSearch){
                println()
                println("Search by: \n" +
                        "[1]First Name \n" +
                        "[2]Middle Name \n" +
                        "[3]Last Name \n" +
                        "[X]Exit")
                print("Enter here: ")
                var userChooseToSearch: String = readln().lowercase()

                if(userChooseToSearch == "1") {
                    print("Enter their first name: ")
                    enterName = readln()
                    student.searchFirstName(enterName)

                }else if(userChooseToSearch == "2"){
                    print("Enter their middle name: ")
                    enterName = readln()
                    student.searchMiddleName(enterName)

                }else if(userChooseToSearch == "3"){
                    print("Enter their last name: ")
                    enterName = readln()
                    student.searchLastName(enterName)

                }else if(userChooseToSearch == "x"){
                    loopSearch = false
                }else{
                    println("[[!] Not on the list]")
                }
            }


        }
    }
}