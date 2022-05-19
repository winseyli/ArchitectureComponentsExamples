package com.example.android.architecturecomponentsexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android.architecturecomponentsexamples.viewbinding.ViewBindingExampleActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewBindingExampleButton = findViewById<Button>(R.id.button_view_binding_example)
        viewBindingExampleButton.setOnClickListener {
            openViewBindingExample()
        }
    }

    private fun openViewBindingExample() {
        val intent = Intent(this, ViewBindingExampleActivity::class.java)
        startActivity(intent)
    }
}