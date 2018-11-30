package com.nujnay.activitylaunchmode

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log

class NormalActivity1 : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LaunchModeLaunchMode", "NormalActivity1" + "::" + "onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LaunchModeLaunchMode", "NormalActivity1" + "::" + "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LaunchModeLaunchMode", "NormalActivity1" + "::" + "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LaunchModeLaunchMode", "NormalActivity1" + "::" + "onResume")
        startActivity(Intent(this@NormalActivity1, NormalActivity2::class.java))
        finish()
    }


}