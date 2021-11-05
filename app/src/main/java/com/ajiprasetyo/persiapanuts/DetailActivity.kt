package com.ajiprasetyo.persiapanuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.persiapanuts.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Budaya Jawa Tengah"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.slametan))
        textViewNamaDetail.text = intent.getStringExtra("nama")
        textViewlokasiDetail.text = intent.getStringExtra("lokasi")
        textViewKeteDetail.text = intent.getStringExtra("keterangan")

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}