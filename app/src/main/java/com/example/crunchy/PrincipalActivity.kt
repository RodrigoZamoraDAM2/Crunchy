package com.example.crunchy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crunchy.databinding.PrincipalBinding

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = PrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listas.setOnClickListener(){
            val intent = Intent(this@PrincipalActivity,ListasActivity::class.java)
            startActivity(intent)
        }
        binding.explorar.setOnClickListener(){
            val intent = Intent(this@PrincipalActivity,ExplorarActivity::class.java)
            startActivity(intent)
        }
        binding.multicast.setOnClickListener(){
            val intent = Intent(this@PrincipalActivity,ExplorarActivity::class.java)
            startActivity(intent)
        }
        binding.inicio.setOnClickListener(){
            val intent = Intent(this@PrincipalActivity,PrincipalActivity::class.java)
            startActivity(intent)
        }
        binding.preferencias.setOnClickListener(){
            val intent = Intent(this@PrincipalActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}