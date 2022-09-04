package alkemy.movies.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.SQLDelete
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDate
import javax.persistence.* // ktlint-disable no-wildcard-imports

@Entity
@EntityListeners(AuditingEntityListener::class)
@SQLDelete(sql = "UPDATE Genre g SET g.available = false WHERE g.id = ?")
class Genre(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(nullable = false)
    var title: String = "",
    @OneToMany(mappedBy = "genre")
    var associatedMovies: List<Movie>? = null,
    @Column(nullable = false)
    var available: Boolean = true,
    @CreatedDate
    @JsonIgnore
    var creationDate: LocalDate = LocalDate.now(),
    @LastModifiedDate
    @JsonIgnore
    var modifiedDate: LocalDate = LocalDate.now()

)
