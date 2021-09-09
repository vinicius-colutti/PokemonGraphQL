package com.colutti.pokemonGraphQL.service

import com.colutti.pokemonGraphQL.dto.PokemonWeaknessesInput
import com.colutti.pokemonGraphQL.entity.PokemonWeaknesses

interface PokemonWeaknessesService {

    fun savePokemonWeaknesses(input: PokemonWeaknessesInput): PokemonWeaknesses
    fun getPokemonWeaknessesById(weaknesses_id: Long): PokemonWeaknesses
    fun getListOfPokemonType(): List<PokemonWeaknesses>
    fun deletePokemonWeaknessesById(weaknesses_id: Long): Boolean

}