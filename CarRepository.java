package com.app.repository;

import com.app.entity.cars.Brand;
import com.app.entity.cars.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("SELECT c FROM Car c " +
            "JOIN c.brand b " +
            "JOIN c.transmission t " +
            "JOIN c.model m " +
            "JOIN c.year y " +
            "WHERE b.name = :details " +
            "OR t.type = :details " +
            "OR m.name = :details " +
            "OR y.year = :details")
    List<Car> searchCar(
            @Param("details") String  details );


//    @Query("SELECT c FROM Car c " +
//           "JOIN FETCH c.brand b " +
//            "JOIN FETCH c.fuelType f " +
//            "JOIN FETCH c.model m " +
//            "JOIN FETCH c.transmission t " +
//            "JOIN FETCH c.year y " +
//            "WHERE c.id IN :carIds")
//    List<Car> findCarsWithAllDetails(@Param("carIds")List<Long>carIds);
}