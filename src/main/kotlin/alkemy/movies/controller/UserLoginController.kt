package alkemy.movies.controller

import alkemy.movies.dto.UserLoginDTO
import alkemy.movies.model.UserLogin
import alkemy.movies.service.UserLoginService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController("userLoginController")
@RequestMapping("userLogin")
@Tag(name = "UserLogin", description = "UserLogin API")
class UserLoginController(service: UserLoginService) :
    CrudController<UserLoginDTO, UserLogin, Long>(service)
