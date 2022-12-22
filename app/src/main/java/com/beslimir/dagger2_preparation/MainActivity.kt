package com.beslimir.dagger2_preparation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.beslimir.dagger2_preparation.User.Companion.TAG
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userComponent = DaggerUserComponent.builder()
            .firstName("First")
            .lastName("Last")
            .address("Address")
            .build()
        userComponent.inject(this)
        user.show()

        Log.d(TAG, "First name: ${user.firstName}\n" +
                "Last name: ${user.lastName}\n" +
                "Address: ${user.address}"
        )
    }
}