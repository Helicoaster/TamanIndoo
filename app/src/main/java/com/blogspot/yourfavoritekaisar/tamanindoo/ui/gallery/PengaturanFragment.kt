package com.blogspot.yourfavoritekaisar.tamanindoo.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.blogspot.yourfavoritekaisar.tamanindoo.R

class PengaturanFragment : Fragment() {

    private lateinit var pengaturanViewModel: PengaturanViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        pengaturanViewModel =
                ViewModelProvider(this).get(PengaturanViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_pengaturan, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        pengaturanViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}