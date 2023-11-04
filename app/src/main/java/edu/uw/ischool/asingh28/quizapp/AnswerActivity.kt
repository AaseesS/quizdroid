package edu.uw.ischool.asingh28.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView



class AnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        val topic = intent.getStringExtra("TOPIC")
        val selectedAnswer = intent.getStringExtra("SELECTED_ANSWER")
        // Implement logic to get the correct answer and check if it's correct

        val answerTextView: TextView = findViewById(R.id.answerTextView)
        val nextButton: Button = findViewById(R.id.nextButton)
        val finishButton: Button = findViewById(R.id.finishButton)
    }
}
