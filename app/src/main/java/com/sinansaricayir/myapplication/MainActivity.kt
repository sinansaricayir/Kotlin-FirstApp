package com.sinansaricayir.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



       //toplama(10,20)

       /* var sonuc = carpma(10,20)
        textView.text="Çarpım ${sonuc}"

        */

        val homer = Simpson("sinan",29,"yazilimci")
        //homer.age=29
        //homer.job="Software"
        //homer.name="Ballis Homer"

        val sinan =Simpson("Sinan",29,"Software Mobile")

        println(homer.job)
        println(sinan.job)
        println(sinan.name)




    }

    fun toplama(a:Int,b:Int){

        textView.text="Toplam : ${a+b}"
    }

    fun carpma(a:Int,b:Int):Int{
        return a*b
    }

    fun helloFunction(view : View){
        textView.text="Merhaba Sinan Sarıçayır"
    }

}