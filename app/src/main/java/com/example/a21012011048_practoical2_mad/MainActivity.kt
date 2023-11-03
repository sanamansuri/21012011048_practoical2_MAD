package com.example.a21012011048_practoical2_mad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //showMessage("onCreate() method is called")
    }
    override fun onStart() {
        super.onStart()
        showmsg("onStart() method is called")
    }
    override fun onResume() {
        super.onResume()
        showmsg("onResume() method is called")
    }
    override fun onPause() {
        super.onPause()
        showmsg("onPause() method is called")
    }
    override fun onStop() {
        super.onStop()
        showmsg("onStop() method is called")
    }
    override fun onDestroy() {
        super.onDestroy()
        showmsg("onDestroy() method is called")
    }
    fun showmsg(msg:String)
    {
        Log.i("TAG","$msg")
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()

        Snackbar.make(findViewById(R.id.Mainpage) , msg ,
            Snackbar.LENGTH_LONG).show()
    }
}