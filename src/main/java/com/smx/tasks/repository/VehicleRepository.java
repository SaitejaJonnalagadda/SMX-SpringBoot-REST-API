package com.smx.tasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smx.tasks.model.Vehicle;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {}
