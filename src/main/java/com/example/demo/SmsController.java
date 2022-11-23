package com.example.demo;

import static com.example.demo.ApiConstants.API_VERSION;
import static com.example.demo.ApiConstants.SMS_SEND;

import com.example.demo.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(API_VERSION)
public class SmsController {

    //@PostMapping(SMS_SEND)
    //@ResponseStatus(HttpStatus.NO_CONTENT)
    @GetMapping
    public String sendSms(){
        return "Get Api Response";
    }

}
