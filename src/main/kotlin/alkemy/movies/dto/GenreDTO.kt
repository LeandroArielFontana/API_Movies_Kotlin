package alkemy.movies.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(name = "Genre", description = "A Genre Object")
data class GenreDTO (

    val id: Long? = null,
    var title: String = "",
    var associatedMovies: List<MovieDTO>? = null,
    var available: Boolean = true,

        ){
}