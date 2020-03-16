package com.smx.tasks.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smx.tasks.model.Vehicle;
import com.smx.tasks.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	  private VehicleRepository vehicleRepository;

	
	@Override
	public String createVehicle(Vehicle vehicle) {
		//vehicleRepository.save(vehicle);
		return UUID.randomUUID().toString();
	}

}
