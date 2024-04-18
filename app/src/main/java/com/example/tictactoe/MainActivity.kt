package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    private lateinit var enterName : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        enterName = findViewById(R.id.enter_player_name_btn)


        enterName.setOnClickListener {

            val editText = findViewById<EditText>(R.id.editText2)
            val playerName = editText.text.toString()

            val intent = Intent(this, PlayerName::class.java)
            intent.putExtra("playerName", playerName) //to export user player name value to the next Activity
            startActivity(intent)


        }

    }
}