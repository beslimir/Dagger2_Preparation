package com.beslimir.dagger2_preparation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userComponent: UserComponent = DaggerUserComponent.create()
        userComponent.inject(this)

        user.show()
    }
}