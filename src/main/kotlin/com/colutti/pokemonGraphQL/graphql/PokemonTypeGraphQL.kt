package com.colutti.pokemonGraphQL.graphql

import com.colutti.pokemonGraphQL.dto.PokemonTypeInput
import com.colutti.pokemonGraphQL.service.PokemonTypeService
import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class PokemonTypeGraphQL: GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    lateinit var service: PokemonTypeService

    fun savePokemonType(input: PokemonTypeInput) =
            service.savePokemonType(input)

}