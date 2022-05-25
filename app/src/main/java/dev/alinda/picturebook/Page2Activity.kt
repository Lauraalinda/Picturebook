package dev.alinda.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page2Activity : AppCompatActivity() {
    lateinit var btnPrevious: Button
    lateinit var btnNext2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        btnPrevious = findViewById(R.id.btnPrevious)
        btnNext2=findViewById(R.id.btnNext2)


        btnPrevious.setOnClickListener{
           val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        btnNext2.setOnClickListener{
            val intent = Intent(this,Page3Activity::class.java)
            startActivity(intent)
        }
    }
}