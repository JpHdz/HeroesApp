package com.example.heroesapp.models

data class User(val name:String,val email:String,val password: String){
    val computedName :String get() = "Hola, $name"
    companion object{
        val users = listOf(
            User("Roger Federer","rf@gmail.com","12345"),
            User("Rafa Nadal","rn@gmail.com","12345"),
            User("Novak Djokovic","nd@gmail.com","12345")
        )
    }
}
