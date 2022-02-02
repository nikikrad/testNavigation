package com.example.newtestproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.newtestproject.databinding.FragmentFirstBinding

class FirstFragment: Fragment() {
    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        val view = inflater.inflate(R.layout.fragment_first,container,false)
//        binding.btnNext.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
//        }
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnNext.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}