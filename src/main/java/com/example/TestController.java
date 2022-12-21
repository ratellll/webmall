package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public UserDto test() {

        UserDto userDto = new UserDto();
        userDto.setName("bin");
        userDto.setSize(270);
        userDto.setPrice(10000);


        return userDto;
    }
}
