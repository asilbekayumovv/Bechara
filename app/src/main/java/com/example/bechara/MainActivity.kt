package com.example.bechara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bechara.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = mutableListOf<String>()
list.add("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg")
list.add("https://cdn.pixabay.com/photo/2016/11/04/21/34/beach-1799006__480.jpg")
        binding.vp.adapter = ImagePagerAdapter(list)
    }
}