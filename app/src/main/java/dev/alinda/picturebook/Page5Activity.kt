package dev.alinda.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page5Activity : AppCompatActivity() {
    lateinit var btnNext5: Button
    lateinit var btnPrevious5: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)

        btnNext5 = findViewById(R.id.btnNext5)
        btnPrevious5 = findViewById(R.id.btnPrevious5)

        btnNext5.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnPrevious5.setOnClickListener{
            val intent = Intent(this,Page4Activity::class.java)
            startActivity(intent)
        }
    }
}