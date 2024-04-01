package com.example.mypokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.mypokedex.pokemonlist.PokemonListScreen
import com.example.mypokedex.ui.theme.MyPokedexTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyPokedexTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screens.PokemonListScreen.route
                ){
                    composable(Screens.PokemonListScreen.route){
                        PokemonListScreen(navController = navController)
                    }
                    composable(Screens.PokemonDetailsScreen.route+"/{dominant_color}/{pokemon_name}",
                        arguments = listOf(
                            navArgument("dominant_color"){
                                type = NavType.IntType
                            },
                            navArgument("pokemon_name"){
                                type = NavType.StringType
                            }
                        )
                    ){
                        val dominantColor = remember {
                            val color = it.arguments?.getInt("dominant_color")
                            color?. let { Color(color) } ?: Color.White
                        }

                        val pokemonName = remember {
                            it.arguments?.getString("pokemon_name")
                        }
                    }
                }
            }
        }
    }
}
