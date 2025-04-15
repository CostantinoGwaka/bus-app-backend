package com.example.busreservation.services;

import com.example.busreservation.entities.BusSchedule;
import com.example.busreservation.entities.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation addReservation(Reservation reservation);

    List<Reservation> getAllReservation();

    List<Reservation> getReservationsByMobile(String mobile);

    List<Reservation> getReservationByScheduleAndDepartureDate(Long scheduleId, String departureDate);
}
