package com.java.projects.RestaurantListing.Mapper;

import com.java.projects.RestaurantListing.DTA.RestaurantDTA;
import com.java.projects.RestaurantListing.Entity.Restaurant;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-27T17:31:33+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.24 (Oracle Corporation)"
)
public class RestaurantMapperImpl implements RestaurantMapper {

    @Override
    public Restaurant mapRestuarantDTAToRestaurant(RestaurantDTA restaurantDTA) {
        if ( restaurantDTA == null ) {
            return null;
        }

        Restaurant restaurant = new Restaurant();

        restaurant.setId( restaurantDTA.getId() );
        restaurant.setName( restaurantDTA.getName() );
        restaurant.setAddress( restaurantDTA.getAddress() );
        restaurant.setCity( restaurantDTA.getCity() );
        restaurant.setRestaurantDescription( restaurantDTA.getRestaurantDescription() );

        return restaurant;
    }

    @Override
    public RestaurantDTA mapRestuarantToRestaurantDTA(Restaurant restaurantDTA) {
        if ( restaurantDTA == null ) {
            return null;
        }

        RestaurantDTA restaurantDTA1 = new RestaurantDTA();

        restaurantDTA1.setId( restaurantDTA.getId() );
        restaurantDTA1.setName( restaurantDTA.getName() );
        restaurantDTA1.setAddress( restaurantDTA.getAddress() );
        restaurantDTA1.setCity( restaurantDTA.getCity() );
        restaurantDTA1.setRestaurantDescription( restaurantDTA.getRestaurantDescription() );

        return restaurantDTA1;
    }
}
