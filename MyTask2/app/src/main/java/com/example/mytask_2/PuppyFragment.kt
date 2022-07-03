package com.example.mytask_2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mytask_2.databinding.FragmentPuppydogBinding

class PuppyFragment: Fragment(R.layout.fragment_puppydog) {
    private var _binding: FragmentPuppydogBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentPuppydogBinding.bind(view)

        with(binding) {
            btnEst.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "ARG", etRate.text.toString()
                )
                findNavController().navigate(
                    R.id.action_puppyFragment_to_rateFragment,
                    bundle
                )
            }

        }
    }
}