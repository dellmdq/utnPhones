/*package edu.utnPhone.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "cities")
public class City {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "city_name")
    @NotNull
    private String name;

    @Column (name = "area_code", unique = true)
    @NotNull
      private Integer areaCode;

    @JoinColumn (name= "id_province")
    @ManyToOne (fetch = FetchType.EAGER)
    @JsonBackReference
    private Province province;
}*/
