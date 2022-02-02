package alkemy.movies.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(name = "Character", description = "A Character Object")
data class CharacterDTO(

    val id: Long? = null,
    var name:String,
    var age: Int? = null,
    var weight: Double? = null,
    var story: String,
    var movies: List<MovieDTO>? = null,
    var available: Boolean = true,
    ){
}