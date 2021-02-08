package com.blogspot.yourfavoritekaisar.tamanindoo.ui.layanan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.blogspot.yourfavoritekaisar.tamanindoo.R

class LayananFragment : Fragment() {

    private lateinit var layananViewModel: LayananViewModel

    companion object {
        fun newInstance(): Fragment {
            return LayananFragment()
        }
    }


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        layananViewModel =
                ViewModelProvider(this).get(LayananViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_layanan, container, false)
        layananViewModel.text.observe(viewLifecycleOwner, {
        })
        return root
    }
}