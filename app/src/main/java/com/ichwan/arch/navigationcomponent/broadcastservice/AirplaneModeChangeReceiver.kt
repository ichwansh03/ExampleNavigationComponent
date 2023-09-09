package com.ichwan.arch.navigationcomponent.broadcastservice

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.widget.Toast

class AirplaneModeChangeReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        val isAirplaneModeOn = Settings.Global.getInt(
            context?.contentResolver,
            Settings.Global.AIRPLANE_MODE_ON,
            0) != 0

        if (intent?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED && isAirplaneModeOn){
            Toast.makeText(context, "Airplane mode is enabled", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "Airplane mode is disabled", Toast.LENGTH_SHORT).show()
        }
    }
}