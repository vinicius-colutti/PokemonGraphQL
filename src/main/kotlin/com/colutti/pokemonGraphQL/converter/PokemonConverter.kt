package com.colutti.pokemonGraphQL.converter

import com.colutti.pokemonGraphQL.dto.PokemonInput
import com.colutti.pokemonGraphQL.entity.Pokemon
import com.colutti.pokemonGraphQL.entity.PokemonCategory
import org.springframework.stereotype.Component
import java.util.*

@Component
class PokemonConverter {

    fun pokemonInputToPokemon(input: PokemonInput): Pokemon{
        return Pokemon(0,input.height,input.weight,
                input.attack,input.defense,PokemonCategory(),
                mutableListOf(),mutableListOf())
    }

}