package com.dharringtondev.warzonestats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.dharringtondev.warzonestats.remote.WarzoneService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.IO) {
            val response = WarzoneService.create().getWeeklyStats("Jet_tct", "psn")
            if (response.isSuccessful) {
                Log.d(TAG, "CODE: ${response.code()}")
                Log.d(TAG, response.raw().toString())
                Log.d(TAG, response.body().toString())
            } else {
                Log.d(TAG, "NOT SUCCESSFUL")
                Log.d(TAG, "CODE: ${response.code()}")
                Log.d(TAG, response.headers().toString())
                Log.e(TAG, response.message())
                Log.e(TAG, response.raw().toString())
            }
        }
    }
}