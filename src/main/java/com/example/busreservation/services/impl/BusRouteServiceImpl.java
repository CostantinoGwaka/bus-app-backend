package com.example.busreservation.services.impl;

import com.example.busreservation.entities.BusRoute;
import com.example.busreservation.models.ReservationApiException;
import com.example.busreservation.repository.BusRouteRepository;
import com.example.busreservation.services.BusRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @Override
    public BusRoute getRouteByRouteName(String routeName) {
        return busRouteRepository.findByRouteName(routeName).orElseThrow(() -> new  ReservationApiException(HttpStatus.BAD_REQUEST, "No Such route found!"));
    }

    @Override
    public BusRoute getRouteByCityFromAndCityTo(String cityFrom, String cityTo) {
        return busRouteRepository.findByCityFromAndCityTo(cityFrom,cityTo).orElseThrow(() -> new  ReservationApiException(HttpStatus.BAD_REQUEST, "No Such route found!"));
    }
}
