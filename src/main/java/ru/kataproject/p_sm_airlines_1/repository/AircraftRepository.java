package ru.kataproject.p_sm_airlines_1.repository;

import ru.kataproject.p_sm_airlines_1.entity.Aircraft;

import java.util.List;

public interface AircraftRepository {
    void addAircraft(Aircraft aircraft);

    void removeAircraft(int id);

    void editAircraft(Aircraft aircraft);

    Aircraft getAircraftById(int id);

    List<Aircraft> getAllAircrafts();

    Aircraft getAircraftByAircraftname(String Aircraftname);

    void save(Aircraft aircraft);
}
