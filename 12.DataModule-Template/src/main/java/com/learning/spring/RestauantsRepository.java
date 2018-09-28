package com.learning.spring;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
//pageable is datadomain

public interface RestauantsRepository extends MongoRepository<Restaurants,String>{
List<Restaurants> findByCuisine(String cuisine, Pageable p);

List<Restaurants> findByBorough(String borough, Pageable p);

List<Restaurants> findByName(String name, Pageable p);

List<Restaurants> findByAddressZipcode(String zipcode, Pageable p);

List<Restaurants> findBySimpleId(int simpleId, Pageable p);
}
