package com.chakir.CarHaven.Repository;

import com.chakir.CarHaven.Entity.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends MongoRepository<Car,String> {
}
