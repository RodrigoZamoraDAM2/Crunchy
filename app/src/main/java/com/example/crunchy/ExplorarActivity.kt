package com.example.crunchy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crunchy.databinding.ExplorarBinding

class ExplorarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ExplorarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listas.setOnClickListener(){
            val intent = Intent(this@ExplorarActivity,ListasActivity::class.java)
            startActivity(intent)
        }
        binding.explorar.setOnClickListener(){
            val intent = Intent(this@ExplorarActivity,ExplorarActivity::class.java)
            startActivity(intent)
        }
        binding.multicast.setOnClickListener(){
            val intent = Intent(this@ExplorarActivity,ExplorarActivity::class.java)
            startActivity(intent)
        }
        binding.inicio.setOnClickListener(){
            val intent = Intent(this@ExplorarActivity,PrincipalActivity::class.java)
            startActivity(intent)
        }
        binding.preferencias.setOnClickListener(){
            val intent = Intent(this@ExplorarActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}