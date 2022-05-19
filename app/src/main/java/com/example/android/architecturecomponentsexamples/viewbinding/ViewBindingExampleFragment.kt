package com.example.android.architecturecomponentsexamples.viewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.architecturecomponentsexamples.databinding.FragmentViewBindingExampleBinding

/**
 * Reference: https://developer.android.com/topic/libraries/view-binding#fragments
 */
class ViewBindingExampleFragment : Fragment() {

    companion object {
        fun newInstance() = ViewBindingExampleFragment()
    }

    private var _binding: FragmentViewBindingExampleBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentViewBindingExampleBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            welcome.text = "Welcome to View Binding"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}