package russellbrady.kotlin.typeAliases

import russellbrady.kotlin.declarations.Employee

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {

    val employees : EmployeeSet

    val names = arrayListOf("John", "Jane")

    println(names[1])


}