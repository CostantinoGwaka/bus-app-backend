package com.example.busreservation.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
@Entity(name = "Bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "bus_id", nullable = false)
    private Long busId;

    @Column(name = "bus_name",nullable = false)
    private String busName;

    @Column(unique = true,name = "bus_number",nullable = false)
    private String busNumber;

    @Column(name = "bus_type",nullable = false)
    private String busType;

    @Column(name = "total_seat",nullable = false)
    private Integer totalSeat;

}
