package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TripBooking{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripBookingId;
    private String fromLocation;
    private String toLocation;
    private int distanceInKm;

    private TripStatus status;

    private int bill;

    @ManyToOne
    @JoinColumn
    Driver driver;

    @ManyToOne
    @JoinColumn
    Customer customer;
}