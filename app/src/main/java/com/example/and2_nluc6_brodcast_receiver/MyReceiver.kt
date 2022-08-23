package com.example.and2_nluc6_brodcast_receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        when(intent.action){
            Intent.ACTION_POWER_CONNECTED -> Toast.makeText(context,"ACTION POWER_CONNECTED",Toast.LENGTH_LONG).show()
            Intent.ACTION_POWER_DISCONNECTED -> Toast.makeText(context,"ACTION_POWER_DISCONNECTED",Toast.LENGTH_LONG).show()
            Intent.ACTION_BATTERY_LOW -> Toast.makeText(context,"BATTERY_LOW",Toast.LENGTH_LONG).show()
            Intent.ACTION_BOOT_COMPLETED -> Toast.makeText(context,"BOOT_COMPLETED",Toast.LENGTH_LONG).show()
            "com.b.alkhatib" -> Toast.makeText(context,"${intent.getStringExtra("com.b.alkhatib.msg")}",Toast.LENGTH_LONG).show()


        }
    }

    //تفحص اتصال الانترنت وترجع بولين  +
    //run
    /*
    @RequiresApi(Build.VERSION_CODES.M)
    fun isNetworkavaliable(context: Context) =
        (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).run {
            getNetworkCapabilities(activeNetwork)?.run {  //اعدادات الشبكةهات
                hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)  // هل في بيانات بالشبكة
                        || hasTransport(NetworkCapabilities.TRANSPORT_WIFI) // هل في واي فاي
                        || hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) // هل الجهاز موصل
            } ?: false
        }


    companion object{ //حتى استدعيها باسم الاكتيفيتي
        var connction: Connection? = null //الاكتيفيتي حتعطيه قيمة
    }


    interface Connection{ //حتى ااربطها مع الاكتيفيتي
        fun onConnectionChange(isConnection:Boolean)
    }
    */

}