package edu.and.instagramremake.register.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import edu.and.instagramremake.R
import edu.and.instagramremake.databinding.FragmentRegisterNamePasswordBinding

class RegisterNamePasswordFragment : Fragment(R.layout.fragment_register_name_password) {

    private var binding: FragmentRegisterNamePasswordBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRegisterNamePasswordBinding.bind(view)
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }

    companion object {
        const val KEY_EMAIL = "key_email"
    }
}