package com.agent.roomezybackend.controller;


import com.agent.roomezybackend.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookingController
{
    @Autowired
    private BookingService bookingService;


}
