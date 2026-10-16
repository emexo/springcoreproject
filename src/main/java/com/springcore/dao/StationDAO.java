package com.springcore.dao;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Log4j2
@Repository
public class StationDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Station station) {
        log.info("Inside the StationDAO save method, station:{}", station);
        String sql = "INSERT INTO station(station_name, station_code, location) VALUES (?, ?, ?)";
        int result = jdbcTemplate.update(sql, station.stationName(), station.stationCode(), station.location());
        log.info("Station saved successfully: {}", result);
    }

    public List<Station> findAll(){
        String sql = "select * from station";
        return jdbcTemplate.query(sql, new StationRowMapper());
    }

    public Station findById(int stationId){
        String sql = "select * from station where station_id=?";
        return jdbcTemplate.queryForObject(sql, new StationRowMapper(), stationId);
    }
}
