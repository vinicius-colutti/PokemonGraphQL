package com.colutti.pokemonGraphQL.graphql

import com.colutti.pokemonGraphQL.dto.PokemonWeaknessesInput
import com.colutti.pokemonGraphQL.service.PokemonWeaknessesService
import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class PokemonWeaknessesGraphQL: GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    lateinit var service: PokemonWeaknessesService

    fun savePokemonWeaknesses(input:PokemonWeaknessesInput) =
            service.savePokemonWeaknesses(input)

}