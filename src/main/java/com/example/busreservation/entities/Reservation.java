package com.example.busreservation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bus_reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Long reservationId;

    @OneToOne
    @JoinColumn(name = "customer_id", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Customer customer;


    @OneToOne
    @JoinColumn(name = "bus_schedule_id", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private BusSchedule busSchedule;

    private Long timestamp;

    private String departureDate;

    private Integer totalSeatBooked;

    private String seatNumbers;

    private String reservationStatus;

    private Integer totalPrice;
}
