package com.UST.Flightservices.dto;

import com.UST.Flightservices.entity.PassengerInformation;
import com.UST.Flightservices.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingRequest {

    private PassengerInformation passengerinfo;
    private PaymentInfo paymentinfo;

}
