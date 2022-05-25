package dev.alinda.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class Page3Activity : AppCompatActivity() {
    lateinit var  btnPrevious2: Button
    lateinit var btnNext3: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        btnPrevious2 = findViewById(R.id.btnPrevious2)
        btnNext3 = findViewById(R.id.btnNext3)

        btnNext3.setOnClickListener{
            val intent = Intent(this,Page4Activity::class.java)
            startActivity(intent)
        }
        btnPrevious2.setOnClickListener{
            val intent=Intent(this,Page2Activity::class.java)
            startActivity(intent)
        }
    }
}