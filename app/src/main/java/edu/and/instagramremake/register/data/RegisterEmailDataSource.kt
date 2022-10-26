package edu.and.instagramremake.register.data

interface RegisterEmailDataSource {

    fun create(email: String, callBack: RegisterEmailCallBack) {

    }
}