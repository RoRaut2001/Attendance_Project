package eu.tutorials.attendance_project

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class homeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button = findViewById<Button>(R.id.button5)

        button.setOnClickListener {
            val intent = Intent(this, checkInActivity::class.java)
            startActivity(intent)
        }

        val button1 = findViewById<Button>(R.id.button6)

        button1.setOnClickListener {
            val intent = Intent(this, checkOutActivity::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.btnLogout)

        button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}