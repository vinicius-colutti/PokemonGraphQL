package com.colutti.pokemonGraphQL.service.impl

import com.colutti.pokemonGraphQL.converter.PokemonConverter
import com.colutti.pokemonGraphQL.dto.PokemonInput
import com.colutti.pokemonGraphQL.entity.Pokemon
import com.colutti.pokemonGraphQL.repository.PokemonRepository
import com.colutti.pokemonGraphQL.service.PokemonCategoryService
import com.colutti.pokemonGraphQL.service.PokemonService
import com.colutti.pokemonGraphQL.service.PokemonTypeService
import com.colutti.pokemonGraphQL.service.PokemonWeaknessesService
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PokemonServiceImpl: PokemonService {

    @Autowired
    lateinit var repository: PokemonRepository
    @Autowired
    lateinit var categoryService: PokemonCategoryService
    @Autowired
    lateinit var typeService: PokemonTypeService
    @Autowired
    lateinit var weaknessesService: PokemonWeaknessesService
    @Autowired
    lateinit var pokemonConverter: PokemonConverter

    override fun savePokemon(input: PokemonInput): Pokemon {
        var pokemon = pokemonConverter.pokemonInputToPokemon(input)
        pokemon.category =
                categoryService.
                getPokemonCategoryById(input.category_id)
        pokemon.types = input.types_ids.map {
            typeService.getPokemonTypeById(it)
        }
        pokemon.weaknesses = input.weaknesses_ids.map{
            weaknessesService.getPokemonWeaknessesById(it)
        }
        return repository.save(pokemon)
    }

    override fun getPokemonById(pokemon_id: Long): Pokemon {
        return repository.findById(pokemon_id).orElse(null)
    }

    override fun getListOfPokemon(): List<Pokemon> {
        return repository.findAll()
    }

    override fun deletePokemonById(pokemon_id: Long): Boolean {
        repository.deleteById(pokemon_id)
        return true
    }
}