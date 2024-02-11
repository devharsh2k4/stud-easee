package com.example.studeasee.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.studeasee.R
import com.example.studeasee.adapter.RoomAdapter
import com.example.studeasee.data.RoomDataSource
import com.example.studeasee.databinding.FragmentHomeBinding
import com.example.studeasee.ui.RoomDetailsActivity


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    lateinit var adapter : RoomAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)


        val myDataset = RoomDataSource().loadRooms()
        val recyclerView = binding.roomrview

        adapter = RoomAdapter(this@HomeFragment.requireContext(),myDataset)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter


            adapter.setOnItemClickListener(object : RoomAdapter.OnItemClickListener {
            override fun onItemClick() {

   Intent(this@HomeFragment.requireContext(),RoomDetailsActivity::class.java).also {
       startActivity(it)
   }

            }


        })

        recyclerView.setOnClickListener {
            Intent(this@HomeFragment.requireContext(),RoomDetailsActivity::class.java).also {
                startActivity(it)
            }
        }

        return binding.root


    }



}