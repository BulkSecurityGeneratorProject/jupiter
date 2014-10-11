package com.jupiter.application.repository;

import com.jupiter.application.domain.Cab;
import com.jupiter.application.domain.User;
import com.jupiter.application.web.rest.dto.CabDTO;

import org.springframework.data.geo.Circle;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Spring Data MongoDB repository for the Cab entity.
 */
public interface CabRepository extends MongoRepository<Cab, Long> {

    @Query(value="{ 'id' : ?0 }", fields="{ 'latitude' : 1, 'longitude' : 1}")
    Cab findById(Long id);



}