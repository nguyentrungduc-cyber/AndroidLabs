package vn.edu.uit.lab01_2.lab1a

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Lab 1a – Khởi tạo LinearLayout bằng code (Kotlin)
 *
 * Tương đương bài thực hành 1a trong tài liệu (Java → Kotlin).
 * Giao diện gồm:
 *   [Name: ] [John Doe]
 *   [Address:] [911 Hollywood Blvd]
 */
class Lab1aActivity : AppCompatActivity() {

    private lateinit var llNameContainer: LinearLayout
    private lateinit var llAddressContainer: LinearLayout
    private lateinit var llParentContainer: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Lab 1a – LinearLayout Code"

        createNameContainer()
        createAddressContainer()
        createParentContainer()
        setContentView(llParentContainer)
    }

    private fun createNameContainer() {
        llNameContainer = LinearLayout(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            orientation = LinearLayout.HORIZONTAL
            setPadding(16, 16, 16, 8)
        }

        val tvLabel = TextView(this).apply { text = "Name: "; textSize = 16f }
        val tvValue = TextView(this).apply { text = "John Doe"; textSize = 16f }

        llNameContainer.addView(tvLabel)
        llNameContainer.addView(tvValue)
    }

    private fun createAddressContainer() {
        llAddressContainer = LinearLayout(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            orientation = LinearLayout.HORIZONTAL
            setPadding(16, 8, 16, 16)
        }

        val tvLabel = TextView(this).apply { text = "Address: "; textSize = 16f }
        val tvValue = TextView(this).apply { text = "911 Hollywood Blvd"; textSize = 16f }

        llAddressContainer.addView(tvLabel)
        llAddressContainer.addView(tvValue)
    }

    private fun createParentContainer() {
        llParentContainer = LinearLayout(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
            orientation = LinearLayout.VERTICAL
        }

        llParentContainer.addView(llNameContainer)
        llParentContainer.addView(llAddressContainer)
    }
}
