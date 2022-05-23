package com.example.android.architecturecomponentsexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android.architecturecomponentsexamples.databinding.DataBindingExampleActivity
import com.example.android.architecturecomponentsexamples.viewbinding.ViewBindingExampleActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_view_binding_example_activity)
            .setOnClickListener {
                openViewBindingExampleActivity()
            }

        findViewById<Button>(R.id.button_view_binding_example_fragment)
            .setOnClickListener {
                openViewBindingExampleFragment()
            }

        findViewById<Button>(R.id.button_data_binding_example_activity)
            .setOnClickListener {
                openDataBindingExampleActivity()
            }
    }

    private fun openViewBindingExampleActivity() {
        val intent = Intent(this, ViewBindingExampleActivity::class.java)
        startActivity(intent)
    }

    private fun openViewBindingExampleFragment() {
        val intent = Intent(this, FragmentContainerActivity::class.java).apply {
            putExtra(Intent.EXTRA_INDEX, R.layout.fragment_view_binding_example)
        }
        startActivity(intent)
    }

    private fun openDataBindingExampleActivity() {
        val intent = Intent(this, DataBindingExampleActivity::class.java)
        startActivity(intent)
    }
}