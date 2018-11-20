package com.suleyman.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/cars")
public class CarController {

	@Autowired
	private CarRepository carRepository;
	
	@GetMapping(value="/list")
	public List<Car> findAll(){
		return (List<Car>) carRepository.findAll();
	}
	
	@GetMapping(value="/model")
	public Car findByModel(@RequestParam(name="carModel") String model){
		return carRepository.findByModel(model);
	}
}
