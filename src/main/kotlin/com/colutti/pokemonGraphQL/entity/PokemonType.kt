package com.colutti.pokemonGraphQL.entity

import javax.persistence.*
import javax.transaction.Transactional

@Entity
@Transactional
data class PokemonType(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var type_id: Long = 0,
        var name: String = "",
        @ManyToMany(mappedBy = "types", fetch = FetchType.EAGER)
        var pokemon: List<Pokemon> = mutableListOf()
)