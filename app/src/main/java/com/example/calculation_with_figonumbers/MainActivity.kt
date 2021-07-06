 package com.example.calculation_with_figonumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var rvNumber: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      fibonacci(100)

    }
    fun  fibonacci(number:Int):List<BigInteger>{
        rvNumber=findViewById(R.id.rvNumbers)
        var numberList= MutableList<BigInteger>(number,{BigInteger.ZERO})
        var numberAdapter=RvFigoNumbers(numberList)
        var number1=BigInteger.ZERO
        var number2=BigInteger.ONE
        numberList[0]=number1
        numberList[1]=number2
        for (y in 1..number){
            
            var sum=number1+number2
            number1=number2
            number2=sum
            numberList[y-1]=number1
        }
        rvNumber.layoutManager=LinearLayoutManager(baseContext)
        rvNumber.adapter=numberAdapter
            return numberList

    }
    }
