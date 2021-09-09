package com.colutti.pokemonGraphQL.scalar

import graphql.Scalars
import org.springframework.stereotype.Component
import graphql.schema.GraphQLScalarType
import org.springframework.context.annotation.Bean


@Component
class LongScalar {

    @Bean
    fun longType(): GraphQLScalarType? {
        return Scalars.GraphQLLong
    }

}