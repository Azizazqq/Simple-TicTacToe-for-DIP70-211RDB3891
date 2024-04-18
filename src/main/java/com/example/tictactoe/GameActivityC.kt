package com.example.tictactoe

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


private lateinit var buttons: Array<Button>
private var playerTurn = true // first player turn
private var gameOver = false // game over state
private var name = "" // to handle player name which was given when user enter the app


//the code partly was written using chatGPT

class GameActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_c)


        val intent = intent
        val playerName = intent.getStringExtra("playerName") //import player name from first Activity(MainActivity)

        name = "$playerName"


        //array to keep all game buttons
        buttons = Array(9) { index ->
            findViewById<Button>(resources.getIdentifier("btn$index", "id", packageName))
        }
    }



    //function for player to make move
    fun buttonClick(view: View) {
        if (!gameOver && view is Button) { //
            val buttonIndex = buttons.indexOf(view)
            if (buttons[buttonIndex].text.isEmpty()) { // to allow player choose only empty buttons
                if (playerTurn) { // check if its players turn
                    buttons[buttonIndex].text = "X" //players symbol
                    checkGameStatus()
                    playerTurn = false
                    if (!gameOver) {
                        computerMove()
                    }
                }
            }
        }
    }

    private fun computerMove() {
        val emptyButtons = buttons.filter { it.text.isEmpty() } //for computer to make its move to empty button
        if (emptyButtons.isNotEmpty()) {
            val randomIndex = Random.nextInt(emptyButtons.size) //computer randomly make moves
            emptyButtons[randomIndex].text = "O"
            checkGameStatus()
            playerTurn = true
        }
    }



    //function to check winning combination after each move
    private fun checkGameStatus() {
        //possible winning combinations
        val lines = arrayOf(
            intArrayOf(0, 1, 2),
            intArrayOf(3, 4, 5),
            intArrayOf(6, 7, 8),
            intArrayOf(0, 3, 6),
            intArrayOf(1, 4, 7),
            intArrayOf(2, 5, 8),
            intArrayOf(0, 4, 8),
            intArrayOf(2, 4, 6)
        )


        for (line in lines) {
            val (a, b, c) = line
            if (buttons[a].text.isNotEmpty() && buttons[a].text == buttons[b].text && buttons[a].text == buttons[c].text) {
                gameOver = true
                announceWinner(buttons[a].text.toString()) // possible winners Player or Computer
                return
            }
        }

        if (!buttons.any { it.text.isEmpty() }) {
            gameOver = true
            announceWinner("Draw")
        }
    }

    //function to print winner name
    private fun announceWinner(winner: String) {
        val gameTextView = findViewById<TextView>(R.id.gameTV)
        if (winner == "X") {
            gameTextView.text = "$name wins"
        } else if (winner == "O") {
            gameTextView.text = "Computer wins"
        } else {
            gameTextView.text = "Draw"
        }
    }



    //function to clear button text and reset the game
    fun restartGame(view: View) {
        for (button in buttons) {
            button.text = ""
        }
        val gameTextView = findViewById<TextView>(R.id.gameTV)
        gameTextView.text = "Tic Tac Toe"


        playerTurn = true
        gameOver = false
    }



}
