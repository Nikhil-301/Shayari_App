package com.example.shayriapp

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shayriapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var shayariList=ArrayList<DataEntity>()
    private val rvAdapter by lazy {
        RvAdapater(this,shayariList)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        shayariList.addAll(SampleData.data)
        binding.rv.layoutManager= LinearLayoutManager(this)
        binding.rv.adapter=rvAdapter
        binding.fab.setOnClickListener { view ->
            startActivity(Intent(this,AddEdistActivity::class.java))
        }
    }}