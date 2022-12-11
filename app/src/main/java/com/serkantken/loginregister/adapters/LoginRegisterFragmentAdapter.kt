package com.serkantken.loginregister.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.serkantken.loginregister.fragments.LoginFragment
import com.serkantken.loginregister.fragments.RegisterFragment

class LoginRegisterFragmentAdapter(val fm: FragmentActivity, var totalTabs: Int): FragmentStateAdapter(fm) {

    override fun getItemCount(): Int {
        return totalTabs
    }

    override fun createFragment(position: Int): Fragment {
        return when(position)
        {
            0 -> LoginFragment()
            1 -> RegisterFragment()
            else -> LoginFragment()
        }
    }

}