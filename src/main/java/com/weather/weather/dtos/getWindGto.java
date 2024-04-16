package com.weather.weather.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class getWindGto {
    private double temp;
    private double deg;
    private double gust;
    private int pressure;
}
