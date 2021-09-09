package com.colutti.pokemonGraphQL.entity

import java.util.*
import javax.persistence.*
import javax.transaction.Transactional

@Entity
@Transactional
data class Pokemon(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var pokemon_id: Long = 0,

        var height: Float = 0.0F,
        var weight: Float = 0.0F,
        var attack: Int = 0,
        var defense: Int = 0,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "category_id", nullable = true)
        var category: PokemonCategory = PokemonCategory(),

        @ManyToMany(cascade = arrayOf(CascadeType.MERGE), fetch = FetchType.LAZY)
        @JoinTable(name = "pokemon_like_type",
                joinColumns = arrayOf(JoinColumn(name = "pokemon_id", referencedColumnName = "pokemon_id")),
                inverseJoinColumns = arrayOf(JoinColumn(name = "type_id", referencedColumnName = "type_id")))
        var types: List<PokemonType> = mutableListOf(),

        @ManyToMany(cascade = arrayOf(CascadeType.MERGE), fetch = FetchType.LAZY)
        @JoinTable(name = "pokemon_like_weaknesses",
                joinColumns = arrayOf(JoinColumn(name = "pokemon_id", referencedColumnName = "pokemon_id")),
                inverseJoinColumns = arrayOf(JoinColumn(name = "weaknesses_id", referencedColumnName = "weaknesses_id")))
        var weaknesses: List<PokemonWeaknesses> = mutableListOf()
)