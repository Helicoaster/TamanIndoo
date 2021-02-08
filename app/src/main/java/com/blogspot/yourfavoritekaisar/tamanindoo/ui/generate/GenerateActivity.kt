package com.blogspot.yourfavoritekaisar.tamanindoo.ui.generate

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.blogspot.yourfavoritekaisar.tamanindoo.R
import com.google.zxing.integration.android.IntentIntegrator

class GenerateActivity : AppCompatActivity(), View.OnClickListener  {

    private lateinit var intentIntegrator: IntentIntegrator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generate)
        intentIntegrator = IntentIntegrator(this)

    }

    override fun onClick(v: View?) {
    }

}