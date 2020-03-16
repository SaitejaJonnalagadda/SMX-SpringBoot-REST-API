

package com.smx.tasks.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smx.tasks.exception.ErrorResponse;
import com.smx.tasks.model.Vehicle;
import com.smx.tasks.response.OuputResponse;
import com.smx.tasks.service.VehicleService;


@RestController
@RequestMapping("/vehicle-api/v1/vehicles")
public class VehicleController {
	
	Logger logger = LoggerFactory.getLogger(VehicleController.class);

  @Autowired
  private VehicleService vehicleService;


  @PostMapping("/vehicle")
  public ResponseEntity<?> createUser(@Valid @RequestBody Vehicle vehicleDetails) {
	  if(!vehicleDetails.getTransmissionType().equalsIgnoreCase("MANUAL") && !vehicleDetails.getTransmissionType().equalsIgnoreCase("AUTO")) {
		  ErrorResponse errorResponse = new ErrorResponse("400", "Invalid Transmission Type");
		  return ResponseEntity.badRequest().body(errorResponse);
	  }
	  // Printing payload ...
	  logger.info(vehicleDetails.toString());
	  String uuid = vehicleService.createVehicle(vehicleDetails);
	  OuputResponse response = new OuputResponse(200l, uuid);
	  return ResponseEntity.ok(response);
  }

  
}
