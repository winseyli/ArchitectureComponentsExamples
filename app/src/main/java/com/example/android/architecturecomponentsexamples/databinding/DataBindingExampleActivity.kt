package com.example.android.architecturecomponentsexamples.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.android.architecturecomponentsexamples.R

/**
 * https://developer.android.com/topic/libraries/data-binding/expressions
 */
class DataBindingExampleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataBindingExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_example)
        binding.user = User("Winsey", "Li")
    }
}