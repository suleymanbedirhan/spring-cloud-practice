package com.suleyman.business.reservation;

import com.suleyman.business.reservation.client.CarService;
import com.suleyman.business.reservation.domain.Car;
import com.suleyman.business.reservation.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping(value = "/cars")
    public List<Car> getAllCars() {
        return this.reservationService.findAll();
    }

//    @GetMapping(value = "/cars")
//    public List<Car> getAllCars() {
//        return this.carService.findAll();
//    }

}
