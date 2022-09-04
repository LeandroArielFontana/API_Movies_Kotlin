package alkemy.movies.mapper

import alkemy.movies.dto.MovieDTO
import alkemy.movies.model.Movie
import org.springframework.stereotype.Component

@Component("movieMapper")
class MovieMapper : AbstractMapper<MovieDTO, Movie> {

    override fun toEntity(dto: MovieDTO) =
        Movie(
            id = dto.id,
            titleMovie = dto.titleMovie,
            releaseDate = dto.releaseDate,
            scoreMovie = dto.scoreMovie,
            associatedCharacters = null,
            available = dto.available,
            genre = null
        )

    override fun toDto(entity: Movie) =
        MovieDTO(
            id = entity.id,
            titleMovie = entity.titleMovie,
            releaseDate = entity.releaseDate,
            scoreMovie = entity.scoreMovie,
            associatedCharacters = null,
            available = entity.available,
            genre = null
        )
}
