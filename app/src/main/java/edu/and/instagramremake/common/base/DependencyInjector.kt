package edu.and.instagramremake.common.base

import edu.and.instagramremake.login.data.FakeDateSource
import edu.and.instagramremake.login.data.LoginRepository

object DependencyInjector {

    fun loginRepository() : LoginRepository {
        return LoginRepository(FakeDateSource())
    }
}