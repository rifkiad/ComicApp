package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    private  lateinit var tvTitle: TextView
    private lateinit var ivPicture: ImageView
    private lateinit var tvGenre: TextView
    private lateinit var tvTanggal: TextView
    private  lateinit var tvSinopsis: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        tvTitle = findViewById(R.id.title_comic_detail)
        ivPicture = findViewById(R.id.imageView)
        tvGenre = findViewById(R.id.genre_comic_detail)
        tvTanggal = findViewById(R.id.date_comic_detail)
        tvSinopsis = findViewById(R.id.sinopsis_detail_comic)

        tvTitle.text = intent.getStringExtra("TITLE")
        ivPicture.setImageResource(intent.getIntExtra("PICTURE", 0))
        tvGenre.text = intent.getStringExtra("GENRE")
        tvTanggal.text = intent.getStringExtra("TANGGAL")
        tvSinopsis.text = intent.getStringExtra("SINOPSIS")

        supportActionBar?.title = tvTitle.text

    }
}