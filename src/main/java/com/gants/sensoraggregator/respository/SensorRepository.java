package com.gants.sensoraggregator.respository;

import com.gants.sensoraggregator.model.Sensor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

public interface SensorRepository extends CrudRepository<Sensor, Long> {
    @Query(
            value = "SELECT DISTINCT CAST(sensor_sample_time AS date) FROM sensor",
            nativeQuery = true
    )
    List<Date> findDistinctReadingSampleDates();
}