package com.example.crunchy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.core.widget.addTextChangedListener
import com.example.crunchy.databinding.LoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var user = ""
        var pass = ""

        binding.user.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                user = binding.user.text.toString()
            }
        })
        binding.pass.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                pass = binding.pass.text.toString()
            }
        })
        binding.button.setOnClickListener(){
            val intent = Intent(this@LoginActivity,PrincipalActivity::class.java)
            if(user != "" && pass != ""){
                startActivity(intent)
            }
        }
    }
}