/*
Create an application that will accept 1 string.
Your application will print “Palindrome” if the string is a palindrome.

Scope :

String
Loops

Ex :
GIRAFARIG - Palindrome
101 - Palindrome
RACECAR - Palimdrome
GATE - Not Palindrome
 */
fun main(){

    //User Interface/Interaction
    println("[      Welcome to KodeGo       ]" +
            "\n[Mobile Application Development]")
    println()

    print("Enter a String: ")
    var inputWord : String = readln().lowercase()

    var reverseString : String = ""
    var ctr : Int = inputWord.length - 1

    //checking the string by reversed
    while(ctr != -1){
        reverseString += inputWord[ctr--]
    }

    //condition to know the inputWord and reverseString are equal to Palindrome or NOT
    if(inputWord.uppercase() == reverseString.uppercase()){
        println("${reverseString.uppercase()} - Palindrome")
    }else
        println("${reverseString.uppercase()} - Not Palindrome")
}