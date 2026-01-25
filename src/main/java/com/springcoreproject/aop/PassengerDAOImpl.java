package com.springcoreproject.aop;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

/**
 * AOP example class implementing PassengerDAO interface.
 */
@Repository
@Log4j2
public class PassengerDAOImpl implements PassengerDAO{
    @Override
    public Passenger getPassengerByPassportNumber(String passportNumber) {
        Passenger passenger = new Passenger();
        passenger.setName("John Doe");
        passenger.setPassportNumber(passportNumber);
        return passenger;
    }
}
