package com.smartherd.navigationmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.content.Intent
import android.support.design.widget.NavigationView
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener
import android.support.v4.view.GravityCompat
import android.support.v7.widget.Toolbar
import android.widget.Toast.*
import com.smartherd.navigationmenu.R.id.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawer_layout)
        val mToggle = ActionBarDrawerToggle (this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(mToggle)
        mToggle.syncState()
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)

        nav_view.setNavigationItemSelectedListener(this)

    }

    //set clickheader menu
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val mToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(mToggle)
        mToggle.syncState()
        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true)
        if (mToggle!!.onOptionsItemSelected(item)) {
            return true
        } else {
            return super.onOptionsItemSelected(item)
        }
    }

    /*when navigation drawable on click*/
    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        val nav_inc : String = item.itemId.toString()

        /*text menu*/

        val dasboard : String = resources.getText(R.string.dashBoard) as String
        val event : String = resources.getText(R.string.event) as String
        val search : String = resources.getText(R.string.search) as String
        val settings : String = resources.getText(R.string.settings) as String
        val activities : String = resources.getText(R.string.activities) as String
        val logout : String = resources.getText(R.string.logout) as String

        if(nav_inc.equals(db.toString())){
            Toast.makeText(this, dasboard, Toast.LENGTH_SHORT).show()
            tv_title.text = dasboard
        }
        if(nav_inc.equals(event.toString())){
            Toast.makeText(this, event, Toast.LENGTH_SHORT).show()
            tv_title.text = "Event"
        }
        if(nav_inc.equals(search.toString())){
            Toast.makeText(this, search, Toast.LENGTH_SHORT).show()
            tv_title.text = "Search"
        }
        if(nav_inc.equals(settings.toString())){
            Toast.makeText(this, settings, Toast.LENGTH_SHORT).show()
            tv_title.text = "Settings"
        }
        if(nav_inc.equals(activities.toString())){
            Toast.makeText(this, activities, Toast.LENGTH_SHORT).show()
            tv_title.text = "Activities"
        }
        if(nav_inc.equals(logout.toString())){
            Toast.makeText(this, logout, Toast.LENGTH_SHORT).show()
            tv_title.text = "Logout"
        }

        /*when (item.itemId) {
            db -> {
                Toast.makeText(this,"Dashboard",Toast.LENGTH_SHORT).show()
            }
            event -> {
                Toast.makeText(this, nav +" "+ event, Toast.LENGTH_SHORT).show()
            }
            search -> {
                Toast.makeText(this,"Search",Toast.LENGTH_SHORT).show()
            }
            settings ->{
                Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show()
            }
            activities ->{
                Toast.makeText(this, "activities", Toast.LENGTH_SHORT).show()
            }
            logout ->{
                Toast.makeText(this,"Log out", Toast.LENGTH_SHORT).show()
            }
        }*/

        /*close menu drawer_layout*/
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

}
