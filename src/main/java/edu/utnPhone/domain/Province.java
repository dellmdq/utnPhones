package edu.utnPhone.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@EqualsAndHashCode
@Table (name = "provinces")

public class Province {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long province;

    @Column (name = "province_name")
    @NotNull
    private String name;
}
