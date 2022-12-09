/*
Create an application that will accept 2 string inputs.
Your application will print all unique characters in both Strings.

Scope :

String
Loops
 */
fun main(){

    //User Interface/Interaction
    println("[      Welcome to KodeGo       ]" +
            "\n[Mobile Application Development]")
    println()

    print("Enter 1st word: ")
    var firstStringInput: String = readln().lowercase()
    print("Enter 2nd word: ")
    var secondStringInput: String = readln().lowercase()

    var sameCharacter: String = ""
    for(a in firstStringInput.indices){
        for(b in secondStringInput.indices){
            if(firstStringInput[a] == secondStringInput[b]){
                sameCharacter += firstStringInput[a]
            }
        }
    }

    for(ctr in sameCharacter.indices){
       var replaceChar = sameCharacter[ctr] + ""

        //the same character of firstStringInput and secondStringInput will replace with empty spaces
        firstStringInput = firstStringInput.replace(replaceChar, "")
        secondStringInput = secondStringInput.replace(replaceChar, "")
    }

    println()
    println("The unique characters are [$firstStringInput$secondStringInput]")

}