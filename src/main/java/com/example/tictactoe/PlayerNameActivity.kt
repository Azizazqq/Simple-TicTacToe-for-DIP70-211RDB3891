package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


private var name = ""

class PlayerNameActivity : AppCompatActivity() {

    private lateinit var enterPlayerNameBtn : Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_name)

        enterPlayerNameBtn = findViewById(R.id.enter_player_name_btn)

        enterPlayerNameBtn.setOnClickListener {

            val editText1 = findViewById<EditText>(R.id.editText1)
            val editText2 = findViewById<EditText>(R.id.editText2)

            val playerName1 = editText1.text.toString()
            val playerName2 = editText2.text.toString()

            val intent = Intent(this, GameActivity::class.java)
            intent.putExtra("playerName1", playerName1)
            intent.putExtra("playerName2", playerName2)

            startActivity(intent)

        }
    }
}