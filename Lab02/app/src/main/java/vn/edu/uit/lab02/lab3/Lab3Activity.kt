package vn.edu.uit.lab02.lab3

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import vn.edu.uit.lab02.R

class Lab3Activity : AppCompatActivity() {

    private lateinit var employees: ArrayList<Employee>
    private lateinit var adapter: ArrayAdapter<Employee>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab3)

        val etId       = findViewById<EditText>(R.id.et_id)
        val etName     = findViewById<EditText>(R.id.et_name)
        val rgType     = findViewById<RadioGroup>(R.id.rg_type)
        val btnAdd     = findViewById<Button>(R.id.btn_add)
        val lvEmployee = findViewById<ListView>(R.id.lv_employee)

        employees = ArrayList()
        adapter   = ArrayAdapter(this, android.R.layout.simple_list_item_1, employees)
        lvEmployee.adapter = adapter

        btnAdd.setOnClickListener {
            addNewEmployee(etId, etName, rgType)
        }
    }

    private fun addNewEmployee(etId: EditText, etName: EditText, rgType: RadioGroup) {
        val id   = etId.text.toString().trim()
        val name = etName.text.toString().trim()
        if (id.isEmpty() || name.isEmpty()) return

        // Lấy ra đúng id của RadioButton được checked
        val employee: Employee = if (rgType.checkedRadioButtonId == R.id.rd_chinhthuc) {
            EmployeeFullTime()
        } else {
            EmployeePartTime()
        }

        // FullTime hay PartTime đều là Employee → có setId, setName
        employee.id   = id
        employee.name = name

        // Đưa employee vào ArrayList
        employees.add(employee)

        // Cập nhật giao diện
        adapter.notifyDataSetChanged()

        etId.setText("")
        etName.setText("")
    }
}
