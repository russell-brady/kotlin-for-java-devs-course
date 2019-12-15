package russellbrady.kotlin.declarations

fun main(args: Array<String>) {

    val employee = Employee("Mary", 1)
    val employee2 = Employee("John", 1)
    val employee3 = Employee("Mary", 1)

    println(employee == employee2)
    println(employee == employee3)
    println(employee === employee2)
    println(employee === employee3)

    val employee4 = employee3
    println(employee3 === employee4)
    println(employee2 !== employee4)

    val something : Any = employee2
    if (something is Employee) {
        println(something.name)
    }


    val employee1 = Employee("Russell", 1)
    employee1.name = "Cian"


    println(employee1)

    val change = 4.22
    println("To show the value of change, we use $$change")

    val filepath = """c:/hello/file/path"""

    val text = """Hello how are you
        |I am doing fine
        |How are you keeping?
    """.trimMargin()

    println(text)
}

class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            return name == other.name && id == other.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}