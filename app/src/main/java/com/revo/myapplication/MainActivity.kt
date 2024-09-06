package com.revo.myapplication

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var etangka1 : EditText
    private lateinit var etangka2 : EditText
    private lateinit var btnkurang : Button
    private lateinit var btnkali: Button
    private lateinit var btntambah : Button
    private lateinit var txthasil : TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        etangka1 = findViewById(R.id.etangka1)
        etangka2 = findViewById(R.id.etangka2)
        btnkurang= findViewById(R.id.btnkurang)
        btnkali = findViewById(R.id.btnkali)
        btntambah = findViewById(R.id.btntambah)
        txthasil = findViewById(R.id.txthasil)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnkurang.setOnClickListener(){
            val hasil = etangka1.text.toString().toInt()- etangka2.text.toString().toInt()
            txthasil.setText("hasil pengurangan :"+hasil)
        }
        btnkali.setOnClickListener(){
            val hasil = etangka1.text.toString().toInt()* etangka2.text.toString().toInt()
            txthasil.setText("hasil pengkalian :"+hasil)
        }
        btntambah.setOnClickListener(){
            val hasil = etangka1.text.toString().toInt() + etangka2.text.toString().toInt()
            txthasil.setText("hasil penambahan :"+hasil)
        }



    }
}