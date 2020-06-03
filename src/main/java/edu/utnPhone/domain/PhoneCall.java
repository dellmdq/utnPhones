/*package edu.utnPhone.domain;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table (name = "phoneCalls")
public class PhoneCall {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    //consultar que annotation debo poner en este caso
    private PhoneLine phoneLineFrom;
    private PhoneLine phoneLineTo;
    private City CityFrom;
    private City CityTo;
    private Bill bill;
    private Integer duration;
    private double priceXminute;
    private double totalPrice;


}*/
