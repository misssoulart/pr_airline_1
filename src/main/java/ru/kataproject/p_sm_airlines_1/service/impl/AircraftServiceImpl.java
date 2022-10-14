package ru.kataproject.p_sm_airlines_1.service.impl;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kataproject.p_sm_airlines_1.entity.Aircraft;
import ru.kataproject.p_sm_airlines_1.repository.AircraftRepository;
import ru.kataproject.p_sm_airlines_1.service.AircraftService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@Getter
@Setter
public abstract class AircraftServiceImpl extends AircraftService {

    @Autowired
    private AircraftRepository aircraftRepository;

    @Override
    public void addAircraft(Aircraft aircraft) {
        aircraftRepository.addAircraft(aircraft);
    }

    @Override
    public void removeAircraft(int id) {
        aircraftRepository.removeAircraft(id);
    }

    @Override
    public void updateAircraft(Aircraft aircraft) {
        aircraftRepository.editAircraft(aircraft);
    }

    @Override
    public Aircraft getAircraftById(int id) {
        return aircraftRepository.getAircraftById(id);
    }

    @Override
    public List<Aircraft> getAllAircrafts() {
        return aircraftRepository.getAllAircrafts();
    }

    @Override
    public Aircraft findByAircraftname(String aircraftname) {
        return aircraftRepository.getAircraftByAircraftname(aircraftname);
    }
}
