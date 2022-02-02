package com.example.newtestproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.newtestproject.databinding.FragmentFirstBinding
import com.example.newtestproject.databinding.FragmentSecondBinding

class SecondFragment: Fragment() {

    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater,container,false)
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        binding.btnBack.setOnClickListener {
//        }
        binding.btnNext.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_fragment_third)
        }
        binding.btnBack.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}