package com.example.busreservation.controller;


import com.example.busreservation.entities.Bus;
import com.example.busreservation.entities.BusStand;
import com.example.busreservation.models.ResponseModel;
import com.example.busreservation.services.BusStandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stand")
public class BusStandController {

    @Autowired
    BusStandService busStandService;

    @PostMapping("/add")
    public ResponseModel<BusStand> addBusStand(@RequestBody BusStand busStand){
        final BusStand savedBusStand= busStandService.addBusStand(busStand);
        return new ResponseModel<>(HttpStatus.OK.value(), "bus stand successfully saved",savedBusStand);
    }

    @GetMapping("/all")
    public ResponseEntity<List<BusStand>> getAllBusStand(){
        return ResponseEntity.ok(busStandService.getAllBusStand());
    }

    @GetMapping("/findStandById/{standId}")
    public ResponseEntity<BusStand> getBusStandById(@PathVariable(name = "standId") Long standId){
        return ResponseEntity.ok(busStandService.findByStandId(standId));
    }

}
