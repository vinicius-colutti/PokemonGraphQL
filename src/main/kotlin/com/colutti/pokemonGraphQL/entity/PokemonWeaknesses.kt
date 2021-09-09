package com.colutti.pokemonGraphQL.entity

import javax.persistence.*
import javax.transaction.Transactional

@Entity
@Transactional
data class PokemonWeaknesses(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var weaknesses_id: Long = 0,

        var name: String = "",

        @ManyToMany(mappedBy = "weaknesses")
        var pokemon: List<Pokemon> = mutableListOf()
)