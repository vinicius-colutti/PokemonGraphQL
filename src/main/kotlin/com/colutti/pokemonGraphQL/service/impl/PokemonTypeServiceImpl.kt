package com.colutti.pokemonGraphQL.service.impl

import com.colutti.pokemonGraphQL.dto.PokemonTypeInput
import com.colutti.pokemonGraphQL.entity.PokemonType
import com.colutti.pokemonGraphQL.repository.PokemonTypeRepository
import com.colutti.pokemonGraphQL.service.PokemonTypeService
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PokemonTypeServiceImpl: PokemonTypeService {

    @Autowired
    lateinit var repository: PokemonTypeRepository

    override fun savePokemonType(input: PokemonTypeInput): PokemonType {
        var mapper = ModelMapper()
        var pokemonType = mapper.map(input, PokemonType::class.java)
        return repository.save(pokemonType)
    }

    override fun getPokemonTypeById(type_id: Long): PokemonType {
        return repository.findById(type_id).orElse(null)
    }

    override fun getListOfPokemonType(): List<PokemonType> {
        return repository.findAll()
    }

    override fun deletePokemonTypeById(type_id: Long): Boolean {
        repository.deleteById(type_id)
        return true
    }
}