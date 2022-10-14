package ru.kataproject.p_sm_airlines_1.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kataproject.p_sm_airlines_1.entity.Aircraft;
import ru.kataproject.p_sm_airlines_1.service.AircraftService;


@Tag(name = "Aircraft controller")
@RestController
@RequestMapping("/")
public abstract class AircraftController {
    private final AircraftService aircraftService;

    @Autowired
    public AircraftController(AircraftService aircraftService) {
        this.aircraftService = aircraftService;
    }

    @GetMapping
    @Operation(summary = "Get Aircrafts", description = "Returnes Aircrafts Page default page")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Page successfully returned", content = @Content),
            @ApiResponse(responseCode = "400", description = "Page not found", content = @Content)
    })
    ResponseEntity<String> index() {
        return null;
    }
}

/*
@Controller
@RequestMapping("/")
public abstract class AircraftController {
    private final AircraftService aircraftService;

    @Autowired
    public AircraftController(AircraftService aircraftService) {
        this.aircraftService = aircraftService;
    }

    @GetMapping
    public String pageForAircraft (Model model, Authentication authentication) {
        Aircraft Aircraft1 = (Aircraft) authentication.getPrincipal();
        model.addAttribute("MainAircraft", Aircraft1);
        model.addAttribute("aircrafts", aircraftService.getAllAircrafts());
        model.addAttribute("newAircraft", new Aircraft());
        return "admin/index";
    }
}
*/