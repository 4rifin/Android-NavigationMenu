package com.smartherd.navigationmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.smartherd.navigationmenu.R.id.drawer
import android.content.Intent
import android.support.design.widget.NavigationView
import android.widget.Toast.*


class MainActivity : AppCompatActivity() {

    var DrawerLayout : DrawerLayout? = null
    var mToggle : ActionBarDrawerToggle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val drawerLayout : DrawerLayout = findViewById(R.id.drawer)
        val mToggle = ActionBarDrawerToggle (this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(mToggle)
        mToggle.syncState()
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)
    }



    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        val drawerLayout : DrawerLayout = findViewById(R.id.drawer)
        val mToggle = ActionBarDrawerToggle (this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(mToggle)
        mToggle.syncState()
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)
        if(mToggle!!.onOptionsItemSelected(item)){
            return true
        }
     return super.onOptionsItemSelected(item)
    }

}
