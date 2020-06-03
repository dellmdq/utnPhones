/*package edu.utnPhone.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@EqualsAndHashCode
@Table (name = "users")
@DiscriminatorColumn (name = "userType")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)

public abstract class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "user_name")
    @NotNull
    private String name;
    @Column (name = "lastname")
    @NotNull
    private String lastname;
    @Column (name = "dni")
    @NotNull
    private String dni;
    @JoinColumn (name = "id_city")
    @ManyToOne (fetch = FetchType.EAGER)
    @JsonBackReference
    private City city;
    @Column (name = "username")
    @NotNull
    private String username;
    @Column (name ="pass")
    @NotNull
    private String password;



    @OneToMany (mappedBy = "users")
    private List<Bill>bills;

}*/
