package edu.uw.ischool.asingh28.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import edu.uw.ischool.asingh28.quizapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quizes = arrayOf("Math", "Physics", "Marvel Superheroes")

        val mListView = findViewById<ListView>(R.id.quizlist)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, quizes)
        mListView.adapter = arrayAdapter

        mListView.setOnItemClickListener { parent, view, position, id ->
            val selectedQuiz = quizes[position]
            val intent = Intent(this, topic::class.java)
            intent.putExtra("quizTopic", selectedQuiz)
            startActivity(intent)
        }
    }
}
