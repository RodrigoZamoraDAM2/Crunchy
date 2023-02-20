package com.example.crunchy

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crunchy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.prueba.setOnClickListener(){
            val intent: Intent = Uri.parse("https://www.crunchyroll.com/es-es/offer-premium?utm_source=google&utm_medium=paid_cr&utm_campaign=CR-Paid_Google_Web_Conversion_Europe_(non-UK-IE)_ES_ALL_Trademark_SVOD&utm_term=crunchyroll&referrer=google_paid_cr_CR-Paid_Google_Web_Conversion_Europe_(non-UK-IE)_ES_ALL_Trademark_SVOD&gclid=EAIaIQobChMInL7hy7Cc_QIVSI9oCR3sXAoYEAAYASAAEgKru_D_BwE").let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }
            startActivity(intent)
        }

        binding.acceder.setOnClickListener(){
            val intent = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}