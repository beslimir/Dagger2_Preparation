package com.beslimir.dagger2_preparation

import android.util.Log

class User() {

    companion object {
        private const val TAG = "User"
    }

    fun show() {
        Log.d(TAG, "Hello, I am an user.")
    }

}