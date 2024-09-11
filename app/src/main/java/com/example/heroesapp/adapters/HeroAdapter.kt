package com.example.heroesapp.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesapp.R
import com.example.heroesapp.models.Hero
import com.squareup.picasso.Picasso

class HeroAdapter(val heroList: List<Hero>, val onClick: (Hero) -> Unit): RecyclerView.Adapter<HeroViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
//        Infla nuestro view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.hero_item,parent,false)
        return HeroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroList.count()
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
//        Muestra informacion de forma dinamica
        val hero = heroList[position]
        holder.heroName.text = hero.name
        Picasso.get().load(hero.image).into(holder.heroImage)
        if(hero.publisherId == 1){
            holder.publisherBox.setBackgroundColor(Color.parseColor("#f46f72"))
        }else{
            holder.publisherBox.setBackgroundColor(Color.parseColor("#7cbcf4"))
        }
        holder.itemView.setOnClickListener{
//          Agregamos event listener el cual nos dirigira a nuestra siguiente actividad por medio del id obtenido
            onClick(hero)
        }

    }

}

class HeroViewHolder(view:View): ViewHolder(view){
//    Enlaza variables con view
    val heroImage: ImageView = view.findViewById(R.id.hero_image)
    val heroName: TextView = view.findViewById(R.id.hero_name)
    val publisherBox: LinearLayout = view.findViewById(R.id.box_color)
}