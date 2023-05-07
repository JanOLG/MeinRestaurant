package com.example.meinrestaurant


data class Restaurant(val id: Int, val title: String, val description:String, var isFavorite:Boolean = false)

val dummyListe = listOf(
    Restaurant(0, "Jans Essen", "Bei Jan"),
    Restaurant(1, "Tims Essen", "Bei"),
    Restaurant(2, "Toms Essen", "Bei tgrthrt"),
    Restaurant(3, "Lelelele Essen", "Bei Jantrhrhrth"),
    Restaurant(4, "Jans Essen", "Bei Jan"),
    Restaurant(5, "Tims Essen", "Bei"),
    Restaurant(6, "Toms Essen", "Bei tgrthrt"),
    Restaurant(7, "Lelelele Essen", "Bei Jantrhrhrth"),
    Restaurant(8, "Jans Essen", "Bei Jan"),
    Restaurant(9, "Tims Essen", "Bei"),
    Restaurant(10, "Toms Essen", "Bei tgrthrt"),
    Restaurant(11, "Lelelele Essen", "Bei Jantrhrhrth"),
    Restaurant(12, "HULULULULU Essen", "B")
)