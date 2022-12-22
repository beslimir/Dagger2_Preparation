package com.beslimir.dagger2_preparation

import dagger.Component

@Component
interface UserComponent {

    fun inject(mainActivity: MainActivity)

}