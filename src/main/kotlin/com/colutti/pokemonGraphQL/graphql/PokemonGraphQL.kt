package com.colutti.pokemonGraphQL.graphql

import com.colutti.pokemonGraphQL.dto.PokemonInput
import com.colutti.pokemonGraphQL.service.PokemonService
import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class PokemonGraphQL: GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    lateinit var service: PokemonService

    fun savePokemon(input: PokemonInput)  =
            service.savePokemon(input)

    fun getPokemonById(pokemon_id: Long) =
            service.getPokemonById(pokemon_id)

    fun getListOfPokemon() = service.getListOfPokemon()
}