package com.beslimir.dagger2_preparation

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class User @Inject constructor(
    val address: Address,
    @Named("firstName") val firstName: String,
    @Named("lastName") val lastName: String
) {

    companion object {
        const val TAG = "Preparation"
    }

    fun show() {
        Log.d(TAG, "Hello, I am an user.")
    }

}