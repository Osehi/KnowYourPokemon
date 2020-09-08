package com.polish.knowyourpokemon.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.view.WindowManager
import com.polish.knowyourpokemon.R
import java.lang.Exception

class UserInputActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        makeFullScreenSplash()

        setContentView(R.layout.activity_user_input)
/*
        Handler().postDelayed({
            // start activity
            startActivity(Intent(this, UserInputActivity::class.java))

            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

            finish()
        }, 2000)

 */
/*
        val background = object:Thread(){
            override fun run() {
                try {
                    Thread.sleep(2000)
                    startActivity(Intent(baseContext, UserInputActivity::class.java))

//                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
//
//                    finish()
                } catch (e:Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()
        
 */

    }



}