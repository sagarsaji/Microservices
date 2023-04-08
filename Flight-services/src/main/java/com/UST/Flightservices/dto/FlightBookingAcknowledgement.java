package com.UST.Flightservices.dto;

import com.UST.Flightservices.entity.PassengerInformation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlightBookingAcknowledgement {

    private String status;
    private double amount;
    private String pnrno;
    private PassengerInformation passengerinfo;


}
