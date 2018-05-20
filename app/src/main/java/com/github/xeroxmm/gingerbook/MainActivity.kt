package com.github.xeroxmm.gingerbook

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.MenuItem
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.Toolbar
import android.view.View
import com.github.xeroxmm.gingerbook.recycleview.Movie
import com.github.xeroxmm.gingerbook.recycleview.MyAdapter



class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private val movieList = ArrayList<Movie>()
    private var recyclerView: RecyclerView? = null
    private var mAdapter: MyAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        recyclerView = findViewById<View>(R.id.recycler_view) as RecyclerView

        mAdapter = MyAdapter(movieList)
        val mLayoutManager = LinearLayoutManager(applicationContext)
        recyclerView!!.layoutManager = mLayoutManager
        recyclerView!!.itemAnimator = DefaultItemAnimator()
        recyclerView!!.adapter = mAdapter

        prepareMovieData()
    }

    private fun prepareMovieData() {
        var movie = Movie("Mad Max: Fury Road", "Action & Adventure", "2015")
        movieList.add(movie)

        movie = Movie("Inside Out", "Animation, Kids & Family", "2015")
        movieList.add(movie)

        movie = Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015")
        movieList.add(movie)

        movie = Movie("Shaun the Sheep", "Animation", "2015")
        movieList.add(movie)

        movie = Movie("The Martian", "Science Fiction & Fantasy", "2015")
        movieList.add(movie)

        movie = Movie("Mission: Impossible Rogue Nation", "Action", "2015")
        movieList.add(movie)

        movie = Movie("Up", "Animation", "2009")
        movieList.add(movie)

        movie = Movie("Star Trek", "Science Fiction", "2009")
        movieList.add(movie)

        movie = Movie("The LEGO Movie", "Animation", "2014")
        movieList.add(movie)

        movie = Movie("Iron Man", "Action & Adventure", "2008")
        movieList.add(movie)

        movie = Movie("Aliens", "Science Fiction", "1986")
        movieList.add(movie)

        movie = Movie("Chicken Run", "Animation", "2000")
        movieList.add(movie)

        movie = Movie("Back to the Future", "Science Fiction", "1985")
        movieList.add(movie)

        movie = Movie("Raiders of the Lost Ark", "Action & Adventure", "1981")
        movieList.add(movie)

        movie = Movie("Goldfinger", "Action & Adventure", "1965")
        movieList.add(movie)

        movie = Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014")
        movieList.add(movie)

        mAdapter!!.notifyDataSetChanged()
    }
}
