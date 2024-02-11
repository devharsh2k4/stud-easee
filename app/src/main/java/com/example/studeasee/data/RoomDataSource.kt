package com.example.studeasee.data

import com.example.studeasee.R
import com.example.studeasee.model.Room

class RoomDataSource {
    fun loadRooms(): List<Room> {
        return listOf(
            Room(
                R.drawable.pgroom1,
                "Harsh Apartments",
                2000
            ),
            Room(
                R.drawable.pgroom2,
                "Rishabh Apartments",
                5000
            ),
            Room(
                R.drawable.pgroom3,
                "Abhishek Apartments",
                6000
            ),
            Room(
                R.drawable.pgroom4,
                "Raj Apartments",
                8000
            ),
            Room(
                R.drawable.pgroom5,
                "Gujrat Apartments",
                9000
            ),
            Room(
                R.drawable.pgroom6,
                "Zoro Apartments",
                6000
            ),
            Room(
                R.drawable.pgroom8,
                "Fuji Apartments",
                8000
            ),
            Room(
                R.drawable.pgroom7,
                "Raju Apartments",
                9000
            ),

            )
    }
}