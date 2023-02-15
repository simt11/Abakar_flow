package com.example.abakar_flow.ui.main

import com.example.abakar_flow.R
import kotlinx.android.synthetic.main.fragment_main.createUser

class MainFragment : BaseFragment(R.layout.fragment_main) {

    override fun onStart() {
        super.onStart()
        createUser.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
            ?.replace(R.id.dataContainer, EditFragment())
            ?.addToBackStack(null)
            ?.commit() }
    }

}
