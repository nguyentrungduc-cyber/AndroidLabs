package vn.edu.uit.lab01_2.lab1b

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import vn.edu.uit.lab01_2.R

/**
 * Lab 1b – LinearLayout XML
 * Layout: res/layout/activity_lab1b.xml
 */
class Lab1bActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Lab 1b – LinearLayout XML"
        setContentView(R.layout.activity_lab1b)
    }
}
