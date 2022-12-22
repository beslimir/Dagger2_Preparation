package com.beslimir.dagger2_preparation

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component
interface UserComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun firstName(@Named("firstName") firstName: String): Builder

        @BindsInstance
        fun lastName(@Named("lastName") lastName: String): Builder

        @BindsInstance
        fun address(@Named("address") address: String): Builder

        fun build(): UserComponent

    }

}