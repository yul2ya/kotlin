package com.yul2ya.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello world!")
        var x = max(2, 3)
        println("max: $x")
    }

    fun max(a: Int, b: Int) = if (a > b) a else b
}
