package com.harsh_mistry.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_call.setOnClickListener {
            var intent= Intent()
            intent.setAction(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:"+et_call.text.toString()))
            startActivity(intent)
        }

    }
}