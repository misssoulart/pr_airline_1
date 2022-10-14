package ru.kataproject.p_sm_airlines_1.controller.impl;

import org.springframework.web.bind.annotation.RestController;
import ru.kataproject.p_sm_airlines_1.controller.AircraftController;
import ru.kataproject.p_sm_airlines_1.service.AircraftService;

@RestController
public class AircraftControllerImpl extends AircraftController {
    public AircraftControllerImpl(AircraftService aircraftController) {
        super(aircraftController);
    }
}

