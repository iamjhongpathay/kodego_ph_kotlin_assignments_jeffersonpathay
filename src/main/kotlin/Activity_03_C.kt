import java.lang.Exception

/*
Covered Topic(s) : Functions

Instructions :

1. Create an ArrayList of grocery products with 20 entries.
2. Create a HashMap called Cart.
Hint:  Hashmap<String, Int>
2. Create a function "addToCart" that will accept a String and an Int, then it will add the input in the Hashmap. If the Entry already exists, create a new entry in the HashMap.
Hint : you may add a "_01", "_02"
Example Coke_01, Coke_02

3. Create a function "checkOut". This will compute how many items have been checked out.
4. Create a function "removefromCart"  that will accept a String and remove the input from the Hashmap. If there are multiple entries, remove all from the HashMap.
 */


fun main(){

    var productsObject = Products()
    var cartObject = Cart()

    //User Interface/Interaction
    println("[      Welcome to KodeGo       ]" +
            "\n[Mobile Application Development]" +
            "\n[        Grocery Cart          ]")

    println()
    println("[------AVAILABLE PRODUCTS------]")
    productsObject.showProducts(productsObject.addProducts().toString())

    var loopGroceryCart: Boolean = true
    while (loopGroceryCart){
        try {
            println()
            print("[1] Add to Cart" +
                    "\n[2] Remove Product from Cart" +
                    "\n[3] Checkout" +
                    "\nEnter here: ")
            var userChoose: Int = readln().toInt()
            println()


            if(userChoose == 1){
                println("[------ADD TO CART------]")
                print("Enter the name of the product and quantity to add in the cart." +
                        "\nEnter name: ")
                var productNameInput: String = readln()
                print("Enter quantity: ")
                var productQuantity: Int = readln().toInt()
                cartObject.addToCart(productNameInput, productQuantity)

                println("-----------------")
                println("Your Cart:")
                cartObject.showCart()

            }else if(userChoose == 2){
                println("[------REMOVE FROM CART------]")
                print("Enter the name of the product from your cart to remove." +
                        "\nEnter name: ")
                var productNameInput: String = readln()
                cartObject.removeFromCart(productNameInput)

                print("-----------------")
                println("Your Cart:")
                cartObject.showCart()

            }else if(userChoose == 3){
                println("[------CHECKOUT------]")
                cartObject.showCart()
                println("----------------------")
                cartObject.checkOut()
                println("[--------------------]")
            }else{
                println()
                println("[REMINDER]: You enter a number that not on the list of choices.")
            }
        }catch (e: Exception){
            println("[REMINDER]: Please Enter Digits Only")
        }
    }

}

class Products(){
    var products = ArrayList<String>(20)

    fun addProducts(){
        products.add("Safeguard")
        products.add("Ballpen")
        products.add("Alcohol")
        products.add("Pen")
        products.add("Tamarind")
        products.add("Gatorade")
        products.add("Coca-cola")
        products.add("Ariel")
        products.add("Packaging Tape")
        products.add("Shampoo")
        products.add("Slippers")
        products.add("Hot dog")
        products.add("Pen")
        products.add("Face-mask")
        products.add("Socks")
        products.add("Manila Paper")
        products.add("Bond Paper")
        products.add("Hair Spray")
        products.add("Banana")
        products.add("Apple")

    }

    fun showProducts(name: String){
        for(productList in products.indices){
            println("${productList+1}. ${products[productList]} ")
        }
    }
}

class Cart(){
    var cart = HashMap<String, Int>()

    fun addToCart(name: String, quantity: Int){
        if(cart.contains(name)){
            println("-----------------------------------------------------------------------------------------------------------------")
            println("[The product is already exist in you cart] Please add _02, _03 etc. after the name of product. Ex. ProductName_02")
            println("-----------------------------------------------------------------------------------------------------------------")
        }else{
            cart[name] = quantity
        }

    }

    fun removeFromCart(name: String){

        cart.remove(name)

    }

    fun showCart(){
        if(cart.isEmpty()){
            println("[YOUR CART IS EMPTY]")
        }else{
            for(key in cart.keys){
                println("$key = ${cart[key]}x")
            }
        }

    }

    fun checkOut(){
        var totalQuantities: Int = cart.values.sum()
        println("Total Items: ${cart.count()} ")
        println("Total Quantities: $totalQuantities")
    }
}