package edu.utnPhone.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneCall {
    private Integer id;
    private PhoneLine phoneLineFrom;
    private PhoneLine phoneLineTo;
    private City CityFrom;
    private City CityTo;
    private Bill bill;
    private Integer duration;
    private double priceXminute;
    private double totalPrice;


}
