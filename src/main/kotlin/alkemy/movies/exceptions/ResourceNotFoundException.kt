package alkemy.movies.exceptions

import java.lang.RuntimeException

class ResourceNotFoundException(message: String) : RuntimeException(message)
