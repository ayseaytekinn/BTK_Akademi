package com.ayseaytekin.kotlinogreniyorum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ayseaytekin.kotlinogreniyorum.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_main)


        println("Hello World")
        println(10*5)

        // -------------------------DEĞİŞKENLER-------------------
        var a = 5
        var b = 10
        println(a* b )

        var yas = 50
        println(yas / 5 * 8)

        yas = 60

        println(yas / 5*8 )


        // -------------------------SABİTLER-------------------

        // val x = 10
        // x = 15 yapamam . çünkü val ile tanımladım . val ile tanımlamarsak sabitlemiş oluruz .

        val x = 5
        val y = 20

        println(x+y)

        // camelCase (yasSonucu) ve snake_case(yas_sonucu)

        val yasSonucu = yas * x
        println(yasSonucu)

        println("-----Int--------")
        // -------------------------INT-------------------

        //Tanımlama (Defining)
        val benimIntegerim : Int

        // Başlatma , değerini atama  (Initializing , Initialization)
        benimIntegerim = 5

        var yeniInteger : Int = 20

        println(benimIntegerim)

        println("-----Long--------")
        // -------------------------LONG-------------------
        var benimLong : Long = 100
        benimLong = 300000000000000
        println(benimLong)



        println("-----Double%Float--------")
        // -------------------------Double%Float-------------------
        val pi = 3.14
        println(pi * 2)

        val floatPi : Float = 3.14f // Daha az yer kaplaması için fazladan "f" yazma fedakarlığı olarak akılda kalabilir.

        val yeniDouble = 5.0
        println(yeniDouble / 2)

        println("-----String--------")
        // -------------------------String-------------------

        val benimString = "Benim Yeni Metnim"
        println(benimString.length)  // length : uzunluk

        val isim = "Ayse"
        val soyisim = " Aytekin"

        val tamIsim = isim + " " + soyisim
        println(tamIsim)

        val yeniBirString : String
        yeniBirString = "10"

        val baskaBirString = "20"
        println(yeniBirString+ baskaBirString)

        println("-----Boolean--------")
        // -------------------------Boolean-------------------

        var benimBoolean = true
        benimBoolean = false

        // < : küçüktür
        // > : büyüktür
        // == : eşittir
        // != : eşit değildir
        // <= : küçük eşittir
        // >= : büyük eşittir
        // && : ve
        // || : veya

        println(3<5)
        println(4!=4)

        println("-----Veri Dönüştürme--------")
        // -------------------------Dönüştürme-------------------

        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)

        val kullaniciGirdisi = "50"
        val benimInteCevrilenString = kullaniciGirdisi.toInt()
        println(benimInteCevrilenString / 2)


        println("-----Array - Dizi--------")
        // -------------------------Koleksiyonlar-------------------

        val stringOrnegi = "Ayse"

        val benimDizim = arrayOf(stringOrnegi , "Ayse" , "Ahmet", "Fatma" , "Mehmet")

        //index
        println(benimDizim[0])
        println(benimDizim[1])
        println(benimDizim[2])
        benimDizim[2] = "Sila"
        println(benimDizim.get(2))
       // ------------Dizilerde Farklı Veriler----------------
        benimDizim.set(2,"Kerem")
        println(benimDizim[2])


        val numaraDizisi = arrayOf(1.0,2.0,3.5)
        println(numaraDizisi[2])

        val karisikDizi = arrayOf("Ayse", 24 , 16.5 , true , false )
        println(karisikDizi.get(3))

        // ArrayList - Listeler
        println("------ArrayList------")

        val isimListesi = arrayListOf<String>("Atıl " , "Ayse", "Zeynep" , "Osman")
        println(isimListesi[2])
        println(isimListesi[3])

        isimListesi.add("Mehmet")
        isimListesi.add("Atlas")
        println(isimListesi.get(4))

        val karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add("Atıl")
        karisikArrayList.add(5)
        karisikArrayList.add(true)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))



        // Set
        println("------Set------")

        val ornekDizi = arrayOf(7,8,9,9,9,8,10)
        println("index 2 : ${ornekDizi[2]}")
        println("index 2 : " + ornekDizi[2])

        println(ornekDizi.size)

        val benimSet = setOf<Int>(7,8,9,9,8,10)
        println(benimSet.size)

        //For Each  ( Her sayıyı bir kez yazar . Örneğimizde 2 adet 8 ve 3 adet 9 olmasına rağmen bunları birer kez bastırır.)
        benimSet.forEach(){
            println(it)
        }

        val digerSet = HashSet<String>()
        digerSet.add("Ayse")
        digerSet.add("Ayse")
        digerSet.add("Ayse")
        digerSet.add("Aytekin")

        digerSet.forEach(){
            println(it)
        }

        //Map
        println("------MAP-------")

        //Anahtar Kelime - Değer ( Key - Value pairing)

        val yemekDizisi = arrayOf("Elma" , "Et", "Tavuk")
        val kaloriDizisi = arrayOf(100 , 300 , 200)

        println(yemekDizisi[0] + "'nın kalorisi : " + kaloriDizisi[0])

        val yemekKaloriMap = hashMapOf<String, Int>()
        yemekKaloriMap.put("Elma",100)
        yemekKaloriMap.put("Et", 300)
        yemekKaloriMap.put("Tavuk", 200)
        println(yemekKaloriMap.get("Et"))

        val benimMapim = HashMap<String , String>()
        benimMapim.put("Örnek ", "Değer")

        val yeniMap = hashMapOf<String, Int>("Ayse" to 10, "Ahmet" to 20)
        println(yeniMap.get("Örnek"))


        //Matematiksel İşlemler
        println("---------Matematiksel İşlemler-------")

        var sayi = 8
        println(sayi)
        sayi = sayi +1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        var digerSayi = 10

        println(digerSayi > sayi )

        // %% --> Ve
        // || --> Ve ya

        println(digerSayi > sayi && 2 > 3 )
        println(digerSayi > sayi || 2 > 3 )

        println(8+7)
        println(10-4)
        println(20*5)
        println(10/2)

        //Remainder - Kalanı Bulmak

        println(10%3)
        println(10%2)
        println(11%3)

        //If Kontrolleri
        println("---------If Statements(Eğer Kontrolleri)-------")

        val skor = 99
        if (skor <10){
            println("Oyunu kaybettin !")
        }else if(skor >= 10 && skor < 20){
            println("Skorun 10 ile 20 arasında , çok iyi skor aldın !")
        }else if ( skor >= 20 && skor < 30 ){
            println("Skorun 20 ile 30 arasında , rekorlar kırıyorsun !")
        }else{
            println("Skorun 30'un üstünde ,efsane oynadın !")
        }


        //When - Switch ( Şu koşul sağlanırsa, bunu yap . )
        println("---------When-------")



        /*

        if(notRakami==0){
            notStringi = "Geçersiz Not"
        }else if (notRakami==1){
            notStringi = "Zayıf"
        }else if (notRakami==2){
            notStringi= "Kötü"
        }else if(notRakami==3){
            notStringi="Orta"
        } else if (notRakami==4){
            notStringi= "İyi"
        }else if (notRakami==5){
            notStringi ="Pek iyi"
        }

        println(notStringi)

        */

        var notRakami = 4

        var notStringi =""

        when(notRakami){
            0-> notStringi = "Geçersiz Not"
            1->notStringi= "Zayıf"
            2-> notStringi = "Kötü"
            3-> notStringi = "Orta"
            4-> notStringi= "İyi"
            else-> notStringi= "Pek İyi"
        }

        println(notStringi)


        //Döngüler
        println("---------For-------")

        val baskaBirDizi = arrayOf(5,10,15,20,25,30)
        val q =baskaBirDizi[0] / 5 + 1
        println(q)

        println("döngü başladı")
        for (num in baskaBirDizi){
            println(num / 5 + 3)
        }
        println("döngü bitti")

        for(indeks in baskaBirDizi.indices){
            println(baskaBirDizi[indeks] / 5 + 3)
        }

        for (b in 0..9){
            println(b)
        }

        val benimDigerStringDizim = arrayListOf<String>()
        benimDigerStringDizim.add("Ayse")
        benimDigerStringDizim.add("Aytekin")

        for (str in benimDigerStringDizim){
            println(str)
        }

        benimDigerStringDizim.forEach{
            println(it)
        }

        //While
        println("---------While Döngüsü-------")

        var j = 0

        while (j < 10) {
            println(j)
            j=j+1
        }

























    }
}