package com.example.busreservation.services.impl;


import com.example.busreservation.entities.BusStand;
import com.example.busreservation.models.ReservationApiException;
import com.example.busreservation.repository.BusStandRepository;
import com.example.busreservation.services.BusStandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusStandServiceImpl implements BusStandService {

    @Autowired
    BusStandRepository busStandRepository;

    @Override
    public BusStand addBusStand(BusStand busStand) {
        return busStandRepository.save(busStand);
    }


    @Override
    public BusStand findByStandId(Long busStandId) {
        return busStandRepository.findByStandId(busStandId).orElseThrow(() -> new ReservationApiException(HttpStatus.NOT_FOUND,"Not found"));
    }

    @Override
    public List<BusStand> getAllBusStand() {
        return busStandRepository.findAll();
    }
}
