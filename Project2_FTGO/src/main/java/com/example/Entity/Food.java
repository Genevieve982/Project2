package com.example.Entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="foods")
public class Food {

    private int id;
    @Enumerated(EnumType.STRING)
    private FoodType foodType;
    private String foodName;
    @Enumerated(EnumType.STRING)
    private SizeType sizeType;
    private double price;


}
