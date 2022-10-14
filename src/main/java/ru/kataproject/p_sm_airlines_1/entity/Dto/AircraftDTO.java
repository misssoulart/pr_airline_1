package ru.kataproject.p_sm_airlines_1.entity.Dto;

import lombok.NonNull;
import lombok.Value;
import javax.validation.constraints.NotEmpty;

// DTO для работы с сущностью Aircraft

@Value
public class AircraftDTO {
    @NonNull
    Long id;
    @NonNull
    String PNR;
    @NonNull
    String stamp;
    @NonNull
    String model;
    @NonNull
    String yearOfRelease;
    @NonNull
    String seat;
    @NonNull
    String aircraft;
    @NotEmpty
    String aircraftDTOServices; // не делала
}

