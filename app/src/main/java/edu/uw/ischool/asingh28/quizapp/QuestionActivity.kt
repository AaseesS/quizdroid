package edu.uw.ischool.asingh28.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast


class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val topic = intent.getStringExtra("TOPIC")
        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        val submitButton: Button = findViewById(R.id.submitButton)

        submitButton.isEnabled = false

        submitButton.setOnClickListener {
            val selectedAnswer = when (radioGroup.checkedRadioButtonId) {
                R.id.option1RadioButton -> "Option 1"
                R.id.option2RadioButton -> "Option 2"
                else -> ""
            }

            if (selectedAnswer.isNotEmpty()) {
                val intent = Intent(this, AnswerActivity::class.java)
                intent.putExtra("TOPIC", topic)
                intent.putExtra("SELECTED_ANSWER", selectedAnswer)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show()
            }
        }

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            submitButton.isEnabled = checkedId != -1
        }
    }
}
