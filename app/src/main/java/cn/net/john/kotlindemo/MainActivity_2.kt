package cn.net.john.kotlindemo

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity_2 : AppCompatActivity() {

    private var mTextMessage: TextView? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                mTextMessage!!.setText("主页")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                mTextMessage!!.setText("应用")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                mTextMessage!!.setText("闹钟")
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_hh -> {
                mTextMessage!!.setText("啦啦")
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_thing -> {
                mTextMessage!!.setText("待办")
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

        mTextMessage = findViewById(R.id.message) as TextView
        val navigation = findViewById(R.id.navigation) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

}
