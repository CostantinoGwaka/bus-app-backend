package com.example.busreservation.services;


import com.example.busreservation.entities.BusStand;

import java.util.List;

public interface BusStandService {

    BusStand addBusStand(BusStand busStand);

    BusStand findByStandId(Long busStandId);

    List<BusStand> getAllBusStand();

}
