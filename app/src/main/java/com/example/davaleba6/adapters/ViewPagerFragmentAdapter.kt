package com.example.davaleba6.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.davaleba6.fragments.Fragment_1
import com.example.davaleba6.fragments.Fragment_2
import com.example.davaleba6.fragments.Fragment_3

class ViewPagerFragmentAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> Fragment_1().apply {

            }

            1 -> Fragment_2()
            2 -> Fragment_3()
            else -> Fragment_1()
        }


    }

}