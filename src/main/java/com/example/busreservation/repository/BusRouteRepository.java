package com.example.busreservation.repository;

import com.example.busreservation.entities.BusRoute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRouteRepository extends JpaRepository<BusRoute, Long> {
}
