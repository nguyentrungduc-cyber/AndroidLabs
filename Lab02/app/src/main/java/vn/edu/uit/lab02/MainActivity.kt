package vn.edu.uit.lab02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import vn.edu.uit.lab02.lab1.Lab1Activity
import vn.edu.uit.lab02.lab2.Lab2Activity
import vn.edu.uit.lab02.lab3.Lab3Activity
import vn.edu.uit.lab02.lab4.Lab4Activity
import vn.edu.uit.lab02.lab7.Lab7Activity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 80, 48, 48)
        }

        val title = TextView(this).apply {
            text = "Lab 02 – ListView & RecyclerView"
            textSize = 18f
            setPadding(0, 0, 0, 40)
        }
        root.addView(title)

        data class Item(val label: String, val cls: Class<*>)
        val items = listOf(
            Item("Lab 1: ListView mảng định sẵn",         Lab1Activity::class.java),
            Item("Lab 2: ArrayList + ListView (thêm/xóa)", Lab2Activity::class.java),
            Item("Lab 3: ListView + Object (Employee)",     Lab3Activity::class.java),
            Item("Lab 4: CustomAdapter cho ListView",       Lab4Activity::class.java),
            Item("Lab 7: RecyclerView (làm lại Lab 4)",    Lab7Activity::class.java),
        )

        items.forEach { item ->
            val btn = Button(this).apply {
                text = item.label
                setOnClickListener { startActivity(Intent(this@MainActivity, item.cls)) }
            }
            root.addView(btn)
        }

        setContentView(root)
    }
}
