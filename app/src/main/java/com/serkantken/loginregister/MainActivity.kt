package com.serkantken.loginregister

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.serkantken.loginregister.adapters.LoginRegisterFragmentAdapter
import com.serkantken.loginregister.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val animalsArray = arrayOf(
            "Giriş Yap",
            "Kayıt OL"
        )

        binding.apply {

            val adapter = LoginRegisterFragmentAdapter(this@MainActivity, animalsArray.size)
            viewPager.adapter = adapter

            tabLayout.tabGravity = TabLayout.GRAVITY_FILL

            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = animalsArray[position]
            }.attach()
        }
    }
}