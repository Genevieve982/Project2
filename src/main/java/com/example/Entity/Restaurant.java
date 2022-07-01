package com.example.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="restaurants")
public class Restaurant {

    @Id
    @GeneratedValue
    private int id;
    private String restName;
    private String restAddress;
    private String menu;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "restaurants_foods",
            joinColumns = @JoinColumn(name = "restaurants_id"),
            inverseJoinColumns = @JoinColumn(name = "foods_id")
    )
    private List<Food> foods = new ArrayList<>();

}
