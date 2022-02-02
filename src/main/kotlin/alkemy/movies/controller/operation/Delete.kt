package alkemy.movies.controller.operation

import alkemy.movies.util.CompanionLogger
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable

interface Delete <D, E: Any, ID: Any>: APIOperation<D, E, ID> {

    @DeleteMapping("/id")
    @Operation(
        summary = "Deletes an element",
        description = "Deletes an entity given it's identifier"
    )
    fun delete(@PathVariable id: ID) =
        service
            .deleteById(id)

    companion object : CompanionLogger()

}