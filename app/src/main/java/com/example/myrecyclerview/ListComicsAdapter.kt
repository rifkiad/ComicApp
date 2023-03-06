package com.example.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListComicsAdapter(private val listComic : ArrayList<Comic>) : RecyclerView.Adapter<ListComicsAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvComicTitle: TextView = itemView.findViewById(R.id.tv_item_name)
        var ivPhotoComic: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvComicRelease: TextView = itemView.findViewById(R.id.tv_item_rilis)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_comic, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val comic = listComic[position]
        Glide.with(holder.itemView.context)
            .load(comic.picture_comic)
            .apply(RequestOptions().override(55, 55))
            .into(holder.ivPhotoComic)
        holder.tvComicTitle.text = comic.title_comic
        holder.tvComicRelease.text = comic.tanggal_rilis

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listComic[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listComic.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Comic)


    }

}