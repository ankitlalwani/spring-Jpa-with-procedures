package com.example.springJpaSP.controller;

import com.example.springJpaSP.model.Car;
import com.example.springJpaSP.repo.CarRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class CarController {

    CarRepo carRepo;

    public CarController(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @GetMapping
    public Collection<Car> getAllCarsInfo(){
        return carRepo.findAll();
    }

    /*@GetMapping("/{id}")
    public Car getCarInfo(@PathVariable Long id){
        return carRepo.findById(id).get();
    }*/

    @GetMapping("/{model}")
    public List<Car> getCarsForModel(@PathVariable String model){
        System.out.println(model);
        return carRepo.find_cars_using_make(model);
    }

    @GetMapping("/year/{year}")
    public List<Car> getCarsWithYear(@PathVariable Integer year){
        return carRepo.find_cars_using_year(year);
    }

    @PostMapping
    public ResponseEntity<Car> addCarInfo(@RequestBody Car car ){

        Car result = carRepo.save(car);
        return ResponseEntity.ok().build();
    }

}
