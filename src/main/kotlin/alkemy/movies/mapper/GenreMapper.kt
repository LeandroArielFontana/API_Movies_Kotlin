package alkemy.movies.mapper

import alkemy.movies.dto.GenreDTO
import alkemy.movies.model.Genre
import org.springframework.stereotype.Component

@Component("genreMapper")
class GenreMapper : AbstractMapper <GenreDTO, Genre> {

    override fun toEntity(dto: GenreDTO) =
        Genre(
            id = dto.id,
            title = dto.title,
            associatedMovies = null,
            available = dto.available
        )

    override fun toDto(entity: Genre) =
        GenreDTO(
            id = entity.id,
            title = entity.title,
            associatedMovies = null,
            available = entity.available
        )
}