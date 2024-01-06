package com.example.broadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var receiverAirplane: AirplaneModeChangeReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Đăng ký BroadcastReceiver với action
        receiverAirplane = AirplaneModeChangeReceiver()
        val filter = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)

        registerReceiver(receiverAirplane, filter)

    }

    // Huỷ đăng ký broadcast receiver khi không cần nữa
    override fun onDestroy() {
        super.onDestroy()
        // Huỷ đăng ký Broadcast Receiver khi không cần nữa
        unregisterReceiver(receiverAirplane)
    }
}