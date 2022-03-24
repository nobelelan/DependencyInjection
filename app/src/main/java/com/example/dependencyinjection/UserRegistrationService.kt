package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
            private val emailService: EmailService
//    private val notificationService: NotificationService
    ){

    fun registerUser(email: String, password: String){
        userRepository.saveUser(email, password)
        emailService.send(email, "nobelelan@gmail.com", "User Registered")
    }
}