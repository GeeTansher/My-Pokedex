package com.example.mypokedex.repository

import com.example.mypokedex.data.remote.PokeApi
import com.example.mypokedex.data.remote.responses.Pokemon
import com.example.mypokedex.data.remote.responses.PokemonList
import com.example.mypokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
){
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        }
        catch (e: Exception){
            return Resource.Error(e.message.toString())
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(name: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(name)
        }
        catch (E: Exception){
            return Resource.Error(E.message.toString())
        }
        return Resource.Success(response)
    }
}