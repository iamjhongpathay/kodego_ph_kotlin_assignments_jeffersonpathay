/*
Identify 3 uses cases that will efficiently use an Array, ArrayList, Set, Map.
 */
fun main(){
    println("[      Welcome to KodeGo       ]" +
            "\n[Mobile Application Development]")

    var loopMainMenu: Boolean = true

    println()
    print("[1]Array" +
            "\n[2]ArrayList" +
            "\n[3]Set" +
            "\n[4]Map" +
            "\nEnter here: ")
    var userChoose: Int = readln().toInt()
    if (userChoose == 1){
        println()
        println("> Array <" +
                "\n1. It can be used when the values doesn't need many variable declaration if they are same data type.")
        val countries = arrayOf("Philippines", "Japan", "America", "Taiwan", "S. Korea", "N. Korea")
        println("Countries: ${countries.contentToString()}")
        println()
        println("2. The size or index can't be modify or it should be fixed")
        val numbers = Array<Int>(5) { 10 * (it + 1) }
        println(numbers.contentToString())
        println()
        println("3. Using the index of array it can be used to traverse the index range like (minValue..maxValue).")
        val number = intArrayOf(5, 10, 15, 20, 25, 30)
        for (index in 0..4){
            println(number[index])
        }
    }else if(userChoose == 2){
        println()
        println("> ArrayList <" +
                "\n1. It allows duplicate, it means it can add the data multiple times.")
        var names = ArrayList<String>()
        names.add("John")
        names.add("Ara")
        names.add("Michelle")
        names.add("Jay")
        names.add("John")
        names.add("Michelle")
        names.add("John")
        println("name = $names")
        println()
        println("2. Can access the elements using index in a fastest way.")
        println("Index 1: ${names[1]}")
        println("Index 5: ${names[5]}")
        println()
        println("3. As the no.2, ArrayList provides constant time for search operation.")
        println("Search Name: ")
        var searchNameInput = readln()
        var filter: List<String> = names.filter { it == searchNameInput }
        if(filter.isEmpty()){
            println("[NO NAME FOUND!]")
        }else{
            println("All Name searched:")
            for (list in filter.indices){
                println("${list+1}. ${filter[list]}")
            }
        }
    }else if(userChoose == 3){
        println()
        println("> Set <" +
                "\n1. Unlike the ArrayList, the Set doesn't allow duplicate data. It can be use for a unique id.")
        var uniqueID = setOf(1, 2, 3, 1, 4, 5, 6, 4, 2, 8, 9)
        for(data in uniqueID){
        print(data )
        }
        println()
        println()
        println("2. It can be use to combine all the elements data from 2 different set of collections using union function.")
        var luzon = mutableSetOf<String>("Las Pinas", "Muntinlupa", "Pasay", "Manila")
        var mindanao = mutableSetOf<String>("Davao", "Iligan", "Butuan", "Cotobato")
        println("Cities: ${luzon.union(mindanao)}")
        println()
        println("3. By using mutableSetOf(), the clear function can be use to remove all the set elements.")
        println("Luzon: $luzon")
        println("Mindanao: ${mindanao.clear()}")
    }else if(userChoose == 4){
        println()
        println("> Map <" +
                "\n1. Map can use to store a data of a student with their student ID as the key and the name or personal details are the value of the map.")
        var studentName = mutableMapOf<Int, String>(101 to "James", 102 to "Claire", 103 to "Ivy")
        for((key, value) in studentName){
            println("studentID = $key, Name = $value")
        }
        println()
        println("2. It can be change the value of the element using the key with replace function")
        print("Student ID 102, Enter new name:  ")
        var input: String = readln()
        studentName.replace(102, input)
        for((key, value) in studentName){
            println("studentID = $key, Name = $value")
        }
        println()
        println("3. To delete the key and its value of the element using the remove function.")
        print("Enter Student ID to remove: ")
        var removeID: Int = readln().toInt()
        studentName.remove(removeID)
        for((key, value) in studentName){
            println("studentID = $key, Name = $value")
        }
    }
}