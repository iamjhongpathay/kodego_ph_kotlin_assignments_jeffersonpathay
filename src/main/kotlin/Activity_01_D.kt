/*
Create an application that will accept 5 monetary amounts.
After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
The total of the 5  input will be divided by the answer in the second question input.

Note: Error checking must be done.
 */
fun main(){

    var totalAmount: Long = 0
    var totalDividedBy: Double = 0.0
    var uiLoop: Boolean = true

    //User Interface/Interaction
    println("[      Welcome to KodeGo       ]" +
                "\n[Mobile Application Development]")

    //user interface loop
    while(uiLoop){
        try {

            println()
            for (i in 1 .. 5){ //the user need to enter an amount 5 times
                print("$i) Enter an amount: ")
                var inputAmount: Long = readln().toLong()
                totalAmount += inputAmount
            }

            //user will ask to input a digit that will divide the totalAmount
            println()
            println("[?]Divide by how many? ")
            var dividedBy: Int = readln().toInt()
            totalDividedBy = totalAmount / dividedBy.toDouble()

            //Output
            println()
            println("The Sum of the amount you entered is: $totalAmount" +
                    "\n$totalAmount is Divided by $dividedBy" +
                    "\nThe Total is $totalDividedBy")

            uiLoop = false

        }catch (e: NumberFormatException){
            println("[REMINDER]: Please Enter Digits Only")
            println()
        }

    }
}