package com.ayseaytekin.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ayseaytekin.superkahramanprojesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        //val view = binding.root
        setContentView(binding.root)


    }
    fun superKahramanYap(view : View){
        val isim = binding.isimText.text.toString()
        val yas = binding.yasText.text.toString().toIntOrNull()
        val meslek = binding.meslekText.text.toString()

        if (yas == null ){
            binding.sonucText.text="Doğru yaşı giriniz !"
        }else{
            val superKahraman = SuperKahraman(isim,yas,meslek)
            binding.sonucText.text="İsim :${superKahraman.isim} Yaş : ${superKahraman.yas} Meslek : ${superKahraman.meslek}"
        }

        // Kapsam : Yapılan değer atamasına yalnızca bulunduğu  fonksiyondan erişebiliriz . Dışarıdan erişemeyiz.



    }
}