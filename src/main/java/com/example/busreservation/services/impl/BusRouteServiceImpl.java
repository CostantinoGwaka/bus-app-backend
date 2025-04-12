package com.example.busreservation.services.impl;

import com.example.busreservation.entities.BusRoute;
import com.example.busreservation.repository.BusRouteRepository;
import com.example.busreservation.services.BusRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusRouteServiceImpl implements BusRouteService {

    @Autowired
    BusRouteRepository busRouteRepository;

    @Override
    public BusRoute addBusRoute(BusRoute busRoute) {
        return busRouteRepository.save(busRoute);
    }

    @Override
    public List<BusRoute> getAllBusRoute() {
        return busRouteRepository.findAll();
    }
}
