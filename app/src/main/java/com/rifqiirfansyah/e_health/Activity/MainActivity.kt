package com.rifqiirfansyah.e_health.Activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.rifqiirfansyah.e_health.Popup.PopUpRest
import com.rifqiirfansyah.e_health.Popup.Popup
import com.rifqiirfansyah.e_health.R
import com.rifqiirfansyah.e_health.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.home -> replaceFragment(Home())
                R.id.nutrition -> replaceFragment(Nutrition())
                R.id.workout -> replaceFragment(WorkOut())
                R.id.turu -> replaceFragment(Turu())

                else ->{
                }
            }
            true
        }
    }

    private fun replaceFragment(fragment : Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()


    }

    fun rk1(v: View) {
        var i: Intent? = null
        i = Intent(Intent.ACTION_VIEW, Uri.parse("https://hellosehat.com/kebugaran/kardio/cara-belajar-berenang/"))
        startActivity(i)
    }

    fun rk2(v: View) {
        var i: Intent? = null
        i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.halodoc.com/artikel/5-jenis-olahraga-kardio-yang-bisa-dilakukan-di-rumah"))
        startActivity(i)
    }


    fun rk3(v: View) {
        var i: Intent? = null
        i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lifehack.org/688549/the-ultimate-workout-routines-for-men"))
        startActivity(i)
    }


    fun senin(v: View) {
        // Pop Up
        val dialogProgres = Popup()
        dialogProgres.setupDialog("senin")
        dialogProgres.setCancelable(false)
        dialogProgres.show(supportFragmentManager, "test")
    }

    fun selasa(v: View) {
        // Pop Up
        val dialogProgres = Popup()
        dialogProgres.setupDialog("selasa")
        dialogProgres.setCancelable(false)
        dialogProgres.show(supportFragmentManager, "test")
    }

    fun kamis(v: View) {
        // Pop Up
        val dialogProgres = Popup()
        dialogProgres.setupDialog("kamis")
        dialogProgres.setCancelable(false)
        dialogProgres.show(supportFragmentManager, "test")
    }

    fun sabtu(v: View) {
        // Pop Up
        val dialogProgres = Popup()
        dialogProgres.setupDialog("sabtu")
        dialogProgres.setCancelable(false)
        dialogProgres.show(supportFragmentManager, "test")
    }

    fun minggu(v: View) {
        // Pop Up
        val dialogProgres = Popup()
        dialogProgres.setupDialog("minggu")
        dialogProgres.setCancelable(false)
        dialogProgres.show(supportFragmentManager, "test")
    }

    fun rest(v: View) {
        // Pop Up
        val dialogProgres = PopUpRest()
        dialogProgres.show(supportFragmentManager, "test")
    }
}

