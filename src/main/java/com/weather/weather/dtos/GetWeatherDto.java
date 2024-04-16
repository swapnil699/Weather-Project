package com.weather.weather.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class GetWeatherDto {
    private int id;
    private String main;
    private String description;
    private String icon;
}
