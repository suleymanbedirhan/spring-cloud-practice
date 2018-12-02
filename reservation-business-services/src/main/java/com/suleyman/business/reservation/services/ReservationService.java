package com.suleyman.business.reservation.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.suleyman.business.reservation.client.CarService;
import com.suleyman.business.reservation.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private CarService carService;

    @HystrixCommand(fallbackMethod = "defaultCars")
    public List<Car> findAll(){
        return this.carService.findAll();
    }


    public List<Car> defaultCars(){

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Mercedes", "2018"));
        return carList;
    }
}
