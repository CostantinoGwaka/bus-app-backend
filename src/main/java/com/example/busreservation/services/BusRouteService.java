package com.example.busreservation.services;

import com.example.busreservation.entities.BusRoute;

import java.util.List;

public interface BusRouteService {
    BusRoute addBusRoute(BusRoute busRoute);

    List<BusRoute> getAllBusRoute();
}
