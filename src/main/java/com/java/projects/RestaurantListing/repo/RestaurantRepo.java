package com.java.projects.RestaurantListing.repo;

import com.java.projects.RestaurantListing.Entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant,Integer> {

}
