package com.weather.weather.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class GetCityDto {
    private int id;
    private String name;
    private GetCoordDto coord;
    private String country;
    private int population;
    private int timezone;
    private long sunrise;
    private long sunset;
}
