package com.ichwan.arch.navigationcomponent.menu

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ichwan.arch.navigationcomponent.R
import com.ichwan.arch.navigationcomponent.appscomponent.ActionActivity
import com.ichwan.arch.navigationcomponent.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment

        binding.txhome.setOnClickListener {
            startActivity(Intent(requireContext(), ActionActivity::class.java))
        }

        return binding.root
    }


}