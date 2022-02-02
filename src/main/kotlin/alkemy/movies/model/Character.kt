package alkemy.movies.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.hibernate.annotations.SQLDelete
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDate
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@SQLDelete(sql="UPDATE Character c SET c.available = false WHERE c.id = ?")
@Table(name="characters", schema = "disney_movies")
class Character (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(nullable = false)
    var name:String,
    var age: Int? = null,
    var weight: Double? = null,
    @Column(nullable = false)
    var story: String,
    @ManyToMany(mappedBy = "associatedCharacters")
    @JsonIgnoreProperties("associatedCharacters")
    var movies: List<Movie>? = null,
    @Column(nullable = false)
    var available: Boolean = true,
    @CreatedDate
    @JsonIgnore
    var creationDate: LocalDate? = null,
    @LastModifiedDate
    @JsonIgnore
    var modifiedDate: LocalDate? = null

        ) {

}