import java.lang.Exception
import java.util.*

/*
Implement Activity 01 -  A using data structure.
 */
fun main(){

    var studentID = mutableMapOf<Long, Long>(
        10000141116 to 10000141116,
        10000141117 to 10000141117,
        10000141118 to 10000141118,
        10000141119 to 10000141119,
        10000141120 to 10000141120)
    var name = mutableMapOf<Long, String>(
        10000141116 to "Jefferson Pathay",
        10000141117 to "Juan Tamad",
        10000141118 to "Maria Clara",
        10000141119 to "Jose Mari Chan",
        10000141120 to "Ma. Angelica Etang")
    var age = mutableMapOf<Long, Int>(
        10000141116 to 26,
        10000141117 to 31,
        10000141118 to 24,
        10000141119 to 26,
        10000141120 to 25)
    var gender = mutableMapOf<Long, String>(
        10000141116 to "Male",
        10000141117 to "Male",
        10000141118 to "Female",
        10000141119 to "Male",
        10000141120 to "Female")
    var address = mutableMapOf<Long, String>(
        10000141116 to "Las Piñas City",
        10000141117 to "Cavite City",
        10000141118 to "Batangas City",
        10000141119 to "Pasay City",
        10000141120 to "Muntinlupa City")
    var isPresent = mutableMapOf<Long, Boolean>(
        10000141116 to true,
        10000141117 to false,
        10000141118 to true,
        10000141119 to true,
        10000141120 to false)

    var inputStudentID: Long = 0

    var loopUI: Boolean = true

    //User Interface/Interaction
    println("[      Welcome to KodeGo       ]" +
            "\n[Mobile Application Development]" +
            "\n[      Students Directory      ]")


    //Looping the User Interface
    while(loopUI){

        try{
            println()
            println("[-------LIST OF STUDENTS-------]")
            println()

            for(key in studentID.keys){
                println("[$key]" +
                        "\n${name[key]}" +
                        "\n${age[key]}" +
                        "\n${gender[key]}" +
                        "\n${address[key]}" +
                        "\nToday's Attendance: ${isPresent[key]}" +
                        "\n")
            }

            println()
            //User choose a number from the list to update the student attendance
            print("Enter Student ID to update Today's Attendance: ")
            inputStudentID = readln().toLong()


            if(inputStudentID == studentID[inputStudentID]){

                var loopUpdateAttendance: Boolean = true
                while (loopUpdateAttendance){
                    println()
                    print("Present today's classes?[Y]es/[N]o" +
                            "\nEnter here: ")
                    var userChooseYesNo: String = readln().uppercase()

                    if(userChooseYesNo == "Y"){
                        isPresent.replace(inputStudentID, true)
                        loopUpdateAttendance = false

                    }else if(userChooseYesNo == "N"){
                        isPresent.replace(inputStudentID, false)
                        loopUpdateAttendance = false

                    }else{
                        println("[REMINDER]: Please choose between [Y]es or [N]o")
                    }
                }

            }else{
                println("[ERROR: The number you've been enter is not on the list]")
            }
        }
        catch(e: Exception){
            println("[ERROR: Please enter a NUMBER Only!]")
        }

    }


}