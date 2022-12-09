import java.lang.Exception

/*
Using Activity 01 - C
Implement a process where items are added to the grocery cart.

User : Cashier

Goal : List of Items bought, how many items were bought and total cost.

Scope :
Data Structures
 */
fun main(){

    var itemCode = mutableMapOf<String, String>(
        "PNB123" to "PNB123",
        "CB123" to "CB123",
        "RD123" to "RD123",
        "GBB123" to "GBB123",
        "PRK123" to "PRK123",
        "FLHD123" to "FLHD123")
    var itemCategory = mutableMapOf<String, String>(
        "PNB123" to "Canned Foods",
        "CB123" to "Canned Foods",
        "RD123" to "Drinks",
        "GBB123" to "Drinks",
        "PRK123" to "Frozen Foods",
        "FLHD123" to "Frozen Foods")
    var itemName = mutableMapOf<String, String>(
        "PNB123" to "Pork & Beans",
        "CB123" to "Corned Beef",
        "RD123" to "Red Horse",
        "GBB123" to "Gatorade Blue Bolt",
        "PRK123" to "Pork",
        "FLHD123" to "Footlong Hot Dog")
    var itemDescription = mutableMapOf<String, String>(
        "PNB123" to "Hunt's Pork & Beans, 100g",
        "CB123" to "Argentina, 260g",
        "RD123" to "San Miguel, Beer In Can, 330ml",
        "GBB123" to "Gatorade, Blue Bolt, 500ml",
        "PRK123" to "Monteray, 1kg",
        "FLHD123" to "Holiday, 1kg")
    var itemStock = mutableMapOf<String, Int>(
        "PNB123" to 611,
        "CB123" to 50,
        "RD123" to 125,
        "GBB123" to 465,
        "PRK123" to 154,
        "FLHD123" to 512)
    var itemPrice = mutableMapOf<String, Double>(
        "PNB123" to 56.4,
        "CB123" to 56.00,
        "RD123" to 68.00,
        "GBB123" to 51.00,
        "PRK123" to 220.00,
        "FLHD123" to 168.00)

    var inputItemCode: String = ""
    var inputQuantity: Int = 0

    var listOfItemBought = mutableMapOf<String, String>()
    var totalQuantity: Int = 0
    var totalPrice: Double = 0.0
    var overAllQuantity: Int = 0
    var overAllCost: Double = 0.0

    //login users data
    var cashierUsername1: String = "cashier_jhong"
    var cashierPassword1: String = "jhong123"

    var loopLogin: Boolean = true
    while (loopLogin){

        //User Interface/Interaction
        println("[      Welcome to KodeGo       ]" +
                "\n[Mobile Application Development]" +
                "\n[ Inventory Management System  ]")
        println()

        //login ui
        println("[--------LOGIN ACCOUNT---------]")
        print("Enter username: ")
        var usernameInput: String = readln()
        print("Enter password: ")
        var passwordInput: String = readln()

        if((usernameInput == cashierUsername1) && (passwordInput == cashierPassword1)){

            var loopMainMenu: Boolean = true
            while (loopMainMenu){
                println()
                println("[----------MAIN MENU----------]")
                println("[Account: $usernameInput]")
                println()
                println("[1]List of all Items" +
                        "\n[2]List by Category" +
                        "\n[3]Grocery Cart"+
                        "\n[X]Logout")
                print("Choose a number that available on the list or [X] to Exit: ")
                var userChoose: String = readln().uppercase()

                if(userChoose == "1"){                                                          //[1]List of all items
                    println()
                    println("[----------LIST OF ALL ITEMS----------]")

                    //all items will display
                    for (key in itemCode.keys){
                        println("Item Code: $key" +
                                "\nName:        ${itemName[key]}" +
                                "\nDescription: ${itemDescription[key]}" +
                                "\nCategory:    ${itemCategory[key]}" +
                                "\nStock:       ${itemStock[key]}" +
                                "\nPrice:       ${itemPrice[key]}")
                        println()
                    }
                }else if(userChoose == "2"){                                                    //[2]List by Category

                    var loopCategories: Boolean = true
                    while(loopCategories){
                        println()
                        println("[----------AVAILABLE CATEGORIES----------]")

                        println()
                        println("[1]Canned Foods" +
                                "\n[2]Drinks" +
                                "\n[3]Frozen Foods")
                        print("Choose a number that available on the list or [X] to Exit: ")
                        var userChooseCategory: String = readln().uppercase()

                        if(userChooseCategory == "1"){
                            println()
                            println("[----------AVAILABLE CANNED FOODS ITEMS----------]")

                            for ((key, value) in itemCategory){
                                if (value == "Canned Foods"){
                                    println("Item Code: $key" +
                                            "\nName:        ${itemName[key]}" +
                                            "\nDescription: ${itemDescription[key]}" +
                                            "\nStock:       ${itemStock[key]}" +
                                            "\nPrice:       ${itemPrice[key]}")
                                    println()
                                }
                            }
                        }else if(userChooseCategory == "2"){
                            println()
                            println("[----------AVAILABLE DRINKS ITEMS----------]")

                            for ((key, value) in itemCategory){
                                if (value == "Drinks"){
                                    println("Item Code: $key" +
                                            "\nName:        ${itemName[key]}" +
                                            "\nDescription: ${itemDescription[key]}" +
                                            "\nStock:       ${itemStock[key]}" +
                                            "\nPrice:       ${itemPrice[key]}")
                                    println()
                                }
                            }
                        }else if(userChooseCategory == "3"){
                            println()
                            println("[----------AVAILABLE FROZEN FOODS ITEMS----------]")

                            for ((key, value) in itemCategory){
                                if (value == "Frozen Foods"){
                                    println("Item Code: $key" +
                                            "\nName:        ${itemName[key]}" +
                                            "\nDescription: ${itemDescription[key]}" +
                                            "\nStock:       ${itemStock[key]}" +
                                            "\nPrice:       ${itemPrice[key]}")
                                    println()
                                }
                            }
                        }else if(userChooseCategory == "X"){
                            loopCategories = false

                        }else{
                            println("[REMINDER]: You enter a number that not on the list")
                        }
                    }

                }else if(userChoose == "3"){                                                    //[3]Grocery Cart
                    println()
                    println("[--------------------GROCERY CART--------------------]")

                    println("[----------AVAILABLE ITEMS----------]")
                    //all items will display
                    println("Item Code:")
                    for (key in itemCode.keys){
                        println("[$key] - ${itemName[key]} (${itemDescription[key]}) - Stock: ${itemStock[key]} - Price: ${itemPrice[key]}")
                    }
                    var loopGroceryCart: Boolean = true
                    while (loopGroceryCart){
                        println()
                        print("Enter Item Code to add to cart or [X] to cancel: " +
                                "\nEnter here:")
                        inputItemCode = readln().uppercase()

                            if (inputItemCode == "X") {
                                loopGroceryCart = break
                                listOfItemBought.clear()

                            } else if (inputItemCode != itemCode[inputItemCode]) {
                                println("[REMINDER]: The Item Code you entered is not on our data.")

                            } else if (inputItemCode == itemCode[inputItemCode]) {
                                var loopEnterQuantity: Boolean = true
                                while (loopEnterQuantity){
                                    try{
                                        println("[--------------------ITEM DETAILS--------------------]")
                                        println("Item Code:[${itemCode[inputItemCode]}]" +
                                                "\nName:        ${itemName[inputItemCode]}" +
                                                "\nDescription: ${itemDescription[inputItemCode]}" +
                                                "\nStock:       [${itemStock[inputItemCode]}]" +
                                                "\nPrice:       ${itemPrice[inputItemCode]}")
                                        println()

                                        print("Enter Quantity: ")
                                        inputQuantity = readln().toInt()
                                        totalPrice = inputQuantity * itemPrice[inputItemCode]!!
                                        loopEnterQuantity = false

                                    }catch (e: Exception){
                                        println("[REMINDER]: Please Enter Digits Only")
                                    }
                                }

                            }

                        var allItemDetails: String = "[${itemCode[inputItemCode]}] ${itemName[inputItemCode]} (${itemDescription[inputItemCode]}, Price: ${itemPrice[inputItemCode]}), " +
                                "\nQTY: $inputQuantity, TOTAL: $totalPrice"
                            listOfItemBought.put(inputItemCode, allItemDetails)

                        overAllQuantity += inputQuantity
                        overAllCost += totalPrice

                        println("[--------------------YOUR CART--------------------]" +
                                "\n")
                        for (key in listOfItemBought.keys){
                            println(">${key}. ${listOfItemBought[key]}")
                            println()
                        }
                        println("[-------------------------------------------------]" +
                                "\n")

                        println(
                            "Do you want to add another item?" +
                                    "\nEnter [Y]es or [N]o:"
                        )
                        var addAnotherItem: String = readln().uppercase()

                        if (addAnotherItem == "N") {
                            println("[--------------------YOUR RECEIPT--------------------]")
                            println("Cashier Counter 1               CASHIER $usernameInput")
                            println()

                            println("ITEMS:")

                            for (key in listOfItemBought.keys){
                                println(">${key}. ${listOfItemBought[key]}")
                            }
                            println()

                            println("TOTAL QTY:                            $overAllQuantity" +
                                    "\n     COST:                            $overAllCost")
                            println("[----------------------------------------------------]" +
                                    "\n")

                            loopGroceryCart = false
                            listOfItemBought.clear()

                        } else if ((addAnotherItem != "Y") && (addAnotherItem != "N")) {
                            println("Invalid! Please choose between [Yes/No]")
                        }

                    }

                }else if(userChoose == "X"){                                                    //[X]Logout
                    println()
                    println("Logging out..." +
                            "\n------------------------------------------------------")
                    loopMainMenu = false
                }
            }


        }else if((usernameInput != cashierUsername1) || (passwordInput != cashierPassword1)){
            println("[LOGIN FAILED]: Incorrect username or password." +
                    "\n------------------------------------------------------")
        }
    }



}