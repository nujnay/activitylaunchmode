package com.nujnay.activitylaunchmode

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout

class SingleTaskActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LaunchModeLaunchMode", "SingleTaskActivity" + "::" + "onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LaunchModeLaunchMode", "SingleTaskActivity" + "::" + "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LaunchModeLaunchMode", "SingleTaskActivity" + "::" + "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LaunchModeLaunchMode", "SingleTaskActivity" + "::" + "onResume")
        (window.decorView as FrameLayout).setOnClickListener { startActivity(Intent(this@SingleTaskActivity, NormalActivity1::class.java)) }
    }
}