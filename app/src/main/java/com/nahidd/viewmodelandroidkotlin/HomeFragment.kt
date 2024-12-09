package com.nahidd.viewmodelandroidkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class HomeFragment : Fragment() {

    private lateinit var btn: Button
    private lateinit var btnOne: Button
    private lateinit var activityViewModel: ActivityViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_home, container, false)

        btn = view.findViewById(R.id.buttonShow)
        btnOne = view.findViewById(R.id.buttonHide)

        btn.setOnClickListener {
            activityViewModel.showView()
        }
        btnOne.setOnClickListener {
            activityViewModel.hideView()
        }
        return view
    }


}