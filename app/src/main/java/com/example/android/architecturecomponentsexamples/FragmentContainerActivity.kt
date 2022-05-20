package com.example.android.architecturecomponentsexamples

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.android.architecturecomponentsexamples.viewbinding.ViewBindingExampleFragment

class FragmentContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_container)

        if (savedInstanceState == null) {
            val layoutRes = intent.getIntExtra(
                Intent.EXTRA_INDEX,
                -1
            )

            when (layoutRes) {
                R.layout.fragment_view_binding_example -> addFragment<ViewBindingExampleFragment>()
                else -> {}
            }
        }
    }

    private inline fun <reified F : Fragment> addFragment() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<F>(R.id.fragment_container_view)
        }
    }
}