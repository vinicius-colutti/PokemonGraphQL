package com.colutti.pokemonGraphQL.repository

import com.colutti.pokemonGraphQL.entity.PokemonWeaknesses
import org.springframework.data.jpa.repository.JpaRepository

interface PokemonWeaknessesRepository: JpaRepository<PokemonWeaknesses, Long> {
}