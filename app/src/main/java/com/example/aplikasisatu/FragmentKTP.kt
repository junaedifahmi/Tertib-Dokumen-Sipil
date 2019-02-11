package com.example.aplikasisatu

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import kotlinx.android.synthetic.main.fragment_ktp.*
import kotlinx.android.synthetic.main.fragment_ktp.view.*


class FragmentKTP : Fragment() {
    var jml = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_ktp, container, false)
        listen_ktp(view)
        return view
    }

    companion object {
        fun newInstance() :FragmentKTP{
            return FragmentKTP()
        }
    }

}
