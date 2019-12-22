package com.gants.sensoraggregator.controller;

import com.gants.sensoraggregator.model.Sensor;
import com.gants.sensoraggregator.respository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "sensor", produces = "application/json")
@CrossOrigin(origins = "*")
public class SensorController {
    @Autowired
    SensorRepository sensorRepository;

    @GetMapping("/readings")
    public Iterable<Sensor> getReadings() {
        return sensorRepository.findAll();
    }

    @PostMapping(path = "/reading")
    @ResponseStatus(HttpStatus.CREATED)
    public Sensor processSensorReading(@RequestBody Sensor sensor) {
        return sensorRepository.save(sensor);
    }

}
