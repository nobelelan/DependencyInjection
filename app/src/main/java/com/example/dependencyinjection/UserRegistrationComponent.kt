package com.example.dependencyinjection

import dagger.Component

@Component
// (modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun userRegistrationService(): UserRegistrationService
//    fun inject(mainActivity: MainActivity)
}