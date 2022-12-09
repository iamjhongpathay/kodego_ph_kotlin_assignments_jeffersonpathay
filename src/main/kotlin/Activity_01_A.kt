import java.util.*

/*
You are tasked to create a directory of the students taking this course.
The data will be used to send updates regarding the classes.
There is also a need to know the progress of the students during the progress of this course.

List down all data that can be used to implement this. Use the proper data types.
 */

fun main(){

    //Students Details to be display
    var studentID1: Long = 10000141116
    var name1: String = "Jefferson Pathay"
    var age1: Int = 26
    var gender1: String = "Male"
    var address1: String = "Las Piñas City"
    var isPresent1: Boolean = true

    var studentID2: Long = 10000141117
    var name2: String = "Juan Tamad"
    var age2: Int = 31
    var gender2: String = "Male"
    var address2: String = "Cavite City"
    var isPresent2: Boolean = false

    var studentID3: Long = 10000141118
    var name3: String = "Maria Clara"
    var age3: Int = 24
    var gender3: String = "Female"
    var address3: String = "Batangas City"
    var isPresent3: Boolean = true

    var studentID4: Long = 10000141119
    var name4: String = "Jose Mari Chan"
    var age4: Int = 26
    var gender4: String = "Male"
    var address4: String = "Pasay City"
    var isPresent4: Boolean = true

    var studentID5: Long = 10000141110
    var name5: String = "Angel Etang"
    var age5: Int = 25
    var gender5: String = "Female"
    var address5: String = "Muntinlupa City"
    var isPresent5: Boolean = false


    var loopUI: Boolean = true

    //User Interface/Interaction
    println("[      Welcome to KodeGo       ]\n" +
            "[Mobile Application Development]\n" +
            "[      Students Directory      ]")



        //Looping the User Interface
        while(loopUI){

            try{
                println()
                println("[-------LIST OF STUDENTS-------]")
                println()

                println("[1].\nStudent ID: $studentID1 " +
                        "\nName: $name1 " +
                        "\nAge: ${age1}yrs. old " +
                        "\nGender: $gender1 " +
                        "\nAddress: $address1 " +
                        "\nToday's Attendance: $isPresent1")

                println()
                println("[2].\nStudent ID: $studentID2 " +
                        "\nName: $name2 " +
                        "\nAge: ${age2}yrs. old " +
                        "\nGender: $gender2 " +
                        "\nAddress: $address2 " +
                        "\nToday's Attendance: $isPresent2")

                println()
                println("[3].\nStudent ID: $studentID3 " +
                        "\nName: $name3 " +
                        "\nAge: ${age3}yrs. old " +
                        "\nGender: $gender3 " +
                        "\nAddress: $address3 " +
                        "\nToday's Attendance: $isPresent3")

                println()
                println("[4].\nStudent ID: $studentID4 " +
                        "\nName: $name4 " +
                        "\nAge: ${age4}yrs. old " +
                        "\nGender: $gender4 " +
                        "\nAddress: $address4 " +
                        "\nToday's Attendance: $isPresent4")

                println()
                println("[5].\nStudent ID: $studentID5 " +
                        "\nName: $name5 " +
                        "\nAge: ${age5}yrs. old " +
                        "\nGender: $gender5 " +
                        "\nAddress: $address5 " +
                        "\nToday's Attendance: $isPresent5")

                println()
                //User choose a number from the list to update the student attendance
                print("[Choose a Number to update Today's Attendance]: ")
                var enterNumber: Int = readln().toInt()

                if(enterNumber == 1){

                    println()
                    println("1.\nStudent ID: $studentID1 " +
                            "\nName: $name1 " +
                            "\nToday's Attendance: $isPresent1")

                    println()
                    print("Present today's classes?[Y/N] ")
                    var userChooseYesNo: String = readln().lowercase(Locale.getDefault())

                    if(userChooseYesNo == "y"){
                        isPresent1 = true

                    }else if(userChooseYesNo == "n"){
                        isPresent1 = false
                    }else{
                        println("[ERROR: Please choose between Y/N]")
                    }

                }else if(enterNumber == 2){
                    println()
                    println("2.\nStudent ID: $studentID2 " +
                            "\nName: $name2 " +
                            "\nToday's Attendance: $isPresent2")

                    println()
                    print("Present today's classes?[Y/N] ")
                    var userChooseYesNo: String = readln().lowercase(Locale.getDefault())

                    if(userChooseYesNo == "y"){
                        isPresent2 = true

                    }else if(userChooseYesNo == "n"){
                        isPresent2 = false
                    }else{
                        println("[ERROR: Please choose between Y/N]")
                    }

                }else if(enterNumber == 3){
                    println()
                    println("3.\nStudent ID: $studentID3 " +
                            "\nName: $name3 " +
                            "\nToday's Attendance: $isPresent3")

                    println()
                    print("Present today's classes?[Y/N] ")
                    var userChooseYesNo: String = readln().lowercase(Locale.getDefault())

                    if(userChooseYesNo == "y"){
                        isPresent3 = true

                    }else if(userChooseYesNo == "n"){
                        isPresent3 = false
                    }else{
                        println("[ERROR: Please choose between Y/N]")
                    }

                }else if(enterNumber == 4){
                    println()
                    println("4.\nStudent ID: $studentID4 " +
                            "\nName: $name4 " +
                            "\nToday's Attendance: $isPresent4")

                    println()
                    print("Present today's classes?[Y/N] ")
                    var userChooseYesNo: String = readln().lowercase(Locale.getDefault())

                    if(userChooseYesNo == "y"){
                        isPresent4 = true

                    }else if(userChooseYesNo == "n"){
                        isPresent4 = false
                    }else{
                        println("[ERROR: Please choose between Y/N]")
                    }

                }else if(enterNumber == 5){
                    println()
                    println("5.\nStudent ID: $studentID5 " +
                            "\nName: $name5 " +
                            "\nToday's Attendance: $isPresent5")

                    println()
                    print("Present today's classes?[Y/N] ")
                    var userChooseYesNo: String = readln().lowercase(Locale.getDefault())

                    if(userChooseYesNo == "y"){
                        isPresent5 = true

                    }else if(userChooseYesNo == "n"){
                        isPresent5 = false
                    }else{
                        println("[ERROR: Please choose between Y/N]")
                    }

                }else{
                    println("[ERROR: The number you've been enter is not on the list]")
                }
            }
            catch(e: NumberFormatException){
                println("[ERROR: Please enter a NUMBER Only!]")
            }

    }


}