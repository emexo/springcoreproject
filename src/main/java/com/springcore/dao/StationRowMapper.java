package com.springcore.dao;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StationRowMapper implements RowMapper<Station> {
    @Override
    public Station mapRow(ResultSet rs, int rowNum) throws SQLException {
        Station station = new Station(rs.getString("station_name"), rs.getString("station_code"), rs.getString("location"));
        return station;
    }
}
