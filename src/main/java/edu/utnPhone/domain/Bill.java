package edu.utnPhone.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    private Integer id;
    private PhoneLine phoneLine;
    private User user;
    private Integer numberCalls;
    private double costPriceXminute;
    private double totalPrice;
    private String date;
    private String dueDate;
    private String status;
}
