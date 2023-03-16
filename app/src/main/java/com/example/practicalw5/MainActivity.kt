package com.example.practicalw5

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListerners()
    }

    private fun makeColored(view: View){
        when (view.id){

                // Boxes using class colors for the background
                R.id.boxone -> view.setBackgroundColor(Color.DKGRAY)
                R.id.boxtwo -> view.setBackgroundColor(Color.DKGRAY)
                R.id.boxthree-> view.setBackgroundColor(Color.DKGRAY)
                R.id.boxfour -> view.setBackgroundColor(Color.DKGRAY)
                R.id.boxfive -> view.setBackgroundColor(Color.DKGRAY)
            else -> view.setBackgroundColor(Color.LTGRAY)


        }
    }

    private fun setListerners(){
        val boxone = findViewById<TextView>(R.id.boxone)
        val boxtwo = findViewById<TextView>(R.id.boxtwo)
        val boxthree = findViewById<TextView>(R.id.boxthree)
        val boxfour = findViewById<TextView>(R.id.boxfour)
        val boxfive = findViewById<TextView>(R.id.boxfive)

        val rootContraintLayout = findViewById<View>(R.id.contraint_layout)

        val clickableView : List<View> =
            listOf(boxone,boxtwo,boxthree,boxfour,boxfive,rootContraintLayout)

        for (item in clickableView) {
            item.setOnClickListener{makeColored(it)}

        }

    }

}
