package alkemy.movies.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.SQLDelete
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDate
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@SQLDelete(sql="UPDATE UserLogin u SET u.available = false WHERE u.id = ?")
@Table(name = "characters", schema = "disney_movies")
class UserLogin (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(nullable = false)
    var username: String,
    @Column(nullable = false)
    var password: String,
    @Column(nullable = false)
    var mail: String,
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