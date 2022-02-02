package alkemy.movies.mapper

import alkemy.movies.dto.CharacterDTO
import alkemy.movies.model.Character
import org.springframework.stereotype.Component

@Component("characterMapper")
class CharacterMapper : AbstractMapper<CharacterDTO, Character> {

    override fun toEntity(dto: CharacterDTO) =
        Character(
            id = dto.id,
            name = dto.name,
            age = dto.age,
            weight = dto.weight,
            story = dto.story,
            movies = null,
            available = dto.available
        )

    override fun toDto(entity: Character) =
        CharacterDTO(
            id = entity.id,
            name = entity.name,
            age = entity.age,
            weight = entity.weight,
            story = entity.story,
            movies = null,
            available = entity.available
        )

}