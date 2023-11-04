package edu.uw.ischool.asingh28.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.Button

class topic : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_topic)

            val topic = intent.getStringExtra("TOPIC")
            // Initialize UI elements with topic details (description, total questions, etc.)

            val beginButton: Button = findViewById(R.id.beginButton)
            beginButton.setOnClickListener {
                // Start First Question Activity for the selected topic
                val intent = Intent(this, QuestionActivity::class.java)
                intent.putExtra("TOPIC", topic)
                startActivity(intent)
            }
        }
    }
