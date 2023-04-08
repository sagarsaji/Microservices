package com.UST.Flightservices.controller;

import com.UST.Flightservices.dto.BookingRequest;
import com.UST.Flightservices.dto.FlightBookingAcknowledgement;
import com.UST.Flightservices.exception.InsufficientAmountException;
import com.UST.Flightservices.service.FlightbookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightserviceController {

    @Autowired
    public FlightbookingService flightbookingservice;

    @PostMapping("/booking")
    public FlightBookingAcknowledgement bookingFlightTicket(@RequestBody BookingRequest request) throws InsufficientAmountException {
        return flightbookingservice.bookingFlightTicket(request);
    }

}
