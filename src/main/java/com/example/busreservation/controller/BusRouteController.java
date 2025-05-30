package com.example.busreservation.controller;

import com.example.busreservation.entities.BusRoute;
import com.example.busreservation.models.ResponseModel;
import com.example.busreservation.services.BusRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/busroute")
public class BusRouteController {

    @Autowired
    BusRouteService busRouteService;

    @PostMapping("/add")
    public ResponseModel<BusRoute> addBusRoute(@RequestBody BusRoute busRoute){
        final BusRoute savedBusRoute = busRouteService.addBusRoute(busRoute);
        return new ResponseModel<>(HttpStatus.OK.value(), "bus route successfully saved",savedBusRoute);
    }

    @GetMapping("/all")
    public ResponseEntity<List<BusRoute>> getAllBusRoute(){
        return ResponseEntity.ok(busRouteService.getAllBusRoute());
    }

    @GetMapping("/{routeName}")
    public ResponseEntity<BusRoute> getRouteByRouteName(@PathVariable (name = "routeName") String routeName){
        return ResponseEntity.ok(busRouteService.getRouteByRouteName(routeName));
    }

    @GetMapping("/query")
    public ResponseEntity<BusRoute> getRouteByCityFromAndCityTo(@RequestParam String cityFrom, @RequestParam String cityTo){
        return ResponseEntity.ok(busRouteService.getRouteByCityFromAndCityTo(cityFrom,cityTo));
    }
}
