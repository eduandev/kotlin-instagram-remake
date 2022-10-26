package edu.and.instagramremake.register.data

import android.os.Handler
import android.os.Looper
import edu.and.instagramremake.common.model.DataBase

class FakeRegisterEmailDateSource : RegisterEmailDataSource {

    override fun create(email: String, callBack: RegisterEmailCallBack) {
        Handler(Looper.getMainLooper()).postDelayed({

            val userAuth = DataBase.userAuth.firstOrNull {email == it.email}

            when {
                userAuth == null -> {
                    callBack.onSuccess()
                }
                else -> {
                    callBack.onFailure("Usuario já cadastrado")
                }
            }
            callBack.onComplete()
        },2000)

    }
}