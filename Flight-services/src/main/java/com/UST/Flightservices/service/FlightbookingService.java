package com.UST.Flightservices.service;

import com.UST.Flightservices.dto.BookingRequest;
import com.UST.Flightservices.dto.FlightBookingAcknowledgement;
import com.UST.Flightservices.entity.PassengerInformation;
import com.UST.Flightservices.entity.PaymentInfo;
import com.UST.Flightservices.exception.InsufficientAmountException;
import com.UST.Flightservices.repo.PassengerRepo;
import com.UST.Flightservices.repo.PaymentRepo;
import com.UST.Flightservices.util.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FlightbookingService {

    @Autowired
    private PassengerRepo passengerrepo;

    @Autowired
    private PaymentRepo paymentrepo;
    public FlightBookingAcknowledgement bookingFlightTicket(BookingRequest request) throws InsufficientAmountException {
        PassengerInformation passengerinfo = request.getPassengerinfo();
        passengerinfo = passengerrepo.save(passengerinfo);
        PaymentInfo paymentinfo = request.getPaymentinfo();
        PaymentUtils.validateCreditLimit(paymentinfo.getAccountNo(),passengerinfo.getFare());
        paymentinfo.setPassengerId(passengerinfo.getPid());
        paymentinfo.setAmount(passengerinfo.getFare());
        paymentrepo.save(paymentinfo);

        return new FlightBookingAcknowledgement("success",passengerinfo.getFare(),
                UUID.randomUUID().toString().split("-")[0],passengerinfo);
    }
}
