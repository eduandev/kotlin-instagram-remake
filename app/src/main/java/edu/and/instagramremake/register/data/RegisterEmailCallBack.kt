package edu.and.instagramremake.register.data

interface RegisterEmailCallBack {

    fun onSuccess()
    fun onFailure(message: String)
    fun onComplete()
}