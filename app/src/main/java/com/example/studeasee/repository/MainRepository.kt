package com.example.studeasee.repository

import com.example.studeasee.firebaseClient.FirebaseClient
import com.example.studeasee.utils.DataModel
import com.google.gson.Gson
import com.example.studeasee.utils.UserStatus
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepository @Inject constructor(
    private val firebaseClient: FirebaseClient,
    private val gson: Gson
){


    fun login(username: String, password: String, isDone: (Boolean, String?) -> Unit) {
        firebaseClient.login(username, password, isDone)
    }

    fun observeUsersStatus(status: (List<Pair<String, String>>) -> Unit) {
        firebaseClient.observeUsersStatus(status)
    }








    interface Listener {
        fun onLatestEventReceived(data: DataModel)
        fun endCall()
    }









    private fun changeMyStatus(status: UserStatus) {
        firebaseClient.changeMyStatus(status)
    }








    fun logOff(function: () -> Unit) = firebaseClient.logOff(function)

}