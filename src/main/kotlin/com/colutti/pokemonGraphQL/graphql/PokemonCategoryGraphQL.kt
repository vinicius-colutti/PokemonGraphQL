package com.colutti.pokemonGraphQL.graphql

import com.colutti.pokemonGraphQL.dto.PokemonCategoryInput
import com.colutti.pokemonGraphQL.service.PokemonCategoryService
import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class PokemonCategoryGraphQL: GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    lateinit var service: PokemonCategoryService

    fun savePokemonCategory(input: PokemonCategoryInput) =
            service.savePokemonCategory(input)

}