package edu.utnPhone.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tariff {
    private Integer id;
    private City CityFrom;
    private City CityTo;
    private double priceXminute;
    private double costPriceXminute;
}
