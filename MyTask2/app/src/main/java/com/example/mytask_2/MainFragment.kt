package com.example.mytask_2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mytask_2.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        with(binding) {
            btnCats.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_catsFragment)
            }
            btnDogs.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_dogsFragment)
            }
            btnKitty.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_kittyFragment)
            }
            btnPuppy.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_puppyFragment)
            }
            btnDogCat.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_dogCatFragment)
            }
        }
    }
}