package com.example.heroesapp.activities

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesapp.R
import com.example.heroesapp.models.User
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var emailEditText: EditText
    lateinit var passwordEditText: EditText
    lateinit var loginBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        Obtenemos datos almacenados en cache
        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
        val isLogged = sharedPreferences.getBoolean("isLogged",false)
//        Si se valida que la propiedad isLogged estaba en cache vamos directamente a publishers y nos saltamos el login
        if(isLogged){
            val intent = Intent(this@MainActivity,PublisherActivity::class.java)
            val storedMail = sharedPreferences.getString("user","def")
            intent.putExtra("userEmail",storedMail)
            startActivity(intent)
            finish()
        }
//        Enlazamos variables con views
        emailEditText = findViewById(R.id.emailET)
        passwordEditText = findViewById(R.id.passwordET)
        loginBtn = findViewById(R.id.btnLogin)
        loginBtn.setOnClickListener{ v ->
//            Se obtienen los datos de nuestros inputs cuando se aprieta el boton
            Log.i("AndroidLogHeroes", "Iniciando Sesion")
            var email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            Log.i("Email",email)
            Log.i("Password",password)
//            Si alguno de los dos campos esta vacio retornamos
            if(email.isEmpty() || password.isEmpty()){
                Log.i("LOGIN_ERROR", "Los dos campos son obligatorios")
                Snackbar.make(v,"Los dos campos son obligatorios",Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }
//            Comprobamos si hay un usuario con datos correspondientes en nuestra lista de usuarios
            var isValidUser = User.users.any{
                user -> user.email == email && user.password == password
            }
//            Si no son validos se retorna
            if(!isValidUser){
                Log.i("LOGIN_ERROR", "Email o password son invalidos")
                Snackbar.make(v, "El correro electronico o la contraseña son invalidos", Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }
//            Si todo esta bien almacenamos variables en cache y continuamos a la siguiente pagina
            Log.i("LOGIN_SUCCESFUL", "Inicio de sesion correcto")
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged",true)
            editor.putString("user",email)
            editor.apply()
            val intent = Intent(this@MainActivity, PublisherActivity::class.java)
            intent.putExtra("userEmail",email)
            startActivity(intent)
            finish()
        }
    }
}