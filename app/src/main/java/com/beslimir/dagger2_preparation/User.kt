package com.beslimir.dagger2_preparation

import android.util.Log
import javax.inject.Inject

class User @Inject constructor() {

    companion object {
        private const val TAG = "User"
    }

    fun show() {
        Log.d(TAG, "Hello, I am an user.")
    }

}