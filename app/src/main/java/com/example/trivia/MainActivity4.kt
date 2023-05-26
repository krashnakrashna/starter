package com.example.trivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val allStat:ArrayList<StatFeed> = ArrayList()
        allStat.add(StatFeed("",R.drawable.b))
        allStat.add(StatFeed("",R.drawable.c))
        allStat.add(StatFeed("",R.drawable.de))
        allStat.add(StatFeed("",R.drawable.e))

    val simpleGrid:GridView= findViewById<GridView>(R.id.simpleGridView)
        simpleGrid.adapter = StatAdapter(this,allStat)
        val  button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val intent = Intent(this,category::class.java)
            startActivity(intent)
        }
    }



}