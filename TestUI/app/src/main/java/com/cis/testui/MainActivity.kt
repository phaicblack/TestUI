package com.cis.testui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.cis.testui.AdapterFlower.FlowerAdapter
import com.cis.testui.Model.flower

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var flowers = mutableListOf<flower>()

        flowers.add(flower("เคว","Kayle in LOL",R.drawable.kk))
        flowers.add(flower("อาท็อก","Artox in LOL",R.drawable.aa))


        var listview: ListView = findViewById(R.id.customlistview)

        listview.adapter = FlowerAdapter(this,
            R.layout.listitem_flower,flowers)

        listview.setOnItemClickListener { parent, view, position, id ->
            //Toast.makeText(this,position.toString(),Toast.LENGTH_SHORT).show()
            if(position==0){
                var i = Intent(this,Phai1::class.java)
                startActivity(i)
            }
            else if(position==1){
                var i = Intent(this,Phai3::class.java)
                startActivity(i)
            }


    }
}
}
