package com.example.android.gurbaninitnem.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.android.gurbaninitnem.R
import kotlinx.android.synthetic.main.fragment_on_boarding.*


class OnBoardingFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_boarding, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        handleClicks()
    }

   private fun handleClicks() {
       next_button.setOnClickListener {
           val fr = getFragmentManager()?.beginTransaction()
           fr?.replace(R.id.container, MainPage())
           fr?.addToBackStack("onBoarding")
           fr?.commit()
       }
   }

}