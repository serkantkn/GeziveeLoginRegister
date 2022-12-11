package com.serkantken.loginregister.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.serkantken.loginregister.R
import com.serkantken.loginregister.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(layoutInflater)

        binding.buttonSubmit.setOnClickListener {
            confirmInput()
        }

        return binding.root
    }

    private fun validateEmail(): Boolean {
        val emailInput: String = binding.etEmail.editText?.text.toString().trim()
        return if (emailInput.isEmpty()) {
            binding.etEmail.error = "Geçerli bir e-mail adresi giriniz"
            false
        } else {
            binding.etEmail.error = null
            true
        }
    }

    private fun validatePassword(): Boolean {
        val passwordInput: String = binding.etPassword.editText?.text.toString().trim()
        return if (passwordInput.isEmpty()) {
            binding.etPassword.error = "Parola alanı boş olamaz"
            false
        } else {
            binding.etPassword.error = null
            true
        }
    }

    private fun confirmInput() {
        if (!validateEmail() && !validatePassword()) {
            return
        }

        Toast.makeText(requireContext(), "Kayıt yapıldı", Toast.LENGTH_SHORT).show()
    }
}