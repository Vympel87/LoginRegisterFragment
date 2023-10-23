package com.example.loginregisterfragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.loginregisterfragment.databinding.FragmentLoginBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    private lateinit var usernameEditText : EditText
    private lateinit var passworEditText: EditText
    private lateinit var loginButton : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root

        usernameEditText = binding.inpUsername
        passworEditText = binding.inpPwd
        loginButton = binding.btnLogin

        loginButton.setOnClickListener{
            val username = usernameEditText.text.toString()
            val password = passworEditText.text.toString()

            val usn_credential = "Rafa"
            val pass_credential = "rahasia"

            if (username == usn_credential && password == pass_credential){
                val intenttoHomeActivity = Intent(context, HomeActivity::class.java)
                intenttoHomeActivity.putExtra("EXT_USERNAME", username)
                startActivity(intenttoHomeActivity)
            } else {
                Toast.makeText(context, "Masukkan Kredensial yang Benar!", Toast.LENGTH_LONG).show()
            }
        }
        return view
    }
}