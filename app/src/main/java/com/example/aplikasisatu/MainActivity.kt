package com.example.aplikasisatu

import android.app.AlertDialog
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().add(R.id.frag_container,FragmentContainer.newInstance(), "Main Fragmen").commit()
        }

        supportFragmentManager.beginTransaction().replace(R.id.frag_container, FragmentMain()).commit()



        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.about -> return popupAbout()
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.

        when (item.itemId) {
            R.id.nav_ktp -> {
                changeFrag(R.id.nav_ktp)
            }
            R.id.nav_kk -> {
                changeFrag(R.id.nav_kk)
            }
            R.id.nav_kia -> {
                changeFrag(R.id.nav_kia)
            }
            R.id.nav_akta_cerai -> {
                changeFrag(R.id.nav_akta_cerai)
            }
            R.id.nav_akta_mati -> {
                changeFrag(R.id.nav_akta_mati)
            }
            R.id.nav_akta_lahir -> {
                changeFrag(R.id.nav_akta_lahir)
            }
            R.id.nav_pindah -> {
                changeFrag(R.id.nav_pindah)
            }
        }


        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    fun changeFrag(id :Int){
        var fragment :Fragment?
        when(id){
            R.id.nav_ktp -> {
                fragment = FragmentKTP()
                setTitle(R.string.ktp)
            }
            R.id.nav_kk -> {
                fragment = FragmentKK()
                setTitle(R.string.nav_kk)
            }
            R.id.nav_kia -> {
                fragment = FragmentKIA()
                setTitle(R.string.nav_kia)
            }
            R.id.nav_pindah -> {
                fragment = FragmentPindah()
                setTitle(R.string.nav_pindah)
            }
            R.id.nav_akta_lahir ->{
                fragment = FragmentAktaLahir()
                setTitle(R.string.nav_pindah)
            }
            R.id.nav_akta_cerai -> {
                fragment = FragmentAktaCerai()
                setTitle(R.string.akta_cerai)
            }
            R.id.nav_akta_mati -> {
                fragment = FragmentAktaMati()
                setTitle(R.string.akta_mati)
            }
            else -> {
                fragment = FragmentContainer()
                setTitle("Fragment Main")
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.frag_container, fragment).commit()
    }

    fun popupAbout(): Boolean {
        val builder = AlertDialog.Builder(this)

        with(builder)
        {
            setTitle("About Developer")
            setMessage("Baiklah di sini adalah wilayah developer untuk curhat \n Jadi di sini saya membuat program ini hanya untuk iseng saja," +
                    "tapi diharapkan bukan cuma iseng untuk belajar saya. Mungkin saja aplikasi ini bisa berguna untuk orang lain. Terimakasih. uWu")
            show()
        }
        return true
    }

}
