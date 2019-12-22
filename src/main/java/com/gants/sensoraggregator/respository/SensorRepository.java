package com.gants.sensoraggregator.respository;

import com.gants.sensoraggregator.model.Sensor;
import org.springframework.data.repository.CrudRepository;

public interface SensorRepository extends CrudRepository<Sensor, Long> {
}