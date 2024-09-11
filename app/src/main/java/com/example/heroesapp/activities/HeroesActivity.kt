package com.example.heroesapp.activities

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.adapters.HeroAdapter
import com.example.heroesapp.models.Hero
import com.example.heroesapp.models.Publisher
import com.google.android.material.snackbar.Snackbar
import com.squareup.picasso.Picasso

class HeroesActivity : AppCompatActivity() {
//    lateinit var publisherTitle: TextView
    lateinit var publisherImage: ImageView
    lateinit var heroRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()




        setContentView(R.layout.activity_heroes)
        heroRecyclerView = findViewById(R.id.heroes_recyclerview)

//        publisherTitle = findViewById(R.id.publisher_name)
        publisherImage = findViewById(R.id.publisher_image)
        val publisherId = intent.getIntExtra("publisherId",0)
        Log.i("HeroesActivity","El Id del publisher es: ${publisherId}")

        val publisher = Publisher.publishers.firstOrNull{ publisher -> publisher.id == publisherId}


        if(publisher?.id == 1){
                Snackbar.make(heroRecyclerView, "Esta bien. Todos cometemos errores de vez en cuando", Snackbar.LENGTH_SHORT).show()
        }else{
            Snackbar.make(heroRecyclerView, "Bieeen. Le sabes DC>Marvel", Snackbar.LENGTH_SHORT).show()
        }

        Log.i("PublisherActivity",publisher.toString())
//        publisherTitle.text = publisher?.name

        Picasso.get().load(publisher?.image).into(publisherImage)
        val heroes = Hero.heroes.filter{ hero -> hero.publisherId == publisherId}

        heroRecyclerView.adapter = HeroAdapter(heroes){ hero ->
            val intent = Intent(this@HeroesActivity, HeroDetailActivity::class.java)
            intent.putExtra("heroId",hero.id)
            startActivity(intent)

        }
        heroRecyclerView.layoutManager = GridLayoutManager(this,2)
    }
}