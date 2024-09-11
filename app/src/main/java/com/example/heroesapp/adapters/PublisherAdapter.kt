package com.example.heroesapp.adapters

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesapp.R
import com.example.heroesapp.models.Publisher
import com.squareup.picasso.Picasso

class PublisherAdapter (val publisherList: List<Publisher>,val onClick:(Publisher)->Unit): RecyclerView.Adapter<PublisherViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {
//        Inflamos y displayeamos nuestro view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item, parent,false)
        return PublisherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return publisherList.count()
    }

    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
//        Cargamos nuestra card de forma dinamica
        val publisher = publisherList[position]
        holder.publisherNameTV.text = publisher.name
//      Cargamos imagen
        Picasso.get().load(publisher.image).into(holder.publisherImage)
//        Agregamos event listener el cual nos dirigira a nuestra siguiente actividad por medio del id obtenido
        holder.itemView.setOnClickListener{
            Log.i("PublisherAdapter", "Presionaste el publisher: ${publisher.name}")
            onClick(publisher)
        }
    }
}


class PublisherViewHolder(val view: View): ViewHolder(view){
//    Enlaza variables con view
    val publisherNameTV : TextView = view.findViewById(R.id.publisher_name)
    val publisherImage: ImageView = view.findViewById(R.id.publisher_image)

}