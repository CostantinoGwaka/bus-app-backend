package com.example.busreservation.repository;

import com.example.busreservation.entities.BusStand;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BusStandRepository extends JpaRepository<BusStand,Long> {

    Optional<BusStand>  findByStandId(Long busStandId);
}
