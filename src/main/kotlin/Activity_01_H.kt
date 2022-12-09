/*
Create an application that will accept 2 Integers.
It will identify the lower value and bigger value of the two inputs.
Then, your application will print all the prime numbers starting from the lower number up to the largest number.

Scope :
String
Loops

Input:
1, 4 -> 1, 2, 3
10 -> 1, 2, 3, 5, 7
 */
fun main(){
    //User Interface/Interaction
    println()
    println("[      Welcome to KodeGo       ]" +
            "\n[Mobile Application Development]")
    println()

    print("Enter first Integer: ")
    var firstInt : Int = readln().toInt()
    print("Enter second Integer: ")
    var secondtInt : Int = readln().toInt()


    if(firstInt < secondtInt){  //Identify first if the first Int is lower value than second Int
        println("The $firstInt is less than $secondtInt")

        while(firstInt < secondtInt) {
            if (primeNumbers(firstInt))
                println(firstInt.toString())
            firstInt++
        }

    }else if(secondtInt < firstInt){    //Identify if the second Int is lower value than first Int
        println("The $secondtInt is less than $firstInt")

        while(secondtInt < firstInt) {
            if (primeNumbers(secondtInt))
                println(secondtInt.toString())
            secondtInt++
        }
    }
}

// user-define function = with boolean return and 1 parameter
fun primeNumbers(numInt: Int): Boolean{ //numInt = firstInt or secondInt it depends what is the lowest value
    var ctr = true

    for(i in 2 .. numInt / 2){
        if (numInt % i == 0){
            ctr = false
            break
        }
    }
    return ctr
}