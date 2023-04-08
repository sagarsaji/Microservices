package com.UST.Flightservices.repo;

import com.UST.Flightservices.entity.PassengerInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepo extends JpaRepository<PassengerInformation,Long> {



}
