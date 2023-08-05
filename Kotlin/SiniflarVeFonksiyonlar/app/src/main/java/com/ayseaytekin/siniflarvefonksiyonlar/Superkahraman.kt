package com.ayseaytekin.siniflarvefonksiyonlar

class Superkahraman (var isim:String, var yas:Int, var meslek:String){
    //Bu olayı sadece kotlinde yapabiliyoruz. (buna Primary Consractor denir.)

   private var sacininRengi = "Sarı"

     fun testFonksiyonu(){
        println("test")
    }

    //Getter (Göstermek istiyorum )
    fun sacRenginiAl() : String{
        return this.sacininRengi
    }
    //Setter (Ama değiştirilmesini istemiyorum )
    /*
    fun sacRenginiDegistir(){
        this.sacininRengi="Yeşil"
    }
    */





 /* Access Levels ( Erişilebilirlik Seviyeleri )
  4 tane var ;
  1) Private (Sadece yazdığım sınıfta kullanabilirim . başka bir yerden erişim sağlayamam.)
  2) Protected (Aynı dosyanın içindeki tüm sınıflardan erişebilirim . )
  3) Internal (Sadece kendi modüllerim içinden ulaşabilirim. )
  4) Public ( Her yerden ulaşabilirim . )  */



  /*
   //Pperty

   var isim = ""
   var yas = 0
   var meslek = ""

   //Constructor

   constructor(isimGirdisi:String,yasGirdisi: Int,meslekGirdisi:String){
    this.isim= isim
    this.yas= yas
    this.meslek= meslek


    println("Constractor çağırıldı.")
}

*/


}