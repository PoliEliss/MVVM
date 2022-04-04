package com.rorono.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.rorono.mvvm.databinding.ActivityMainBinding
import com.rorono.mvvm.utilits.APP_ACTIVITY

class MainActivity : AppCompatActivity() {
    lateinit var mToolbar: androidx.appcompat.widget.Toolbar

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        APP_ACTIVITY = this
        mToolbar = binding.toolbar
        setSupportActionBar(mToolbar)
        title = getString(R.string.title)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

    }


}