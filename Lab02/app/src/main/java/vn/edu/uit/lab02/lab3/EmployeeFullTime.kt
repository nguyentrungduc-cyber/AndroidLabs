package vn.edu.uit.lab02.lab3

class EmployeeFullTime : Employee() {

    override fun tinhLuong(): Double = 500.0

    override fun toString(): String = super.toString() + " -->FullTime=${tinhLuong()}"
}
