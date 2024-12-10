package com.example.zomggy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.btn1)
        val textView = findViewById<TextView>(R.id.textView)
        var ntext = intent.extras?.getString("name").toString()

        textView.text=ntext
        btn1.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            Toast.makeText(getApplicationContext(), "Order Placed" , Toast.LENGTH_SHORT).show();

        }

}
}