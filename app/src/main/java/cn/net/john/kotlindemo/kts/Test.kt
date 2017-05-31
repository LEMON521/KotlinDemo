package cn.net.john.kotlindemo.kts

import android.util.Log

/**
 * Created by Zrzc on 2017/5/24.
 */
class Test public  constructor(str:String){
    init {
        print(str)
        Log.e("------Test-----",str)
    }

}