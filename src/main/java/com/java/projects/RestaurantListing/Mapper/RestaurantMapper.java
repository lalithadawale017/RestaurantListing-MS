package com.java.projects.RestaurantListing.Mapper;

import com.java.projects.RestaurantListing.DTA.RestaurantDTA;
import com.java.projects.RestaurantListing.Entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface RestaurantMapper {

    RestaurantMapper Instance= Mappers.getMapper(RestaurantMapper.class);

    Restaurant mapRestuarantDTAToRestaurant(RestaurantDTA restaurantDTA);

    RestaurantDTA mapRestuarantToRestaurantDTA(Restaurant restaurantDTA);

}
