package com.weather.weather.controller;

import com.weather.weather.dtos.GetWeatherResponseDto;
import com.weather.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/weather")
public class WeatherController {

    private WeatherService weatherservice;

    public WeatherController(WeatherService weatherservice) {
        this.weatherservice = weatherservice;
    }

    @GetMapping("/city/{city}")
    public @ResponseBody GetWeatherResponseDto getWeatherByCity(@PathVariable("city") String city) throws Exception {

        return weatherservice.getWeatherByCity(city);

    }
}
