package alkemy.movies.mapper

import alkemy.movies.dto.UserLoginDTO
import alkemy.movies.model.UserLogin
import org.springframework.stereotype.Component

@Component("userLoginMapper")
class UserLoginMapper : AbstractMapper<UserLoginDTO, UserLogin> {

    override fun toEntity(dto: UserLoginDTO) =
        UserLogin(
            id = dto.id,
            username = dto.username,
            password = dto.password,
            mail = dto.mail,
            available = dto.available
        )

    override fun toDto(entity: UserLogin) =
        UserLoginDTO(
            id = entity.id,
            username = entity.username,
            password = entity.password,
            mail = entity.mail,
            available = entity.available
        )
}