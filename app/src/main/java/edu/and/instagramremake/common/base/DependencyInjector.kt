package edu.and.instagramremake.common.base

import edu.and.instagramremake.login.data.FakeDateSource
import edu.and.instagramremake.login.data.LoginRepository
import edu.and.instagramremake.register.data.FakeRegisterEmailDateSource
import edu.and.instagramremake.register.data.RegisterEmailRepository

object DependencyInjector {

    fun loginRepository() : LoginRepository {
        return LoginRepository(FakeDateSource())
    }

    fun registerEmailRepository() : RegisterEmailRepository {
        return RegisterEmailRepository(FakeRegisterEmailDateSource())
    }
}