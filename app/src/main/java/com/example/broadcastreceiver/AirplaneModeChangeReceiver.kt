package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class AirplaneModeChangeReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        // Xác nhận yêu cầu có bật AirPlaneMode hay không
        var isAirplaneModeEnabled = intent?.getBooleanExtra("state", false) ?: return

        if (isAirplaneModeEnabled) {
            Toast.makeText(context, "Airplane Mode enabled", Toast.LENGTH_LONG).show()
            Log.d(AirplaneModeChangeReceiver::class.java.simpleName, "Air Plane Mode")
        } else {
            Toast.makeText(context, "Airplane Mode disabled", Toast.LENGTH_LONG).show()
            Log.d(AirplaneModeChangeReceiver::class.java.simpleName, "Air Plane Off")
        }
    }
}