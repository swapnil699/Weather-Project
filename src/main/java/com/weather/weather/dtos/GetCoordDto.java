package com.weather.weather.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class GetCoordDto {
    private double lat;
    private double lon;
}
