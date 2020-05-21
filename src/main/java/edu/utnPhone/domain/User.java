package edu.utnPhone.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class User {
    private Integer id;
    private String name;
    private String lastname;
    private String dni;
    private City city;
    private String username;
    private String password;

}
