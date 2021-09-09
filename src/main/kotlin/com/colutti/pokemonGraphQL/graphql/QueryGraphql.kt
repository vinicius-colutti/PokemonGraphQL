package com.colutti.pokemonGraphQL.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class QueryGraphql: GraphQLQueryResolver {

    fun hello(): String {
        return "Hello GraphQL"
    }

    fun soma(a: Int, b: Int): Int {
        return a + b
    }

}