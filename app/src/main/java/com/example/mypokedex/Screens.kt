package com.example.mypokedex

sealed class Screens(val route: String){
    object PokemonListScreen: Screens("pokemon_list_screen")
    object PokemonDetailsScreen: Screens("pokemon_details_screen")
}
