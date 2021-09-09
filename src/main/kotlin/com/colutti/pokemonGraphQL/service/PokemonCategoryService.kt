package com.colutti.pokemonGraphQL.service

import com.colutti.pokemonGraphQL.dto.PokemonCategoryInput
import com.colutti.pokemonGraphQL.entity.PokemonCategory

interface PokemonCategoryService {

    fun savePokemonCategory(input: PokemonCategoryInput): PokemonCategory
    fun getPokemonCategoryById(category_id: Long): PokemonCategory
    fun getListOfPokemonCategory(): List<PokemonCategory>
    fun deletePokemonCategoryById(category_id: Long): Boolean

}