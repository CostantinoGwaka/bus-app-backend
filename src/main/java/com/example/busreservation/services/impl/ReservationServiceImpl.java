package com.example.busreservation.services.impl;

import com.example.busreservation.entities.Reservation;
import com.example.busreservation.repository.BusScheduleRepository;
import com.example.busreservation.repository.CustomerRepository;
import com.example.busreservation.repository.ReservationRepository;
import com.example.busreservation.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private BusScheduleRepository busScheduleRepository;

    @Override
    public Reservation addReservation(Reservation reservation) {
        final Customer customer;
        final boolean doesCustomerExist =customerRepository.existsByMobileOrEmail(reservation.getCustomer().getMobile(),reservation.getCustomer().getEmail());

        if (doesCustomerExist){
            customer = customerRepository.findByMobileOrEmail(reservation.getCustomer().getMobile(), reservation.getCustomer().getEmail()).orElseThrow();
        }else{
            customer =customerRepository.save(reservation.getCustomer());
        }
        reservation.setCustomer(customer);
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public List<Reservation> getReservationsByMobile(String mobile) {
        return reservationRepository.findby;
    }

    @Override
    public List<Reservation> getReservationByScheduleAndDepartureDate(Long scheduleId, String departureDate) {
        return null;
    }
}
