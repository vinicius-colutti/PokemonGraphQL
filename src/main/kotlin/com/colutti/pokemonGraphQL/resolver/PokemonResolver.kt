package com.colutti.pokemonGraphQL.resolver

import com.colutti.pokemonGraphQL.dto.PokemonInput
import com.colutti.pokemonGraphQL.entity.Pokemon
import com.colutti.pokemonGraphQL.service.PokemonCategoryService
import com.colutti.pokemonGraphQL.service.PokemonTypeService
import com.colutti.pokemonGraphQL.service.PokemonWeaknessesService
import com.coxautodev.graphql.tools.GraphQLResolver
import org.springframework.beans.factory.annotation.Autowired

class PokemonResolver: GraphQLResolver<Pokemon> {

    @Autowired
    lateinit var typeService: PokemonTypeService
    @Autowired
    lateinit var weaknessesService: PokemonWeaknessesService
    @Autowired
    lateinit var categoryService: PokemonCategoryService

    fun types(input:PokemonInput) =
            input.types_ids.map { typeService.getPokemonTypeById(it) }

    fun weaknesses(input:PokemonInput) =
            input.weaknesses_ids.map {
                weaknessesService.getPokemonWeaknessesById(it) }

    fun category(input:PokemonInput) =
            categoryService.getPokemonCategoryById(input.category_id)
}