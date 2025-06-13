package com.java.projects.RestaurantListing.DTA;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDTA {
    private int id;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;
}
