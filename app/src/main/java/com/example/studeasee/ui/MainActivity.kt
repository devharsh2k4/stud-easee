package com.example.studeasee.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.studeasee.R
import com.example.studeasee.databinding.ActivityMainBinding
import com.example.studeasee.ui.fragments.HomeFragment
import com.example.studeasee.ui.fragments.ProfileFragment
import com.example.studeasee.ui.fragments.SplitFragment
import com.example.studeasee.ui.fragments.WishlistFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val firstFragment = HomeFragment()
        val secondFragment = WishlistFragment()
        val thirdFragment = SplitFragment()
        val fourthFragment = ProfileFragment()

        setCurrentFragment(firstFragment)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId)  {
                R.id.miHome -> setCurrentFragment(firstFragment)
                R.id.miCart -> setCurrentFragment(secondFragment)
                R.id.miSplit -> setCurrentFragment(thirdFragment)
                R.id.miPerson -> setCurrentFragment(fourthFragment)
            }
            true
        }




    }

   private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment,fragment)
            commit()
        }
}