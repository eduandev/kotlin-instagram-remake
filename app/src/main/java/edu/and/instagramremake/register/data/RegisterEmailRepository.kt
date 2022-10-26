package edu.and.instagramremake.register.data

class RegisterEmailRepository(private val dataSource: RegisterEmailDataSource) {

    fun create(email: String, callBack: RegisterEmailCallBack) {
        dataSource.create(email, callBack)
    }
}