package com.springcore.aop.dao;

import com.springcore.aop.model.Passenger;
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
        if (null != passengerMap.get(id)){
            return passengerMap.get(id);
        }

        Passenger passenger = new Passenger(id);
        passengerMap.put(id, passenger);
        log.info("Fetching passenger from database with id: " + id);
        return passenger;
    }
}
