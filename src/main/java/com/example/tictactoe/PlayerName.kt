package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity





class PlayerName : AppCompatActivity() {

    private lateinit var playWithComputerBtn: Button
    private lateinit var playWithFriendBtn: Button
    private lateinit var welcome : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_name2)

        playWithComputerBtn = findViewById(R.id.play_with_computer_btn)
        playWithFriendBtn = findViewById(R.id.play_with_friend_btn)


        welcome = findViewById(R.id.welcome)

        val intent = intent
        val playerName = intent.getStringExtra("playerName") //to import entered player name from previous Activity
        welcome.text = "Welcome  $playerName"

        playWithFriendBtn.setOnClickListener {


            val intent = Intent(this, PlayerNameActivity::class.java)
            startActivity(intent)
        }

        playWithComputerBtn.setOnClickListener {


            val intent = Intent(this, GameActivityC::class.java)
            intent.putExtra("playerName", playerName) // to export player name to the PVC game
            startActivity(intent)
        }

    }
}