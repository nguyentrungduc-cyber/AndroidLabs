package vn.edu.uit.lab02.lab3

class EmployeePartTime : Employee() {

    override fun tinhLuong(): Double = 150.0

    override fun toString(): String = super.toString() + " -->PartTime=${tinhLuong()}"
}
