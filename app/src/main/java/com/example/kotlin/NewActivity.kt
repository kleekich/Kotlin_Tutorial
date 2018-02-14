package com.example.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_new.*


/**
 * Created by kangsik_kevin_lee on 2/13/18.
 */

class NewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        textView.setText("Kotlin, view Binding!");
    }

    fun sendMessage(view: View) {

    }

}
