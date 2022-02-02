package alkemy.movies.service

import alkemy.movies.dto.UserLoginDTO
import alkemy.movies.mapper.UserLoginMapper
import alkemy.movies.model.UserLogin
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service

@Service("userLoginService")
class UserLoginService (

    repository: JpaRepository<UserLogin, Long>,
    mapper: UserLoginMapper

    ) : AbstractService<UserLoginDTO, UserLogin, Long> (repository, mapper) {
}