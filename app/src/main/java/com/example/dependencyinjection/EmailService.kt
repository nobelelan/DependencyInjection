package com.example.dependencyinjection

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

//interface NotificationService{
//    fun send(to:String, from: String, body: String?)
//}

class EmailService @Inject constructor(){
    fun send(to:String, from: String, body: String?){
        Log.d(TAG, "send: Email sent")
    }
}

//class MessageService: NotificationService{
//    override fun send(to: String, from: String, body: String?) {
//        Log.d(TAG, "send: Message Sent")
//    }
//}