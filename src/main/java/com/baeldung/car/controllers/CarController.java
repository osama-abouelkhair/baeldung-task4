package com.baeldung.car.controllers;

import com.baeldung.car.domain.Car;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("cars")
public class CarController {

    @GetMapping("/{id}")
    public Car get(@PathVariable Integer id) {
        return new Car();
    }

    @GetMapping
    public List<Car> getAll() {
        return Arrays.asList(new Car(), new Car());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car create(@RequestBody Car car) {
        return car;
    }

    @PutMapping
    public Car update(@RequestBody Car car) {
        return car;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete() {

    }

}
