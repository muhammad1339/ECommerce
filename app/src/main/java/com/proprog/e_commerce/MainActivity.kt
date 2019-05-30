package com.proprog.e_commerce

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu_layout)
//        setSupportActionBar(toolbar_main)
//        supportActionBar?.title = "E-Commerce"
//        val toggle = ActionBarDrawerToggle(
//            this, drawer_layout, toolbar_main, R.string.open, R.string.close
//        )
//        drawer_layout.addDrawerListener(toggle)
//        toggle.syncState()
    }
}
