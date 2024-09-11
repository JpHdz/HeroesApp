package com.example.heroesapp.activities

import android.graphics.Color
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesapp.R
import com.example.heroesapp.models.Hero
import com.squareup.picasso.Picasso

class HeroDetailActivity : AppCompatActivity() {
    lateinit var heroTextView : TextView
    lateinit var heroDescription: TextView
    lateinit var heroImage: ImageView
    lateinit var constrainL: ConstraintLayout
    lateinit var publisherTextView: TextView
    lateinit var backgroundImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//       Enlazamos nuestras views con variables
        setContentView(R.layout.activity_hero_detail)
        heroTextView = findViewById(R.id.hero_name)
        heroDescription = findViewById(R.id.hero_description)
        heroImage = findViewById(R.id.hero_image)
        constrainL = findViewById(R.id.main)
        publisherTextView = findViewById(R.id.publisher_name)
        backgroundImage = findViewById(R.id.background_image)
        val heroId = intent.getIntExtra("heroId",0)
//        Se obtiene el heroe actual con el id pasado como extra
        val hero = Hero.heroes.firstOrNull{ hero: Hero ->
            hero.id == heroId
        }
        val publisherId = hero?.publisherId
//      Cargamos informacion y estilos de forma dinamica
        if(publisherId == 1){
//            constrainL.setBackgroundColor(Color.parseColor("#f46f72"))
            heroTextView.setTextColor(Color.parseColor("#f46f72"))
            publisherTextView.setTextColor(Color.parseColor("#f46f72"))
            publisherTextView.text = "MARVEL"
            backgroundImage.setImageResource(R.drawable.marvellayersmobil)
        }else{
//            constrainL.setBackgroundColor(Color.parseColor("#7cbcf4"))
            heroTextView.setTextColor(Color.parseColor("#7cbcf4"))
            publisherTextView.setTextColor(Color.parseColor("#7cbcf4"))
            publisherTextView.text = "DC"
            backgroundImage.setImageResource(R.drawable.dclayersmobil)

        }


        heroTextView.text = hero?.name
        heroDescription.text = hero?.description
        Picasso.get().load(hero?.image).into(heroImage)
    }
}