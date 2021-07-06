package com.example.calculation_with_figonumbers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class RvFigoNumbers(var numberList: MutableList<BigInteger>):RecyclerView.Adapter<NumbersViewHolder>(){

override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
        NumbersViewHolder {
    var itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_rv_figo_numbers,parent,false)
    return NumbersViewHolder(itemView)
}

     override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
         holder.tvNumbers.text=numberList.get(position).toString()
     }

     override fun getItemCount(): Int {
         return  numberList.size

     }

 }



class NumbersViewHolder(var itemView:View):RecyclerView.ViewHolder(itemView){
    var tvNumbers=itemView.findViewById<TextView>(R.id.tvNumbers)

}