/*package edu.utnPhone.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table (name= "bills")


public class Bill {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn (name= "id_phone_line")
    @ManyToOne (fetch = FetchType.EAGER)
    @JsonBackReference
    private PhoneLine phoneLine;

    @JoinColumn (name = "id_user")
    @ManyToOne (fetch = FetchType.EAGER)
    @JsonBackReference
    private User user;

    @Column (name = "number_calls")
    private Long numberCalls;

    @Column (name = "cost_price_x_minute")
    private Double costPriceXminute;

    @Column (name = "total_price")
    private Double totalPrice;

    @Column (name = "billdate")
    @NotNull
    @Temporal(TemporalType.DATE)
    private String date;

    @Column (name = "due_date")
    @Temporal(TemporalType.DATE)
    @NotNull
    private String dueDate;

    @Column(name="status")
    @Enumerated(value = EnumType.STRING)
    private String status;


}*/
