package com.example.yingaccouting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.yingaccouting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Spinner值設定
        val spinner_adapter = ArrayAdapter.createFromResource(this,R.array.type,
            com.google.android.material.R.layout.support_simple_spinner_dropdown_item)
        binding.TypeSpinner.adapter = spinner_adapter


    }
}