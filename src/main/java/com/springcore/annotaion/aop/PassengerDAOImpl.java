package com.springcore.annotaion.aop;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Log4j2
@Repository
public class PassengerDAOImpl implements PassengerDAO{
    private static Map<Integer, Passenger> passengerMap = new HashMap<>();

    @Override
    public Passenger getPassenger(int id) {
        log.info("#### getPassenger() method called with id: {} ####", id);
        if (null != passengerMap.get(id)){
            return passengerMap.get(id);
        }

        Passenger passenger = new Passenger(id);
        passengerMap.put(id, passenger);
        log.info("#### Passenger created and added to map: {} ####", passenger);
        return passenger;
    }

}
