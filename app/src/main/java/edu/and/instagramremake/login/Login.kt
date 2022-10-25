package edu.and.instagramremake.login

import edu.and.instagramremake.common.base.BasePresenter
import edu.and.instagramremake.common.base.BaseView

interface Login {

    interface Presenter : BasePresenter{
        fun login(email: String, password: String)
    }

    interface View : BaseView<Presenter>{
        fun showProgess(enabled: Boolean)
        fun displayEmailFailure(emailError: Int?)
        fun displayPasswordFailure(passwordError: Int?)
        fun onUserAuthenticated()
        fun onUserUnauthorized(message: String)
    }
}