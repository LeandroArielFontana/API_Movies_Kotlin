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
@SQLDelete(sql = "UPDATE Movie m SET m.available = false WHERE m.id = ?")
@Table(name = "movies", schema = "disney_movies")
class Movie(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(nullable = false)
    var titleMovie: String = "",
    @Column(nullable = false)
    var releaseDate: LocalDate = LocalDate.now(),
    @Column(nullable = false)
    var scoreMovie: Int = 0,
    @JoinTable(
        name = "movies_characters",
        joinColumns = [JoinColumn(name = "FK_MOVIE")],
        inverseJoinColumns = [JoinColumn(name = "FK_CHARACTERS")]
    )
    @ManyToMany(cascade = arrayOf(CascadeType.ALL))
    var associatedCharacters: List<Character>? = null,
    @Column(nullable = false)
    var available: Boolean = true,
    @ManyToOne
    @JoinColumn
    var genre: Genre? = Genre(),
    @CreatedDate
    @JsonIgnore
    var creationDate: LocalDate? = null,
    @LastModifiedDate
    @JsonIgnore
    var modifiedDate: LocalDate? = null

)
