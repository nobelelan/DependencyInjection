package com.example.dependencyinjection

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email: String, password: String){
        Log.d(TAG, "saveUser: User saved in DB")
    }
}

//class SQLRepository @Inject constructor(){
//    fun saveUser(email: String, password: String){
//        Log.d(TAG, "saveUser: User saved in DB")
//    }
//}
//
//class FirebaseRepository: UserRepository{
//    override fun saveUser(email: String, password: String) {
//        Log.d(TAG, "saveUser: User saved in Firebase")
//    }
//}