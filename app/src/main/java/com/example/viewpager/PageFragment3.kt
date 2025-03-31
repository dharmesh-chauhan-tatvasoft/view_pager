package com.example.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class PageFragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val page3RootView = inflater.inflate(R.layout.fragment_page3, container, false)

        val buttonShowAlert = page3RootView.findViewById<Button>(R.id.alertButton)

        buttonShowAlert.setOnClickListener {
            val builder = AlertDialog.Builder(requireContext())
            builder.setTitle(getString(R.string.clicked))
                .setMessage(getString(R.string.button_clicked))
                .setPositiveButton(getString(R.string.ok)) { dialog, _ ->
                    dialog.dismiss()
                }

            builder.create().show()
        }
        return page3RootView
    }
}