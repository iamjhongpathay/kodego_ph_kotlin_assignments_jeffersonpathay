package Activity_04_A


open class Student(var firstName: MutableMap<Long, String> = mutableMapOf<Long, String>(),
                   var middleName: MutableMap<Long, String> = mutableMapOf<Long, String>(),
                   var lastName: MutableMap<Long, String> = mutableMapOf<Long, String>(),
                   var studentID: MutableMap<Long, Long> = mutableMapOf<Long, Long>(),
                   var yearEnrolled: MutableMap<Long, Int> = mutableMapOf<Long, Int>()) {

    fun displayAllStudent(){
        if(studentID.isEmpty()){
            println("--------------No Students-------------")
        }else{
            for(key in studentID.keys){
                println("ID: $key - ${firstName[key]} ${middleName[key]} ${lastName[key]} - ${yearEnrolled[key]}")
            }
        }
    }

    fun addStudent(firstName: String, middleName: String, lastName: String, studentID: Long, yearEnrolled: Int){

        if(this.studentID.containsKey(studentID)){
            println()
            print("[[!]The Student ID is already exist!]")

        }else{
                this.firstName[studentID] = firstName
                this.middleName[studentID] = middleName
                this.lastName[studentID] = lastName
                this.studentID[studentID] = studentID
                this.yearEnrolled[studentID] = yearEnrolled

                println()
                println("Successfully Saved!")
                println()

        }

    }

    fun searchFirstName(firstName: String){
        var filterName: Map<Long, String> = this.firstName.filterValues { it.startsWith(firstName) }

        if(filterName.isEmpty()){
            println("[NO STUDENTS AVAILABLE]")
        }else{
            println("All of students searched by their first name:")
            for (list in filterName.keys){
                println("ID: $list - [${filterName[list]}] ${this.middleName[list]} ${this.lastName[list]} - ${this.yearEnrolled[list]}")
            }
        }
    }

    fun searchMiddleName(middleName: String){
        var filterName: Map<Long, String> = this.middleName.filterValues { it.startsWith(middleName) }

        if(filterName.isEmpty()){
            println("[NO STUDENTS AVAILABLE]")
        }else{
            println("All of students searched by their middle name:")
            for (list in filterName.keys){
                println("ID: $list - ${filterName[list]} [${this.middleName[list]}] ${this.lastName[list]} - ${this.yearEnrolled[list]}")
            }
        }
    }

    fun searchLastName(lastName: String){
        var filterName: Map<Long, String> = this.lastName.filterValues { it.startsWith(lastName) }

        if(filterName.isEmpty()){
            println("[NO STUDENTS AVAILABLE]")
        }else{
            println("All of students searched by their last name:")
            for (list in filterName.keys){
                println("ID: $list - ${filterName[list]} ${this.middleName[list]} [${this.lastName[list]}] - ${this.yearEnrolled[list]}")
            }
        }
    }

}