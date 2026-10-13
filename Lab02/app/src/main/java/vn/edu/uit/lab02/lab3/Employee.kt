package vn.edu.uit.lab02.lab3

abstract class Employee {
    var id: String   = ""
    var name: String = ""

    abstract fun tinhLuong(): Double

    override fun toString(): String = "$id - $name"
}
