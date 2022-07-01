package com.example.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="couriers")
public class Courier {

    private int id;
    private String courierName;
    private String


}
