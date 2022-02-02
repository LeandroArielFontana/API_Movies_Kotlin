package alkemy.movies.service

import alkemy.movies.model.Character
import alkemy.movies.dto.CharacterDTO
import alkemy.movies.mapper.CharacterMapper
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service

@Service("characterService")
class CharacterService (

    repository: JpaRepository<Character, Long>,
    mapper: CharacterMapper

    ): AbstractService<CharacterDTO, Character, Long> (repository, mapper) {
}