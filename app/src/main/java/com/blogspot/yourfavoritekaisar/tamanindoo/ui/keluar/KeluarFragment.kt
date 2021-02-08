package com.blogspot.yourfavoritekaisar.tamanindoo.ui.keluar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.blogspot.yourfavoritekaisar.tamanindoo.R

class KeluarFragment : Fragment() {

    private lateinit var slideshowViewModel: KeluarViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
                ViewModelProvider(this).get(KeluarViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_keluar, container, false)
        slideshowViewModel.text.observe(viewLifecycleOwner, {
        })
        return root
    }
}