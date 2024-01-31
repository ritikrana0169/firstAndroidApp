package com.masai

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.ComponentActivity



class MainActivity : ComponentActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coolBtn=findViewById<Button>(R.id.coolButton)
        val hotBtn=findViewById<Button>(R.id.hotButton)
        val linearBtn=findViewById<LinearLayout>(R.id.linearLay)


        coolBtn.setOnClickListener{
            linearBtn.setBackgroundColor(getColor(R.color.blue))



        }
        hotBtn.setOnClickListener{
            linearBtn.setBackgroundColor(getColor(R.color.red))
        }



}
}