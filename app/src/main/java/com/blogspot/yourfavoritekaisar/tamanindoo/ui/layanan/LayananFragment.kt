package com.blogspot.yourfavoritekaisar.tamanindoo.ui.layanan

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.blogspot.yourfavoritekaisar.tamanindoo.R
import com.blogspot.yourfavoritekaisar.tamanindoo.ui.generate.GenerateActivity
import kotlinx.android.synthetic.main.fragment_layanan.*

class LayananFragment : Fragment(), View.OnClickListener {

    private lateinit var layananViewModel: LayananViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        layananViewModel = ViewModelProvider(this).get(LayananViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_layanan, container, false)
        val btnSekaliMasuk: Button = root.findViewById(R.id.btn_sekali_masuk)
        val btnPenginapan: Button = root.findViewById(R.id.btn_malam)
        btnSekaliMasuk.setOnClickListener(this)
        btnPenginapan.setOnClickListener(this)
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
                activity?.let{
                    val intent = Intent (it, GenerateActivity::class.java)
                    it.startActivity(intent)
                }
            }
        }
    }
}
