package com.cis.testui.AdapterFlower

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.cis.testui.Model.flower
import com.cis.testui.R

public class FlowerAdapter(val mCtx: Context,
                            var resource:Int,
                            var items:List<flower>)
    : ArrayAdapter<flower>(mCtx,resource,items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //return super.getView(position, convertView, parent)
        val layout: LayoutInflater = LayoutInflater.from(mCtx)

        val v: View = layout.inflate(resource,null)
        val icon : ImageView = v.findViewById(R.id.imageView)
        val name : TextView = v.findViewById(R.id.textView)
        val id: TextView = v.findViewById(R.id.textView2)

        val flower:flower = items[position]

        name.text = flower.name
        id.text = flower.id
        try {
            icon.setImageDrawable(mCtx.getDrawable(flower.icon))
        }
        catch (ex:Exception){

        }

        return v
    }
}


