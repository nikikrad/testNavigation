package com.example.newtestproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        binding.btnBack.setOnClickListener {
//        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}