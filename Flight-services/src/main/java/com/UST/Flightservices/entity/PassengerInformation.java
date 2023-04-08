package com.UST.Flightservices.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="passenger_info")
public class PassengerInformation {

    @Id
    @GeneratedValue
    private long pid;
    private String name;
    private String email;
    private String source;
    private String destination;
    private Date traveldate;
    private String pickupTime;
    private String arrivalTime;
    private double fare;

}
