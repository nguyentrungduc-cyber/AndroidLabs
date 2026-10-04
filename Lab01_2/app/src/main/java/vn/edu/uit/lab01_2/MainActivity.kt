package vn.edu.uit.lab01_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import vn.edu.uit.lab01_2.lab1a.Lab1aActivity
import vn.edu.uit.lab01_2.lab1b.Lab1bActivity
import vn.edu.uit.lab01_2.lab2.Lab2Activity
import vn.edu.uit.lab01_2.lab3.Lab3Activity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Build menu bằng code (không dùng XML để demo luôn)
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(48, 80, 48, 48)
        }

        val title = TextView(this).apply {
            text = "Lab 01.2 – Các Layout Cơ Bản"
            textSize = 18f
            setPadding(0, 0, 0, 40)
        }
        root.addView(title)

        data class Item(val label: String, val cls: Class<*>)
        val items = listOf(
            Item("Lab 1a: LinearLayout (Code)", Lab1aActivity::class.java),
            Item("Lab 1b: LinearLayout (XML)", Lab1bActivity::class.java),
            Item("Lab 2 : RelativeLayout – Sign In", Lab2Activity::class.java),
            Item("Lab 3 : ConstraintLayout – Sign In", Lab3Activity::class.java),
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
