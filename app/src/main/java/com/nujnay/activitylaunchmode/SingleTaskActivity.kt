package com.nujnay.activitylaunchmode

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
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
        var view = View(this)
        view.setOnClickListener {
            startActivity(Intent(this@SingleTaskActivity, NormalActivity1::class.java))
        }
        (window.decorView as FrameLayout).addView(view)
        view.layoutParams = FrameLayout.LayoutParams(500, 500)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.d("datadata", "ggggg")
        if (resultCode == 1111) {
            Log.d("datadata", data!!.getStringExtra("goIntent"))
        }
    }
}