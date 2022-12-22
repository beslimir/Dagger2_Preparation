package com.beslimir.dagger2_preparation

import android.util.Log
import com.beslimir.dagger2_preparation.User.Companion.TAG
import javax.inject.Inject

class Address @Inject constructor() {

    init {
        Log.d(TAG, "Address class instantiated.")
    }

}