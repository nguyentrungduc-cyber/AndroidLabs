package vn.edu.uit.lab01_2.lab3

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import vn.edu.uit.lab01_2.databinding.ActivityLab3Binding

/**
 * Lab 3 – ConstraintLayout: làm lại bài Sign In của Lab 2
 * Layout: res/layout/activity_lab3.xml
 */
class Lab3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityLab3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Lab 3 – ConstraintLayout"
        binding = ActivityLab3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignIn.setOnClickListener {
            val user = binding.etUsername.text.toString()
            val pass = binding.etPassword.text.toString()
            if (user.isBlank() || pass.isBlank()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Đăng nhập: $user", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnSignUp.setOnClickListener {
            Toast.makeText(this, "Chuyển sang màn hình Sign Up", Toast.LENGTH_SHORT).show()
        }

        binding.btnSignInFacebook.setOnClickListener {
            Toast.makeText(this, "Sign In via Facebook", Toast.LENGTH_SHORT).show()
        }
    }
}
