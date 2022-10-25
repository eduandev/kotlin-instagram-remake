package edu.and.instagramremake.login.data

class LoginRepository(private val dataSource: LoginDataSource) {

    fun login(email: String, password: String, callBack: LoginCallBack) {
        dataSource.login(email, password, callBack)
    }
}