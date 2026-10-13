package vn.edu.uit.lab02.lab4

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import vn.edu.uit.lab02.R

class Lab4Activity : AppCompatActivity() {

    private val employees = mutableListOf<Employee>()
    private lateinit var adapter: EmployeeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab4)

        val etId        = findViewById<EditText>(R.id.et_id)
        val etFullName  = findViewById<EditText>(R.id.et_full_name)
        val cbIsManager = findViewById<CheckBox>(R.id.cb_is_manager)
        val btnAdd      = findViewById<Button>(R.id.btn_add)
        val lvEmployee  = findViewById<ListView>(R.id.lv_employee)

        adapter = EmployeeAdapter(this, R.layout.item_employee, employees)
        lvEmployee.adapter = adapter

        btnAdd.setOnClickListener {
            val id       = etId.text.toString().trim()
            val fullName = etFullName.text.toString().trim()
            if (id.isEmpty() || fullName.isEmpty()) return@setOnClickListener

            employees.add(Employee(id, fullName, cbIsManager.isChecked))
            adapter.notifyDataSetChanged()

            // Reset form
            etId.setText("")
            etFullName.setText("")
            cbIsManager.isChecked = false
        }
    }
}
