package com.suleyman.business.reservation.client;

import com.suleyman.business.reservation.domain.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value="CARSERVICES")
public interface CarService
{
    @GetMapping(value="/cars/list")
    List<Car> findAll();
}

