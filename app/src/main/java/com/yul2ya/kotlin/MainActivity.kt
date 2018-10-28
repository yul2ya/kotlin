package com.yul2ya.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private val checkBoxes = ArrayList<CheckBox>()
    private var team1 : TextView? = null
    private var team2 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("카오스 팀 나누기 made by 율")

        checkBoxes += arrayListOf<CheckBox>(
                findViewById<CheckBox>(R.id.checkBox1),
                findViewById<CheckBox>(R.id.checkBox2),
                findViewById<CheckBox>(R.id.checkBox3),
                findViewById<CheckBox>(R.id.checkBox4),
                findViewById<CheckBox>(R.id.checkBox5),
                findViewById<CheckBox>(R.id.checkBox6))

        team1 = findViewById<TextView>(R.id.team1)
        team2 = findViewById<TextView>(R.id.team2)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            val users = ArrayList<String>()
            for (checkBox in checkBoxes) {
                if (checkBox.isChecked)
                    users.add(checkBox.text.toString())
            }
            if (users.size <= 1) {
                Toast.makeText(this, "팀원을 선택하세요.", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            decideTeam(users)
        })
    }

    fun decideTeam(users : ArrayList<String>) {
        val heroes = users
        val random = Random()
        var team1Str = "팀 1 : "
        for(i in 0 until heroes.size/2) {
            var pick = random.nextInt(heroes.size)
            println(heroes[pick])
            team1Str += "${heroes[pick]} "
            heroes.removeAt(pick)
        }
        println("vs")
        var team2Str = "팀 2 : "
        for(i in heroes) {
            println(i)
            team2Str += "$i "
        }

        team1?.text = team1Str
        team2?.text = team2Str
        Toast.makeText(this, "완료되었습니다.", Toast.LENGTH_SHORT).show()
    }
}
