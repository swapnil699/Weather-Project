package com.weather.weather.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class GetWeatherResponseDto {


    private String name;
    private GetMainDto main;
    //    private List<GetWeatherDto> weather;
    //    private String base;
    //    private Long id;
    //    private Long dt;
    //    private Double main;
}
