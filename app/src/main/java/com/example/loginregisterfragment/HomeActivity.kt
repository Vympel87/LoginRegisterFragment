package com.example.loginregisterfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.loginregisterfragment.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent =  intent
        val username = intent.getStringExtra("EXT_USERNAME")

        with(binding){
            var usernameShown = "Welcome " + username + "!"
            tvUsername.text = usernameShown
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.action_logout -> {
                val intenttoMainActivity = Intent(this@HomeActivity, MainActivity::class.java)

                startActivity(intenttoMainActivity)
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}