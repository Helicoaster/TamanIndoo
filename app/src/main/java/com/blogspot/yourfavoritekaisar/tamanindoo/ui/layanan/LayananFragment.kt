package com.blogspot.yourfavoritekaisar.tamanindoo.ui.layanan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.blogspot.yourfavoritekaisar.tamanindoo.R

class LayananFragment : Fragment(), View.OnClickListener {

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
        return inflater.inflate(R.layout.fragment_layanan, container, false)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_sekali_masuk -> {

            }
            R.id.btn_malam -> {

            }
        }
    }
}
