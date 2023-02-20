package com.example.crunchy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crunchy.databinding.ListasBinding

class ListasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ListasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listas.setOnClickListener(){
            val intent = Intent(this@ListasActivity,ListasActivity::class.java)
            startActivity(intent)
        }
        binding.explorar.setOnClickListener(){
            val intent = Intent(this@ListasActivity,ExplorarActivity::class.java)
            startActivity(intent)
        }
        binding.multicast.setOnClickListener(){
            val intent = Intent(this@ListasActivity,ExplorarActivity::class.java)
            startActivity(intent)
        }
        binding.inicio.setOnClickListener(){
            val intent = Intent(this@ListasActivity,PrincipalActivity::class.java)
            startActivity(intent)
        }
        binding.preferencias.setOnClickListener(){
            val intent = Intent(this@ListasActivity,MainActivity::class.java)
            startActivity(intent)
        }

    }
}