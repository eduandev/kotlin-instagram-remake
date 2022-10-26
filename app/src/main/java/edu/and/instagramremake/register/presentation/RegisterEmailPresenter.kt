package edu.and.instagramremake.register.presentation

import android.util.Patterns
import edu.and.instagramremake.R
import edu.and.instagramremake.common.model.UserAuth
import edu.and.instagramremake.login.Login
import edu.and.instagramremake.login.data.LoginCallBack
import edu.and.instagramremake.login.data.LoginRepository
import edu.and.instagramremake.register.RegisterEmail
import edu.and.instagramremake.register.data.RegisterEmailCallBack
import edu.and.instagramremake.register.data.RegisterEmailRepository

class RegisterEmailPresenter(private var view: RegisterEmail.View?,
                             private val repository: RegisterEmailRepository) : RegisterEmail.Presenter {

    override fun create(email: String) {

        val isEmailValid = Patterns.EMAIL_ADDRESS.matcher(email).matches()

        if(!isEmailValid) {
            view?.displayEmailFailure(R.string.invalid_email)
        } else {
            view?.displayEmailFailure(null)
        }
        if(isEmailValid) {
            view?.showProgress(true)
            repository.create(email, object: RegisterEmailCallBack {
                override fun onSuccess() {
                    view?.goToNameAndPasswordScreen(email)
                }
                override fun onFailure(message: String) {
                    view?.onEmailFailure(message)
                }
                override fun onComplete() {
                    view?.showProgress(false)
                }
            })

        }
    }

    override fun onDestroy() {
        view = null
    }

}