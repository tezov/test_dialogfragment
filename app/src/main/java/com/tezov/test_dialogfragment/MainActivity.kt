package com.tezov.test_dialogfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openDialog(v: View?) {
        val ft = supportFragmentManager.beginTransaction()
        val dialog = Dialog()
        ft.add(R.id.fragmentContainer, dialog)
        ft.commit()
    }

    class Dialog : DialogFragment() {
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            return inflater.inflate(R.layout.dialogfragment_main, container, false)
        }
    }
}