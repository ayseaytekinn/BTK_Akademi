package com.ayseaytekin.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ayseaytekin.siniflarvefonksiyonlar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var j = 2

        if (j == 0){
            ilkFonksiyon()
        }else{
            ikinciFonksiyon()
        }

        cikarma(500 , 20)
        var x = toplama(10,20)
        binding.textView.text = "Sonuç : ${x}"

        binding.button.setOnClickListener{
            val toplamaSonucu = toplama(10,50)
            binding.textView.text="Sonuç : " + toplamaSonucu
        }

        sinifCalismasi()
        nullGuvenligi()
    }

    fun ilkFonksiyon(){
        println("İlk fonksiyon çalıştı .")
    }

    fun ikinciFonksiyon(){
        println("İkinci fonksiyon çalıştı .")
    }

    // Girdi almak

    fun cikarma(x: Int , y: Int){
      binding.textView.text = "Sonuç : ${x+y}"

    }

    // Çıktı Vermek --> döndürmek ( return )

    fun toplama (a: Int, b: Int) : Int {
        return a + b
    }

   //Görünümler ve Fonksiyonlar


   /* fun degistir(view: View){
        val toplamaSonucu= toplama(10,50)
        binding.textView.text="Sonuç : " + toplamaSonucu
    }
    */

    fun sinifCalismasi(){
        var superman = Superkahraman ("Superman", 50,  "Gazeteci")
        binding.textView.text= "Yaş : " + superman.yas
        superman.testFonksiyonu()
        println(superman.sacRenginiAl())

    }

    fun nullGuvenligi(){
        // Null , Nullability (boş olabilmek ), Null Safety

        //Tanımlama , Definening
        var benimString :String? //Null olmuş oldu ? ile .

        //Initialization
        benimString="Ayse"

        var benimYasim : Int? = null
        println(benimYasim)

        // benimYasim =2

        //1
        if (benimYasim != null){
            println(benimYasim * 2 )

        }else {
            println("Null geldi")
        }

        //2
        // !! -> Null olmayacak , ? -> Null olabilir
        println(benimYasim?.minus(2))

        //3
        //Elvis operatörü
        //benimYasim = 10
        val sonuc=benimYasim?.minus(2) ?:10
        println(sonuc)

        //4
        //let
        benimYasim = 5
        benimYasim?.let {
            println(it * 5)
        }
    }

























}