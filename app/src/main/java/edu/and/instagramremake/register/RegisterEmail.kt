package edu.and.instagramremake.register

import androidx.annotation.StringRes
import edu.and.instagramremake.common.base.BasePresenter
import edu.and.instagramremake.common.base.BaseView

interface RegisterEmail {

    interface Presenter : BasePresenter {
        fun create(email: String)
    }

    interface View: BaseView<Presenter> {
        fun showProgress(enabled: Boolean)
        fun displayEmailFailure(@StringRes emailError: Int?)
        fun onEmailFailure(message: String)
        fun goToNameAndPasswordScreen(email: String)
    }
}