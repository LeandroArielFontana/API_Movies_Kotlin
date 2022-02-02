package alkemy.movies.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(name = "UserLogin", description = "A userLogin Object")
data class UserLoginDTO (

    val id: Long? = null,
    var username: String,
    var password: String,
    var mail: String,
    var available: Boolean = true

        ){
}