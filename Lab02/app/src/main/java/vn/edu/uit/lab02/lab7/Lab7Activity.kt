package vn.edu.uit.lab02.lab7

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import vn.edu.uit.lab02.R
import vn.edu.uit.lab02.lab4.Employee

class Lab7Activity : AppCompatActivity() {

    private val employees = mutableListOf<Employee>()
    private lateinit var adapter: EmployeeRvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab7)

        val etId        = findViewById<EditText>(R.id.et_id)
        val etFullName  = findViewById<EditText>(R.id.et_full_name)
        val cbIsManager = findViewById<CheckBox>(R.id.cb_is_manager)
        val btnAdd      = findViewById<Button>(R.id.btn_add)
        val rvEmployee  = findViewById<RecyclerView>(R.id.rv_employee)

        adapter = EmployeeRvAdapter(employees)
        rvEmployee.adapter      = adapter
        rvEmployee.layoutManager = LinearLayoutManager(this)

        btnAdd.setOnClickListener {
            val id       = etId.text.toString().trim()
            val fullName = etFullName.text.toString().trim()
            if (id.isEmpty() || fullName.isEmpty()) return@setOnClickListener

            employees.add(Employee(id, fullName, cbIsManager.isChecked))
            // notifyItemInserted hiệu quả hơn notifyDataSetChanged
            adapter.notifyItemInserted(employees.size - 1)
            rvEmployee.scrollToPosition(employees.size - 1)

            // Reset form
            etId.setText("")
            etFullName.setText("")
            cbIsManager.isChecked = false
        }
    }
}
