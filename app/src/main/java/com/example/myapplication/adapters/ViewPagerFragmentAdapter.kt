package com.example.myapplication.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.fragments.FirstFragment
import com.example.myapplication.fragments.SecondFragment
import com.example.myapplication.fragments.ThirdFragment

class ViewPagerFragmentAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
         return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            else ->  ThirdFragment()
        }

    }
}