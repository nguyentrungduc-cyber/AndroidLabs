package vn.edu.uit.lab02.lab2

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import vn.edu.uit.lab02.R

class Lab2Activity : AppCompatActivity() {

    private lateinit var names: ArrayList<String>
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab2)

        val etName      = findViewById<EditText>(R.id.et_name)
        val btnSubmit   = findViewById<Button>(R.id.btn_submit)
        val tvSelection = findViewById<TextView>(R.id.tv_selection)
        val lvPerson    = findViewById<ListView>(R.id.lv_person)

        // 1. Tạo ArrayList
        names = ArrayList()

        // 3. Xây dựng adapter
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)

        // 4. SetAdapter
        lvPerson.adapter = adapter

        // 4. Xử lý sự kiện nhấn nút Nhập
        btnSubmit.setOnClickListener {
            val name = etName.text.toString().trim()
            if (name.isNotEmpty()) {
                names.add(name)
                // Cập nhật dữ liệu mới lên giao diện
                adapter.notifyDataSetChanged()
                etName.setText("")
            }
        }

        // 5. Xử lý click → hiện vị trí + giá trị
        lvPerson.setOnItemClickListener { _, _, position, _ ->
            tvSelection.text = "position: $position ; value = ${names[position]}"
        }

        // 6. Xử lý long click → xóa phần tử
        lvPerson.setOnItemLongClickListener { _, _, position, _ ->
            names.removeAt(position)
            adapter.notifyDataSetChanged()
            true
        }
    }
}
