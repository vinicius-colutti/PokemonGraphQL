package com.colutti.pokemonGraphQL.dto

data class PokemonCategoryInput(
        var category_id: Long = 0,
        var name: String = "",
)