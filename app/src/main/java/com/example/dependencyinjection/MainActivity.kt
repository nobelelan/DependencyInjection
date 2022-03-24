package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val component = DaggerUserRegistrationComponent.builder().build()
//        component.inject(this)

//        val userRegistrationService = UserRegistrationService()

//        userRegistrationService.registerUser("nnnn@gmail.com", "11111")
    }
}