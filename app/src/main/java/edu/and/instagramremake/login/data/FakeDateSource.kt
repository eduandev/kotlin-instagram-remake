package edu.and.instagramremake.login.data

import android.os.Handler
import android.os.Looper
import edu.and.instagramremake.common.model.DataBase

class FakeDateSource : LoginDataSource {

    override fun login(email: String, password: String, callBack: LoginCallBack) {
        Handler(Looper.getMainLooper()).postDelayed({

            val userAuth = DataBase.userAuth.firstOrNull {email == it.email}

            when {
                userAuth == null -> {
                    callBack.onFailure("Usuario não encontrado")
                }
                userAuth.password != password -> {
                    callBack.onFailure("Senha está incorreta")
                }
                else -> {
                    DataBase.sessionAuth = userAuth
                    callBack.onSuccess(userAuth)
                }
            }
            callBack.onComplete()
        },2000)

    }
}