package ru.kataproject.p_sm_airlines_1.service;

import ru.kataproject.p_sm_airlines_1.entity.Aircraft;

import java.util.List;

public abstract class AircraftService {
    public void updateAircraft(Aircraft aircraft) {
    }
    public void addAircraft(Aircraft user) {
    }

    public Aircraft getAircraftById(int id) {
        return null;
    }

    public List<Aircraft> getAllAircrafts() {
        return null;
    }

    public void removeAircraft(int id) {

    }

    public abstract Aircraft findByAircraftname(String aircraftname);
}
