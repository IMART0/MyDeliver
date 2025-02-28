package am.martirosyan.mydeliver.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "phone_number")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "firebase_token")
    private String firebaseToken;

    @Column(name = "points")
    private Integer points;

    @Column(name = "is_deleted")
    private Boolean deleted;

    @OneToMany()
    @JoinColumn(name = "user_id")
    private Set<Order> orders;
}
