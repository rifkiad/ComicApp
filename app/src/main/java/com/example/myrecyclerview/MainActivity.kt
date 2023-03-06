package com.example.myrecyclerview

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvComic: RecyclerView
    private var list: ArrayList<Comic> = arrayListOf()
    private lateinit var toolbar: Toolbar

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title

        rvComic = findViewById(R.id.rv_heroes)
        rvComic.setHasFixedSize(true)

        list.addAll(ComicData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList() {
        rvComic.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListComicsAdapter(list)
        rvComic.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : ListComicsAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Comic) {
                showSelectedComic(data)
            }
        })
    }

    private fun showSelectedComic(data: Comic) {
        Toast.makeText(this, "Kamu memilih " + data.title_comic, Toast.LENGTH_SHORT).show()
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("TITLE", data.title_comic)
        intent.putExtra("PICTURE", data.picture_comic)
        intent.putExtra("SINOPSIS", data.sinopsis_comic)
        intent.putExtra("TANGGAL", data.tanggal_rilis)
        intent.putExtra("GENRE", data.genre_comic)
        startActivity(intent)
    }


    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_profil -> {

                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)

            }
        }
    }
}