package com.colutti.pokemonGraphQL.repository

import com.colutti.pokemonGraphQL.entity.PokemonCategory
import org.springframework.data.jpa.repository.JpaRepository

interface PokemonCategoryRepository: JpaRepository<PokemonCategory, Long> {
}