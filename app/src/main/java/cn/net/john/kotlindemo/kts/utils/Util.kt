package cn.net.john.kotlindemo.kts.utils

import android.content.Context
import android.widget.Toast

/**
 * Created by Zrzc on 2017/5/26.
 */
class Util {
    fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }
}