package com.colutti.pokemonGraphQL.service.impl

import com.colutti.pokemonGraphQL.dto.PokemonCategoryInput
import com.colutti.pokemonGraphQL.entity.PokemonCategory
import com.colutti.pokemonGraphQL.repository.PokemonCategoryRepository
import com.colutti.pokemonGraphQL.service.PokemonCategoryService
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PokemonCategoryServiceImpl: PokemonCategoryService {

    @Autowired
    lateinit var repository: PokemonCategoryRepository

    override fun savePokemonCategory(input: PokemonCategoryInput):
            PokemonCategory {
        var mapper = ModelMapper()
        var pokemonCategory = mapper.map(input, PokemonCategory::class.java)
        return repository.save(pokemonCategory)
    }

    override fun getPokemonCategoryById(category_id: Long): PokemonCategory {
        return repository.findById(category_id).orElse(null)
    }

    override fun getListOfPokemonCategory(): List<PokemonCategory> {
        return repository.findAll()
    }

    override fun deletePokemonCategoryById(category_id: Long): Boolean {
        repository.deleteById(category_id)
        return true
    }
}