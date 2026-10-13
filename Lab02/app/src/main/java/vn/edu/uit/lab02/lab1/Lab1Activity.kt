package vn.edu.uit.lab02.lab1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import vn.edu.uit.lab02.R

class Lab1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab1)

        val tvSelection = findViewById<TextView>(R.id.tv_selection)
        val lvPerson    = findViewById<ListView>(R.id.lv_person)

        // Bước 2: Mảng dữ liệu định sẵn
        val arr = arrayOf("Tèo", "Tý", "Bin", "Bo")

        // Bước 3: Xây dựng adapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arr)

        // Bước 4: SetAdapter
        lvPerson.adapter = adapter

        // Bước 5: Xử lý click
        lvPerson.setOnItemClickListener { _, _, position, _ ->
            tvSelection.text = "position: $position ; value = ${arr[position]}"
        }
    }
}
