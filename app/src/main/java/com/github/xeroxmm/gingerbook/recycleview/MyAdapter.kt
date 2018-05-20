package com.github.xeroxmm.gingerbook.recycleview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.github.xeroxmm.gingerbook.R

class MyAdapter(private val moviesList: List<Movie>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.title) as TextView
        var year: TextView = view.findViewById(R.id.year) as TextView
        var genre: TextView = view.findViewById(R.id.genre) as TextView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.movie_list_row, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = moviesList[position]
        holder.title.text = movie.title
        holder.genre.text = movie.genre
        holder.year.text = movie.year
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }
}