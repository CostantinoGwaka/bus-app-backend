package com.example.busreservation.services;

import com.example.busreservation.entities.BusRoute;

import java.util.List;

public interface BusRouteService {
    BusRoute addBusRoute(BusRoute busRoute);

    List<BusRoute> getAllBusRoute();

    BusRoute getRouteByRouteName(String routeName);

    BusRoute getRouteByCityFromAndCityTo(String cityFrom, String cityTo);
}
