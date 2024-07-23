package com.ust.Flight_Service.model;

public record Flight(
        Long id,
        String departureAirport,
        String arrivalAirport,
        String departureDate,
        String arrivalDate,
        String departureTime,
        String arrivalTime,
        String aircraftType,
        int seatsAvailable,
        int seatsBooked,
        int passengers,
        double price,
        String status

) {}


