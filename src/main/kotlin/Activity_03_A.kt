/*
Covered Topic(s) : Functions

Instructions :

Note: Names are single word with no spaces example, "Marco", "Eugene", "Sarah", "Isaiah", "Anthony", "Henry".

1. Create an ArrayList of names with 20 entries.
2. Create a function "isStudentInRecord" that will accept a name and return true if the name is found, otherwise false.
3. Create a function "addStudent" that will accept a name and add it to the ArrayList.
4. Create a function "removeStudent"  that will accept a name and remove it from the ArrayList.
5. Create a function "countStudent" that will return the size of the ArrayList.
6. Create a function "searchStudentWildSearch" that will accept a String and search if that string is found with in the ArrayList, it will return an ArrayList of names that matched if there are.
7. Create a function  "searchStudentName" that will accept a String and search if there is an exact match of the String input, it will return an ArrayList of names that matched if there are.
8. Create a function "searchStudent" that will accept a String and call "searchStudentWildSearch" if the String input is less than or equal to three, and it will call "searchStudentName" if the String input is greater than three.
9.  Create a function "showStudents" that will print all the entries in the ArrayList.
 */
fun main(){

    var studentsObject = Students()

    var inputName: String = ""
    var inputUserChoose: String = ""

    //User Interface/Interaction
    println("[      Welcome to KodeGo       ]" +
            "\n[Mobile Application Development]" +
            "\n[      Students Directory      ]")

    var loopMainMenuStudent: Boolean = true
    while (loopMainMenuStudent){
        println()
        println("[1] List of all Student" +
                "\n[2] Add Student" +
                "\n[3] Remove Student" +
                "\n[4] Count Students" +
                "\n[5] Search" +
                "\n[6] Check Student in Record" +
                "\n[X] Exit")
        print("Choose a number that available on the list or [X] to Exit: ")
        inputUserChoose = readln().uppercase()

        if(inputUserChoose == "1"){
            println()
            println("[----------LIST OF STUDENTS----------]")
            println()
            studentsObject.showStudents()

        }else if(inputUserChoose == "2"){
            println()
            println("[----------ADD STUDENT----------]")

            var loopAddStudent: Boolean = true
            while (loopAddStudent){

                print("Enter Name: ")
                inputName = readln()
                studentsObject.addStudent(inputName)

                println()
                print("Do you want to add another Student?" +
                        "\n[Y]es or [N]o: ")
                inputUserChoose = readln().uppercase()
                println("----------------------------")

                if (inputUserChoose == "N"){
                    loopAddStudent = false

                }else if(inputUserChoose == "Y"){
                    loopAddStudent = continue
                }else{
                    println("Invalid! Please choose between [Y]es or [N]o")
                    loopAddStudent = false
                }
            }
        }else if(inputUserChoose == "3"){
            println()
            println("[----------REMOVE STUDENT----------]")
            var loopRemoveStudent: Boolean = true
            while (loopRemoveStudent){

                print("Enter Name: ")
                inputName = readln()
                studentsObject.removeStudent(inputName)

                println()
                print("Do you want to remove another Student?" +
                        "\n[Y]es or [N]o: ")
                inputUserChoose = readln().uppercase()

                if (inputUserChoose == "N"){
                    loopRemoveStudent = false

                }else if(inputUserChoose == "Y"){
                    loopRemoveStudent = continue

                }else{
                    println("Invalid! Please choose between [Y]es or [N]o")
                    loopRemoveStudent = false
                }
            }
        }else if(inputUserChoose == "4"){
            println()
            println("[----------TOTAL STUDENTS----------]")
            studentsObject.countStudents()

        }else if(inputUserChoose == "5"){
            println()
            println("[----------SEARCH STUDENTS----------]")

            print("Enter Name: ")
            inputName = readln()
            studentsObject.searchStudent(inputName)

        }else if(inputUserChoose == "6"){
            println("[----------CHECK THE STUDENT IN THE RECORD----------]")
            print("Enter Name: ")
            inputName = readln()
            studentsObject.isStudentInRecord(inputName)
        }else if(inputUserChoose == "X"){
            println()
            println("Shutting down..." +
                    "\n------------------------------------------------------")
            loopMainMenuStudent = false
        }else{
            println("[ERROR: The number you've been enter is not on the list]")
        }
    }

}

class Students(){
    var studentList = ArrayList<String>(20)


    fun isStudentInRecord(name: String): Boolean{

        if (studentList.contains(name)){
            println("TRUE")
            true
        }else{
            println("FALSE")
            false
        }
        return true
    }

    fun addStudent(name: String){
        if(studentList.size >= 20){
            println("[REMINDER]: Student data is full, you can only add 20 students!")

        }else{
            studentList.add(name)
            println("(${name}) successfully added to database!")
        }
    }

    fun removeStudent(name: String){
        if(studentList.contains(name)){
            println("Are you sure to remove $name on the list?" +
                    "\n[Y]es or [N]o: ")
            var userChoiceToRemove: String = readln().uppercase()
            if(userChoiceToRemove == "Y"){
                studentList.remove(name)
                println("(${name}) successfully removed from database!")
            }

        }else{
            println("The (${name}) not on the List of Student!")
        }
    }

    fun countStudents(){
        println("The total of ${studentList.count()} students.")

    }

    fun searchStudentWildSearch(name: String){
        val filterName : List<String> = studentList.filter { it.startsWith(name) }

        if(filterName.isEmpty()){
            println("[NO STUDENTS AVAILABLE]")
        }else{
            println("All of names searched:")
            for (list in filterName.indices){
                println("${list+1}. ${filterName[list]}")
            }
        }
    }

    fun searchStudentName(name: String){
        var filterName: List<String> = studentList.filter { it == name }

        if(filterName.isEmpty()){
            println("[NO STUDENTS AVAILABLE]")
        }else{
            println("All of names searched:")
            for (list in filterName.indices){
                println("${list+1}. ${filterName[list]}")
            }
        }

    }

    fun searchStudent(name: String){

        if (name.length <= 3){
            searchStudentWildSearch(name)
        }else{
            searchStudentName(name)
        }
    }

    fun showStudents(){
        if(studentList.isEmpty()){
            println("[NO STUDENTS AVAILABLE]")
        }else{
            for (list in studentList.indices) {
                println("${list+1}. ${studentList[list]}")
            }
        }
    }
}