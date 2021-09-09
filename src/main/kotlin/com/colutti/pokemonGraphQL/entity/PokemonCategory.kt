package com.colutti.pokemonGraphQL.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.transaction.Transactional

@Entity
@Transactional
data class PokemonCategory(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var category_id: Long = 0,

        var name: String = "",
)