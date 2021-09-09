package com.colutti.pokemonGraphQL.repository

import com.colutti.pokemonGraphQL.entity.Pokemon
import org.springframework.data.jpa.repository.JpaRepository

interface PokemonRepository: JpaRepository<Pokemon, Long> {
}