package com.example.android.architecturecomponentsexamples.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.architecturecomponentsexamples.databinding.ActivityViewBindingExampleBinding

/**
 * Reference: https://developer.android.com/topic/libraries/view-binding#activities
 */
class ViewBindingExampleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewBindingExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            welcome.text = "Welcome to View Binding"
        }
    }
}