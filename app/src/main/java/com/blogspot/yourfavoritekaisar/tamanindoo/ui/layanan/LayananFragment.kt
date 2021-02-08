package com.blogspot.yourfavoritekaisar.tamanindoo.ui.layanan

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.blogspot.yourfavoritekaisar.tamanindoo.R
import com.blogspot.yourfavoritekaisar.tamanindoo.ui.generate.GenerateActivity
import com.google.zxing.integration.android.IntentIntegrator

class LayananFragment : Fragment(), View.OnClickListener {

    private lateinit var layananViewModel: LayananViewModel

    companion object {
        lateinit var intentIntegrator: IntentIntegrator
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        layananViewModel = ViewModelProvider(this).get(LayananViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_layanan, container, false)
        layananViewModel.text.observe(viewLifecycleOwner, {
        })
        return root
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_sekali_masuk -> {
                activity?.let{
                    val intent = Intent (it, GenerateActivity::class.java)
                    it.startActivity(intent)
                }
            }
            R.id.btn_malam -> {

            }
        }
    }
}
