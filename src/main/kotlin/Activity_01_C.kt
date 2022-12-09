import java.util.*

/*
You are tasked to automate an inventory system for a grocery.
Identify the items that can be bought in a grocery store.
After listing the different items, identify the characteristics of the items.

You are also tasked to group the items in categories to help manage the grocery.  Use the proper data types.
 */
fun main() {

    //datas
    var itemCode1: Long = 100211
    var itemName1: String = "Corned Beef"
    var itemDescription1: String = "Argentina, 260g"
    val itemCategory1: String = "Canned Foods"
    var itemStock1: Long = 36
    var itemPrice1: Float = 56.00.toFloat()

    var itemCode2: Long = 100212
    var itemName2: String = "Pork & Beans"
    var itemDescription2: String = "Hunt's, 100g"
    val itemCategory2: String = "Canned Foods"
    var itemStock2: Long = 22
    var itemPrice2: Float = 26.00.toFloat()

    var itemCode3: Long = 100213
    var itemName3: String = "Red Horse"
    var itemDescription3: String = "San Miguel, BIncan, 330ml"
    val itemCategory3: String = "Drinks"
    var itemStock3: Long = 5
    var itemPrice3: Float = 68.00.toFloat()

    var itemCode4: Long = 100214
    var itemName4: String = "Gatorade"
    var itemDescription4: String = "Gatorade, Blue Bolt, 500ml"
    val itemCategory4: String = "Drinks"
    var itemStock4: Long = 105
    var itemPrice4: Float = 51.00.toFloat()

    var itemCode5: Long = 100215
    var itemName5: String = "Pork"
    var itemDescription5: String = "Monterey, 1kg"
    val itemCategory5: String = "Frozen Foods"
    var itemStock5: Long = 50
    var itemPrice5: Float = 220.00.toFloat()

    var itemCode6: Long = 100216
    var itemName6: String = "Footlong Hot Dog"
    var itemDescription6: String = "Holiday,Jumbo, 1kg"
    val itemCategory6: String = "Frozen Foods"
    var itemStock6: Long = 50
    var itemPrice6: Float = 220.00.toFloat()

    var loopUI: Boolean = true

    //User Interface/Interaction
    println(
        "[      Welcome to KodeGo       ]" +
                "\n[Mobile Application Development]" +
                "\n[ Inventory Management System  ]"
    )

    //user interface looping
    while (loopUI) {

        println()
        println("[----------MAIN MENU----------]")

        println()
        println("[1]List of all Items" +
        "\n[2]List by Category" +
        "\n[X]Exit")
        print("Choose a number that available on the list or [X] to Exit: ")
        var userChoose: String = readln().uppercase()

            //[1]List of all items
        if(userChoose == "1") {

            println()
            println("[----------AVAILABLE ITEMS----------]")

            println()
            println("1. Item Code: [$itemCode1]" +
                    "\n$itemName1" +
                    "\n$itemDescription1" +
                    "\nCategory: $itemCategory1" +
                    "\nStock: $itemStock1" +
                    "\nPrice: $itemPrice1")

            println()
            println("2. Item Code: [$itemCode2]" +
                    "\n$itemName2" +
                    "\n$itemDescription2" +
                    "\nCategory: $itemCategory2" +
                    "\nStock: $itemStock2" +
                    "\nPrice: $itemPrice2")

            println()
            println("3. Item Code: [$itemCode3]" +
                    "\n$itemName3" +
                    "\n$itemDescription3" +
                    "\nCategory: $itemCategory3" +
                    "\nStock: $itemStock3" +
                    "\nPrice: $itemPrice3")

            println()
            println("4. Item Code: [$itemCode4]" +
                    "\n$itemName4" +
                    "\n$itemDescription4" +
                    "\nCategory: $itemCategory4" +
                    "\nStock: $itemStock4" +
                    "\nPrice: $itemPrice4")

            println()
            println("5. Item Code: [$itemCode5]" +
                    "\n$itemName5" +
                    "\n$itemDescription5" +
                    "\nCategory: $itemCategory5" +
                    "\nStock: $itemStock5" +
                    "\nPrice: $itemPrice5")

            println()
            println("6. Item Code: [$itemCode6]" +
                    "\n$itemName6" +
                    "\n$itemDescription6" +
                    "\nCategory: $itemCategory6" +
                    "\nStock: $itemStock6" +
                    "\nPrice: $itemPrice6")

            println()
            println("[----------------------------------------]")

            //[2]List by Category
        }else if(userChoose == "2"){

            println()
            println("[----------AVAILABLE CATEGORIES----------]")

            println()
            println("[1]Canned Foods" +
                    "\n[2]Drinks" +
                    "\n[3]Frozen Foods")
            print("Choose a number that available on the list or [X] to Exit: ")
            var userChooseCategory: String = readln().uppercase()

            //[1]Canned Foods
            if(userChooseCategory == "1"){
                println()
                println("[----------AVAILABLE CANNED FOODS ITEMS----------]")

                println()
                println("1. Item Code: [$itemCode1]" +
                        "\n$itemName1" +
                        "\n$itemDescription1" +
                        "\nCategory: $itemCategory1" +
                        "\nStock: $itemStock1" +
                        "\nPrice: $itemPrice1")

                println()
                println("2. Item Code: [$itemCode2]" +
                        "\n$itemName2" +
                        "\n$itemDescription2" +
                        "\nCategory: $itemCategory2" +
                        "\nStock: $itemStock2" +
                        "\nPrice: $itemPrice2")

                println()
                println("[----------------------------------------]")

                //[2]Canned Foods
            }else if(userChooseCategory == "2"){
                println()
                println("[----------AVAILABLE DRINKS ITEMS----------]")

                println()
                println("1. Item Code: [$itemCode3]" +
                        "\n$itemName3" +
                        "\n$itemDescription3" +
                        "\nCategory: $itemCategory3" +
                        "\nStock: $itemStock3" +
                        "\nPrice: $itemPrice3")

                println()
                println("2. Item Code: [$itemCode4]" +
                        "\n$itemName4" +
                        "\n$itemDescription4" +
                        "\nCategory: $itemCategory4" +
                        "\nStock: $itemStock4" +
                        "\nPrice: $itemPrice4")

                println()
                println("[----------------------------------------]")

                //[3]Canned Foods
            }else if(userChooseCategory == "3"){
                println()
                println("[----------AVAILABLE FROZEN FOODS ITEMS----------]")

                println()
                println("1. Item Code: [$itemCode5]" +
                        "\n$itemName5" +
                        "\n$itemDescription5" +
                        "\nCategory: $itemCategory5" +
                        "\nStock: $itemStock5" +
                        "\nPrice: $itemPrice5")

                println()
                println("2. Item Code: [$itemCode6]" +
                        "\n$itemName6" +
                        "\n$itemDescription6" +
                        "\nCategory: $itemCategory6" +
                        "\nStock: $itemStock6" +
                        "\nPrice: $itemPrice6")

                println()
                println("[----------------------------------------]")

                //if user choose to exit it will show the main user interface
            }else if(userChooseCategory == "X"){
                println()
                println("[----------------------------------------]")
                loopUI = continue

            }else{
                println("ERROR:The number you've been enter is not on the list.")
            }

            //Exit
        }else if(userChoose == "X"){
            println()
            print("[----------Have a good day, GOODBYE!----------]")
            loopUI = false

            //if User input number or character that not on the list
        }else{
            println("ERROR:The number you've been enter is not on the list.")
        }
    }
}