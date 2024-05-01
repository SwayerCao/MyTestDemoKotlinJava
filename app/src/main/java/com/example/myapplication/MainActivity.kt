package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.view.AnimActivity

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View) {
        var  intent = Intent(this,AnimActivity::class.java)
        when(v.id) {
            R.id.to_anim_page -> {
//                intent.
                startActivity(intent)
            }
        }
    }
}