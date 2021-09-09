package com.colutti.pokemonGraphQL.service

import com.colutti.pokemonGraphQL.dto.PokemonInput
import com.colutti.pokemonGraphQL.entity.Pokemon

interface PokemonService {

    fun savePokemon(input: PokemonInput): Pokemon
    fun getPokemonById(pokemon_id: Long): Pokemon
    fun getListOfPokemon(): List<Pokemon>
    fun deletePokemonById(pokemon_id: Long): Boolean

}