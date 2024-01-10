package com.dioageng.tugasbesar.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.dioageng.tugasbesar.HomeBus
import com.dioageng.tugasbesar.HomeHotel
import com.dioageng.tugasbesar.HomePlane
import com.dioageng.tugasbesar.HomeTrain
import com.dioageng.tugasbesar.NotImplemented
import com.dioageng.tugasbesar.R

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        // Find LinearLayout using the inflated view
        val goToHotel = view.findViewById<RelativeLayout>(R.id.home_toHotel)
        goToHotel?.setOnClickListener {
            val intent = Intent(requireActivity(), HomeHotel::class.java)
            startActivity(intent)
        }
        val goToPlane = view.findViewById<RelativeLayout>(R.id.home_toPlane)
        goToPlane?.setOnClickListener {
            val intent = Intent(requireActivity(), HomePlane::class.java)
            startActivity(intent)
        }
        val goToTrain = view.findViewById<RelativeLayout>(R.id.home_toTrain)
        goToTrain?.setOnClickListener {
            val intent = Intent(requireActivity(), HomeTrain::class.java)
            startActivity(intent)
        }
        val goToBus = view.findViewById<RelativeLayout>(R.id.home_toBus)
        goToBus?.setOnClickListener {
            val intent = Intent(requireActivity(), HomeBus::class.java)
            startActivity(intent)
        }

        return view
    }
}
