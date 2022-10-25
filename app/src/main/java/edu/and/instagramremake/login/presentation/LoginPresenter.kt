package edu.and.instagramremake.login.presentation

import android.util.Patterns
import edu.and.instagramremake.R
import edu.and.instagramremake.common.model.UserAuth
import edu.and.instagramremake.login.Login
import edu.and.instagramremake.login.data.LoginCallBack
import edu.and.instagramremake.login.data.LoginRepository

class LoginPresenter(private var view: Login.View?,
                     private val repository: LoginRepository) : Login.Presenter {

    override fun login(email: String, password: String) {

        val isEmailValid = Patterns.EMAIL_ADDRESS.matcher(email).matches()
        val isPasswordValid = password.length <= 8

        if(!isEmailValid) {
            view?.displayEmailFailure(R.string.invalid_email)
        } else {
            view?.displayEmailFailure(null)
        }
        if(!isPasswordValid) {
            view?.displayPasswordFailure(R.string.invalid_password)
        } else {
            view?.displayPasswordFailure(null)
        }
        if(isEmailValid && isPasswordValid) {
            view?.showProgess(true)
            repository.login(email, password, object: LoginCallBack {
                override fun onSuccess(userAuth: UserAuth) {
                    view?.onUserAuthenticated()
                }
                override fun onFailure(message: String) {
                    view?.onUserUnauthorized(message)
                }
                override fun onComplete() {
                    view?.showProgess(false)
                }
            })

        }
    }

    override fun onDestroy() {
        view = null
    }

}