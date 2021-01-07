package com.example.springJpaSP.repo;

import com.example.springJpaSP.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepo extends JpaRepository<Car, Long> {

    @Query(nativeQuery = true, value = "call find_cars_using_make(:make)")
    List<Car> find_cars_using_make(@Param("make") String make);

    @Query(nativeQuery = true, value = "call find_cars_using_year(:year)")
    List<Car> find_cars_using_year(@Param("year") Integer year);

}
