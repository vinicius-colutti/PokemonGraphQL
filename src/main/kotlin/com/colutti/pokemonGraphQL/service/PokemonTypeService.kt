package com.colutti.pokemonGraphQL.service

import com.colutti.pokemonGraphQL.dto.PokemonTypeInput
import com.colutti.pokemonGraphQL.entity.PokemonType

interface PokemonTypeService {

    fun savePokemonType(input: PokemonTypeInput): PokemonType
    fun getPokemonTypeById(type_id: Long): PokemonType
    fun getListOfPokemonType(): List<PokemonType>
    fun deletePokemonTypeById(type_id: Long): Boolean

}