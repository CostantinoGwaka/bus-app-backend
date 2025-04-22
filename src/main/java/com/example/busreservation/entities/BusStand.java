package com.example.busreservation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Entity(name = "BusStand")
public class BusStand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "stand_id", nullable = false)
    private Long standId;

    @Column(name = "stand_name",nullable = false)
    private String standName;

    @Column(unique = true,name = "stand_number",nullable = false)
    private String standNumber;

    @Column(name = "stand_type",nullable = false)
    private String standType;

    @Column(name = "stand_location",nullable = false)
    private String standLocation;
}
