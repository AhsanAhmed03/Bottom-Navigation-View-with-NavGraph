package com.example.bottomnavigationsheet.navgraph.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationsheet.navgraph.R

class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_settings,container,false)

        val movtofirstFragment: TextView = view.findViewById(R.id.movetofirst_frag)
        val movtoSecondFragment: TextView = view.findViewById(R.id.movetosecond_frag)

        movtoSecondFragment.setOnClickListener {
            findNavController().navigate(R.id.action_settings_fragment_to_personal_fragment)
        }

        movtofirstFragment.setOnClickListener {
            findNavController().navigate(R.id.action_settingsFragment_to_homeFragment)
        }

        return view
    }

}