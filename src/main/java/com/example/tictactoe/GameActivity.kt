package com.example.tictactoe

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random


class GameActivity : AppCompatActivity() {


    private lateinit var gameTV : TextView

    private lateinit var btn0 : Button
    private lateinit var btn1 : Button
    private lateinit var btn2 : Button
    private lateinit var btn3 : Button
    private lateinit var btn4 : Button
    private lateinit var btn5 : Button
    private lateinit var btn6 : Button
    private lateinit var btn7 : Button
    private lateinit var btn8 : Button

    private lateinit var restartBtn : Button




    private var currentPlayer = 1



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        gameTV = findViewById(R.id.gameTV)

        btn0 = findViewById(R.id.btn0)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)


        restartBtn = findViewById(R.id.restartBtn)


        val intent = intent
        val playerName1 = intent.getStringExtra("playerName1") // to export player1 name
        val playerName2 = intent.getStringExtra("playerName2")





        currentPlayer = Random().nextInt(2) + 1 // puts random symbol X or O for first player

        gameTV.text = "Current Player : $playerName1"


// function to check winning combination after each move
        fun checkWinner(){

            if(btn0.text == "X" && btn1.text == "X" && btn2.text == "X"){

                btn0.setTextColor(Color.GREEN)
                btn1.setTextColor(Color.GREEN)
                btn2.setTextColor(Color.GREEN)

                gameTV.text = "$playerName1 : wins"

            }else if(btn3.text == "X" && btn4.text == "X" && btn5.text == "X"){

                btn3.setTextColor(Color.GREEN)
                btn4.setTextColor(Color.GREEN)
                btn5.setTextColor(Color.GREEN)

                gameTV.text = "$playerName1 : wins"

            }else if(btn6.text == "X" && btn7.text == "X" && btn8.text == "X"){

                btn6.setTextColor(Color.GREEN)
                btn7.setTextColor(Color.GREEN)
                btn8.setTextColor(Color.GREEN)

                gameTV.text = "$playerName1 : wins"

            }else if(btn0.text == "X" && btn3.text == "X" && btn6.text == "X"){

                btn0.setTextColor(Color.GREEN)
                btn3.setTextColor(Color.GREEN)
                btn6.setTextColor(Color.GREEN)

                gameTV.text = "$playerName1 : wins"

            }else if(btn1.text == "X" && btn4.text == "X" && btn7.text == "X"){

                btn1.setTextColor(Color.GREEN)
                btn4.setTextColor(Color.GREEN)
                btn7.setTextColor(Color.GREEN)

                gameTV.text = "$playerName1 : wins"

            }else if(btn2.text == "X" && btn5.text == "X" && btn8.text == "X"){

                btn2.setTextColor(Color.GREEN)
                btn5.setTextColor(Color.GREEN)
                btn8.setTextColor(Color.GREEN)

                gameTV.text = "$playerName1 : wins"

            }else if(btn0.text == "X" && btn4.text == "X" && btn8.text == "X"){

                btn0.setTextColor(Color.GREEN)
                btn4.setTextColor(Color.GREEN)
                btn8.setTextColor(Color.GREEN)

                gameTV.text = "$playerName1 : wins"

            }else if(btn2.text == "X" && btn4.text == "X" && btn6.text == "X"){

                btn2.setTextColor(Color.GREEN)
                btn4.setTextColor(Color.GREEN)
                btn6.setTextColor(Color.GREEN)

                gameTV.text = "$playerName1 : wins"

            }else if(btn0.text == "O" && btn1.text == "O" && btn2.text == "O"){

                btn0.setTextColor(Color.GREEN)
                btn1.setTextColor(Color.GREEN)
                btn2.setTextColor(Color.GREEN)

                gameTV.text = "$playerName2 : wins"

            }else if(btn3.text == "O" && btn4.text == "O" && btn5.text == "O"){

                btn3.setTextColor(Color.GREEN)
                btn4.setTextColor(Color.GREEN)
                btn5.setTextColor(Color.GREEN)

                gameTV.text = "$playerName2 : wins"

            }else if(btn6.text == "O" && btn7.text == "O" && btn8.text == "O"){

                btn0.setTextColor(Color.GREEN)
                btn0.setTextColor(Color.GREEN)
                btn0.setTextColor(Color.GREEN)

                gameTV.text = "$playerName2 : wins"

            }else if(btn0.text == "O" && btn3.text == "O" && btn6.text == "O"){

                btn0.setTextColor(Color.GREEN)
                btn3.setTextColor(Color.GREEN)
                btn6.setTextColor(Color.GREEN)

                gameTV.text = "$playerName2 : wins"

            }else if(btn1.text == "O" && btn4.text == "O" && btn7.text == "O"){

                btn1.setTextColor(Color.GREEN)
                btn4.setTextColor(Color.GREEN)
                btn7.setTextColor(Color.GREEN)

                gameTV.text = "$playerName2 : wins"

            }else if(btn2.text == "O" && btn5.text == "O" && btn8.text == "O"){

                btn2.setTextColor(Color.GREEN)
                btn5.setTextColor(Color.GREEN)
                btn8.setTextColor(Color.GREEN)

                gameTV.text = "$playerName2 : wins"

            }else if(btn0.text == "O" && btn4.text == "O" && btn8.text == "O"){

                btn0.setTextColor(Color.GREEN)
                btn4.setTextColor(Color.GREEN)
                btn8.setTextColor(Color.GREEN)

                gameTV.text = "$playerName2 : wins"

            }else if(btn2.text == "O" && btn4.text == "O" && btn6.text == "O"){

                btn2.setTextColor(Color.GREEN)
                btn4.setTextColor(Color.GREEN)
                btn6.setTextColor(Color.GREEN)

                gameTV.text = "$playerName2 : wins"

            }else if(btn0.isEnabled == false && btn2.isEnabled == false && btn3.isEnabled == false
                && btn4.isEnabled == false && btn5.isEnabled == false && btn6.isEnabled == false
                && btn7.isEnabled == false && btn8.isEnabled == false){

                gameTV.text = "draw"
            }

        }

// function to return each button to initial state when Play again button is pressed
        fun reset(){

            btn0.text = ""
            btn0.isEnabled = true
            btn0.setTextColor(Color.GRAY)



            btn1.text = ""
            btn1.isEnabled = true
            btn1.setTextColor(Color.GRAY)


            btn2.text = ""
            btn2.isEnabled = true
            btn2.setTextColor(Color.GRAY)


            btn3.text = ""
            btn3.isEnabled = true
            btn3.setTextColor(Color.GRAY)


            btn4.text = ""
            btn4.isEnabled = true
            btn4.setTextColor(Color.GRAY)


            btn5.text = ""
            btn5.isEnabled = true
            btn5.setTextColor(Color.GRAY)


            btn6.text = ""
            btn6.isEnabled = true
            btn6.setTextColor(Color.GRAY)


            btn7.text = ""
            btn7.isEnabled = true
            btn7.setTextColor(Color.GRAY)


            btn8.text = ""
            btn8.isEnabled = true
            btn8.setTextColor(Color.GRAY)


            currentPlayer = 1

            gameTV.text = "Current player : $playerName1"


        }


        restartBtn.setOnClickListener {

            reset()

        }


        btn0.setOnClickListener{


            if(currentPlayer == 1){

                btn0.text = "X" // player1 symbol
                btn0.isEnabled = false //disable button after move
                currentPlayer = 2 // give turn to other player
                gameTV.text = "Current Player : $playerName2" // show who will make next move
                checkWinner()

            }else{
                btn0.text = "O"
                btn0.isEnabled = false
                currentPlayer = 1
                gameTV.text = "Current Player : $playerName1"
                checkWinner()

            }

        }

        btn1.setOnClickListener{

            if(currentPlayer == 1){

                btn1.text = "X"
                btn1.isEnabled = false
                currentPlayer = 2
                gameTV.text = "Current Player : $playerName2"
                checkWinner()
            }else{

                btn1.text = "O"
                btn1.isEnabled = false
                currentPlayer = 1
                gameTV.text = "Current Player : $playerName1"
                checkWinner()
            }

        }

        btn2.setOnClickListener{
            if(currentPlayer == 1){
                btn2.text = "X"
                btn2.isEnabled = false
                currentPlayer = 2
                gameTV.text = "Current Player : $playerName2"
                checkWinner()
            }else{
                btn2.text = "O"
                btn2.isEnabled = false
                currentPlayer = 1
                gameTV.text = "Current Player : $playerName1"
                checkWinner()
            }

        }

        btn3.setOnClickListener{

            if(currentPlayer == 1){

                btn3.text = "X"
                btn3.isEnabled = false
                currentPlayer = 2
                gameTV.text = "Current Player : $playerName2"
                checkWinner()

            }else{
                btn3.text = "O"
                btn3.isEnabled = false
                currentPlayer = 1
                gameTV.text = "Current Player : $playerName1"
                checkWinner()

            }

        }

        btn4.setOnClickListener{

            if(currentPlayer == 1){

                btn4.text = "X"
                btn4.isEnabled = false
                currentPlayer = 2
                gameTV.text = "Current Player : $playerName2"
                checkWinner()
            }else{

                btn4.text = "O"
                btn4.isEnabled = false
                currentPlayer = 1
                gameTV.text = "Current Player : $playerName1"
                checkWinner()
            }

        }

        btn5.setOnClickListener{
            if(currentPlayer == 1){
                btn5.text = "X"
                btn5.isEnabled = false
                currentPlayer = 2
                gameTV.text = "Current Player : $playerName2"
                checkWinner()
            }else{
                btn5.text = "O"
                btn5.isEnabled = false
                currentPlayer = 1
                gameTV.text = "Current Player : $playerName1"
                checkWinner()
            }

        }

        btn6.setOnClickListener{

            if(currentPlayer == 1){

                btn6.text = "X"
                btn6.isEnabled = false
                currentPlayer = 2
                gameTV.text = "Current Player : $playerName2"
                checkWinner()

            }else{
                btn6.text = "O"
                btn6.isEnabled = false
                currentPlayer = 1
                gameTV.text = "Current Player : $playerName1"
                checkWinner()

            }

        }

        btn7.setOnClickListener{

            if(currentPlayer == 1){

                btn7.text = "X"
                btn7.isEnabled = false
                currentPlayer = 2
                gameTV.text = "Current Player : $playerName2"
                checkWinner()
            }else{

                btn7.text = "O"
                btn7.isEnabled = false
                currentPlayer = 1
                gameTV.text = "Current Player : $playerName1"
                checkWinner()
            }

        }

        btn8.setOnClickListener{
            if(currentPlayer == 1){
                btn8.text = "X"
                btn8.isEnabled = false
                currentPlayer = 2
                gameTV.text = "Current Player : $playerName2"
                checkWinner()
            }else{
                btn8.text = "O"
                btn8.isEnabled = false
                currentPlayer = 1
                gameTV.text = "Current Player : $playerName1"
                checkWinner()
            }

        }



    }

}



