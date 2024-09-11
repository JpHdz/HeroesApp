package com.example.heroesapp.models

data class Publisher(val id: Int, val name:String, val image:String){
    companion object{
        val publishers = mutableListOf<Publisher>(
            Publisher(1,"Marvel", "https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/media/image/2023/02/logo-marvel-comics-2968634.jpg?tf=3840x"),
            Publisher(2,"DC","https://static1.srcdn.com/wordpress/wp-content/uploads/2017/11/DC-Comics-Logo.jpg")
        )
    }
}
