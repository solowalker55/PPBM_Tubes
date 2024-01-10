package com.dioageng.tugasbesar.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.dioageng.tugasbesar.HomeBus
import com.dioageng.tugasbesar.HomeHotel
import com.dioageng.tugasbesar.HomePlane
import com.dioageng.tugasbesar.HomeTrain
import com.dioageng.tugasbesar.ProductDetail
import com.dioageng.tugasbesar.R

class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        // Find LinearLayout using the inflated view
        val goToProduct1 = view.findViewById<LinearLayout>(R.id.home_hvWidzet1)
        goToProduct1?.setOnClickListener {
            val intent = Intent(requireActivity(), ProductDetail::class.java)
            startActivity(intent)
        }
        val goToProduct2 = view.findViewById<LinearLayout>(R.id.home_hvWidzet2)
        goToProduct2?.setOnClickListener {
            val intent = Intent(requireActivity(), ProductDetail::class.java)
            startActivity(intent)
        }
        val gotoProduct3 = view.findViewById<LinearLayout>(R.id.home_hvWidzet3)
        gotoProduct3?.setOnClickListener {
            val intent = Intent(requireActivity(), ProductDetail::class.java)
            startActivity(intent)
        }
        val gotoProduct4 = view.findViewById<LinearLayout>(R.id.home_hvWidzet4)
        gotoProduct4?.setOnClickListener {
            val intent = Intent(requireActivity(), ProductDetail::class.java)
            startActivity(intent)
        }

        return view
    }
}