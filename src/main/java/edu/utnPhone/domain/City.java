package edu.utnPhone.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
    private Integer id;
    private String name;
    private Province province;
    private Integer areaCode;
}
