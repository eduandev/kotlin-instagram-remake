package edu.and.instagramremake.login.data

import edu.and.instagramremake.common.model.UserAuth

interface LoginCallBack {

    fun onSuccess(userAuth: UserAuth)
    fun onFailure(message: String)
    fun onComplete()
}