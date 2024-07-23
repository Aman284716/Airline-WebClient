package com.ust.Flight_Service.controller;

import com.netflix.discovery.converters.Auto;
import com.ust.Flight_Service.service.FlightService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Auto
    private FlightService flightService;

    @PostMapping("/addflight")
    public void addFlight(String flightName) {
        flightService.addFlight(flightName);
    }
}
