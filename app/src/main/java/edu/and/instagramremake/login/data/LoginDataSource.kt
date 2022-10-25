package edu.and.instagramremake.login.data

interface LoginDataSource {

    fun login(email: String, password: String, callBack: LoginCallBack)
}