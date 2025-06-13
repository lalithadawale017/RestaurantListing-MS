package com.java.projects.RestaurantListing.Service;

import com.java.projects.RestaurantListing.DTA.RestaurantDTA;
import com.java.projects.RestaurantListing.Entity.Restaurant;
import com.java.projects.RestaurantListing.Mapper.RestaurantMapper;
import com.java.projects.RestaurantListing.Mapper.RestaurantMapperImpl;
import com.java.projects.RestaurantListing.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public List<RestaurantDTA> findAllRestaurant() {
    List<Restaurant> restaurants=restaurantRepo.findAll();
    List<RestaurantDTA> restaurantdtalist=restaurants.stream().map(restaurant -> RestaurantMapper.Instance.mapRestuarantToRestaurantDTA(restaurant)).collect(Collectors.toList());
    return restaurantdtalist;
    }

    public RestaurantDTA addRestaurantInDB(RestaurantDTA restaurantDTA) {
     Restaurant saveRestaurant=restaurantRepo.save(RestaurantMapper.Instance.mapRestuarantDTAToRestaurant(restaurantDTA));
      return  RestaurantMapper.Instance.mapRestuarantToRestaurantDTA(saveRestaurant);

    }

    public ResponseEntity<RestaurantDTA> fetchRestaurantById(Integer id) {
     Optional<Restaurant> restaurant=restaurantRepo.findById(id);

        if(restaurant.isPresent()){
         return new ResponseEntity<>(RestaurantMapper.Instance.mapRestuarantToRestaurantDTA(restaurant.get()),HttpStatus.OK);
     }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

}
