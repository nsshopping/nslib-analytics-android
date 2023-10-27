package com.pss.securityproject;

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }



    private fun securityCheck(){
        NSSecurityManager.verifySuperUser(this).also {
            if (it.result == false) {
                val errorMessage = it.error?.errorMessage ?: ""

                AlertDialog.Builder(this)
                    .setMessage(errorMessage)
                    .setCancelable(false)
                    .setPositiveButton(android.R.string.ok) { dialog, _ ->
                        dialog.dismiss()
                        finishAffinity()
                        exitProcess(0)
                    }
                    .show()

                return
            }
        }
    }
}