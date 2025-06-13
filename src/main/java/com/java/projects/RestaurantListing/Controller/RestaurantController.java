package com.java.projects.RestaurantListing.Controller;

import com.java.projects.RestaurantListing.DTA.RestaurantDTA;
import com.java.projects.RestaurantListing.Entity.Restaurant;
import com.java.projects.RestaurantListing.Service.RestaurantService;
import com.java.projects.RestaurantListing.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
@CrossOrigin
public class RestaurantController {
  @Autowired
 RestaurantService restaurantService;
  @GetMapping("/fetchAllRestaurant")
  public ResponseEntity<List<RestaurantDTA>> findAllRestaurant(){
   List<RestaurantDTA> restaurantDTAList= restaurantService.findAllRestaurant();

   return new ResponseEntity<>(restaurantDTAList, HttpStatus.OK);
  }
 @PostMapping("/addRestaurant")
 public ResponseEntity<RestaurantDTA> saveRestaurant(@RequestBody RestaurantDTA restaurantDTA){
     RestaurantDTA restaurantAdded=restaurantService.addRestaurantInDB(restaurantDTA);
      return new ResponseEntity<>(restaurantAdded,HttpStatus.CREATED);
 }

@GetMapping("fetchById/{id}")
 public ResponseEntity<RestaurantDTA> findRestaurantById(@PathVariable Integer id){
 return restaurantService.fetchRestaurantById(id);
 }
}



