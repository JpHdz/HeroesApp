package com.example.heroesapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.adapters.PublisherAdapter
import com.example.heroesapp.models.Publisher
import com.example.heroesapp.models.User

class PublisherActivity : AppCompatActivity() {
    lateinit var usernameTV: TextView
    lateinit var logoutBtn: ImageView
    lateinit var publisherRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_publisher)
//        De aqui obtendremos nuestras propiedades almacenadas mas tarde
        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
//        Enlazamos variables con views
        usernameTV = findViewById(R.id.usernameTV)
        logoutBtn = findViewById(R.id.logoutBtn)
        publisherRecyclerView = findViewById(R.id.publishers_recyclerview)
//        publisherRecyclerView.adapter = PublisherAdapter(Publisher.publishers)
        publisherRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//            Nuestro recyclerview almacena cards de heroes
        publisherRecyclerView.adapter = PublisherAdapter(Publisher.publishers){ publisher ->
            Log.i("Publisher from Publisher Activity",publisher.name)
            val intent = Intent(this@PublisherActivity, HeroesActivity::class.java)
//            Agrega la propiedad id la cual sera utilizada para filtrar heroes por su publisher
            intent.putExtra("publisherId", publisher.id)
            startActivity(intent)

        }
//        A partir del email vamos a encontrar el usuario actual
        val email = intent.getStringExtra("userEmail")
        val user = User.users.firstOrNull{ user: User ->
            user.email == email

        }
        usernameTV.text = user?.name
//        Se elimina la propiedad isLogged de cache
        logoutBtn.setOnClickListener{
            Log.i("LOGOUT","Cerrando Sesion")
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@PublisherActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}