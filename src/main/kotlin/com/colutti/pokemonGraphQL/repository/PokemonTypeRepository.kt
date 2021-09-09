package com.colutti.pokemonGraphQL.repository

import com.colutti.pokemonGraphQL.entity.PokemonType
import org.springframework.data.jpa.repository.JpaRepository

interface PokemonTypeRepository: JpaRepository<PokemonType, Long> {
}