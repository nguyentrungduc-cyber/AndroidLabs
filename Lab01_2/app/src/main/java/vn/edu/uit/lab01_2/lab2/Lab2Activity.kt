package vn.edu.uit.lab01_2.lab2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import vn.edu.uit.lab01_2.databinding.ActivityLab2Binding

/**
 * Lab 2 – RelativeLayout: màn hình Sign In
 * Layout: res/layout/activity_lab2.xml
 */
class Lab2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityLab2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Lab 2 – RelativeLayout"
        binding = ActivityLab2Binding.inflate(layoutInflater)
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
