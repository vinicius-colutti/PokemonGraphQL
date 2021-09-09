package com.colutti.pokemonGraphQL.service.impl

import com.colutti.pokemonGraphQL.dto.PokemonWeaknessesInput
import com.colutti.pokemonGraphQL.entity.PokemonWeaknesses
import com.colutti.pokemonGraphQL.repository.PokemonWeaknessesRepository
import com.colutti.pokemonGraphQL.service.PokemonWeaknessesService
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PokemonWeaknessesServiceImpl: PokemonWeaknessesService {

    @Autowired
    lateinit var repository: PokemonWeaknessesRepository

    override fun savePokemonWeaknesses(input: PokemonWeaknessesInput):
            PokemonWeaknesses {
        var mapper = ModelMapper()
        var pokemonWeaknesses = mapper.map(input, PokemonWeaknesses::class.java)
        return repository.save(pokemonWeaknesses)
    }

    override fun getPokemonWeaknessesById(weaknesses_id: Long): PokemonWeaknesses {
        return repository.findById(weaknesses_id).orElse(null)
    }

    override fun getListOfPokemonType(): List<PokemonWeaknesses> {
        return repository.findAll()
    }

    override fun deletePokemonWeaknessesById(weaknesses_id: Long): Boolean {
        repository.deleteById(weaknesses_id)
        return true
    }
}