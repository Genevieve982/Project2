package com.example.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="users")
public class Consumer {

    @Id
    @GeneratedValue
    private int id;
    private String consumerFullName;
    private String consumerAddress;
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;
    private String username;
    private String password;

}
