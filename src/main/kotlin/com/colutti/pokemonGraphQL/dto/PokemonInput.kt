package com.colutti.pokemonGraphQL.dto


data class PokemonInput (
        var pokemon_id: Long = 0,
        var height: Float = 0.0F,
        var weight: Float = 0.0F,
        var attack: Int = 0,
        var defense: Int = 0,
        var category_id: Long,
        var types_ids: List<Long> = mutableListOf(),
        var weaknesses_ids: List<Long> = mutableListOf()
)