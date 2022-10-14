package ru.kataproject.p_sm_airlines_1.controller;

import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.kataproject.p_sm_airlines_1.entity.Aircraft;
import ru.kataproject.p_sm_airlines_1.service.AircraftService;

import java.util.List;

@RestController
@RequestMapping("api")
@Setter
@Getter
public class RestControllerAircraft {
    AircraftService aircraftService;

    public RestControllerAircraft(AircraftService aircraftService) {
        this.aircraftService = aircraftService; // явно мы не указываем, если исаользуем lombok ?
    }
    @GetMapping("/aircraft")
    public ResponseEntity<List<Aircraft>> getAllAircraft() {
        List<Aircraft> userList = aircraftService.getAllAircrafts();
        if (userList != null && !userList.isEmpty()) {
            return new ResponseEntity<>(userList, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/aircrafts/{id}")
    public ResponseEntity<Aircraft> getAircraftById(@PathVariable int id) {
        Aircraft aircraft = aircraftService.getAircraftById(id);
        if (aircraft == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(aircraft, HttpStatus.OK);
    }

    @PostMapping("/newAircraft")
    public ResponseEntity<Aircraft> addUser(@RequestBody Aircraft aircraft) {
        aircraftService.addAircraft(aircraft);
        return ResponseEntity.ok().build();
    }


    @PutMapping("/update")
    public ResponseEntity<?> updateAircraft(@RequestBody Aircraft aircraft) {
        aircraftService.updateAircraft(aircraft);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Aircraft> removeAircraft(@PathVariable("id") int id) {
        aircraftService.removeAircraft(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

