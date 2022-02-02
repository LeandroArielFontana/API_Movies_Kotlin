package alkemy.movies.dto

import alkemy.movies.model.Genre
import io.swagger.v3.oas.annotations.media.Schema
import java.time.LocalDate

@Schema(name = "Movie", description = "A Movie Object")
data class MovieDTO(

    val id: Long? = null,
    var titleMovie: String = "",
    var releaseDate: LocalDate = LocalDate.now(),
    var scoreMovie: Int = 0,
    var associatedCharacters: List<CharacterDTO>? = null,
    var available: Boolean = true,
    var genre: Genre? = Genre()

        ){
}