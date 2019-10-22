package com.erikriosetiawan.mytestingappkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnSetValue: Button
    private lateinit var tvText: TextView
    private lateinit var imgPreview: ImageView

    private var names = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSetValue = findViewById(R.id.btn_set_value)
        btnSetValue.setOnClickListener(this)
        tvText = findViewById(R.id.tv_text)
        imgPreview = findViewById(R.id.img_preview)
        Glide.with(this).load(R.drawable.fronalpstock_big).into(imgPreview)

        names.add("Narendra Wicaksono")
        names.add("Kevin")
        names.add("Yoza")
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_set_value) {
            val name = StringBuilder()
            for (i in 0 until names.size) {
                name.append(names[i]).append("\n")
            }
            tvText.text = name.toString()
        }
    }
}
