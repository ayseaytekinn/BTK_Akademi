package com.ayseaytekin.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ayseaytekin.dortislemkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var sayi1 : Int? = null
    var sayi2 : Int? = null
    var sonuc : Int? = null

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        //val view = binding.root
        setContentView(binding.root)
    }
    fun topla(view: View){

        sayi1 = binding.editTextText.text.toString().toIntOrNull()
        sayi2 = binding.editTextText2.text.toString().toIntOrNull()

        if ( sayi1==null || sayi2==null){
            binding.textView.text="Sayı giriniz."
        }else{
            sonuc = sayi1!! + sayi2!!
            binding.textView.text="Sonuç:" + sonuc
        }


    }

    fun cikar(view: View){
        sayi1 = binding.editTextText.text.toString().toIntOrNull()
        sayi2 = binding.editTextText2.text.toString().toIntOrNull()

        if ( sayi1==null || sayi2==null){
            binding.textView.text="Sayı giriniz."
        }else{
            sonuc = sayi1!! - sayi2!!
            binding.textView.text="Sonuç:" + sonuc
        }
    }

    fun carp(view: View){
        sayi1 = binding.editTextText.text.toString().toIntOrNull()
        sayi2 = binding.editTextText2.text.toString().toIntOrNull()

        if ( sayi1==null || sayi2==null){
            binding.textView.text="Sayı giriniz."
        }else{
            sonuc = sayi1!! * sayi2!!
            binding.textView.text="Sonuç:" + sonuc
        }
    }

    fun bol (view: View){
        sayi1 = binding.editTextText.text.toString().toIntOrNull()
        sayi2 = binding.editTextText2.text.toString().toIntOrNull()

        if ( sayi1==null || sayi2==null){
            binding.textView.text="Sayı giriniz."
        }else{
            sonuc = sayi1!! / sayi2!!
            binding.textView.text="Sonuç:" + sonuc
        }
    }
}