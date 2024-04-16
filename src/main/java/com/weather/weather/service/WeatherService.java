package com.weather.weather.service;

import com.weather.weather.dtos.GetWeatherResponseDto;
import com.weather.weather.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WeatherService {
    @Value("${openWeather.url-cityTemp}")
    private String BaseURLCityTemp;
    @Value("${openWeather.token}")
    private String token;

    RestTemplate restTemplate = new RestTemplate();

    public GetWeatherResponseDto getWeatherByCity(String city) throws NotFoundException {

        String url = BaseURLCityTemp + "?q=" + city + "&appid=" + token;
        GetWeatherResponseDto weather = restTemplate.getForObject(url, GetWeatherResponseDto.class);

//        System.out.println(weather);

        if (weather == null) {
            throw new NotFoundException();
        }


//        return weather.toString();
        return weather;

        //Important Note : please add api key in application.properties
    }
}
