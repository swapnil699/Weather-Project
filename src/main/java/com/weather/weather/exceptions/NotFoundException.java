package com.weather.weather.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NotFoundException extends Exception{
    public NotFoundException(){
        super("This weather was not found");
    }
}
