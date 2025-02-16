package com.agent.roomezybackend.controller;

import com.agent.roomezybackend.model.Room;
import com.agent.roomezybackend.model.RoomType;
import com.agent.roomezybackend.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomController
{
    @Autowired
    private RoomService roomService;

    @PostMapping("/addroom")
    public Room addroomdetails(@RequestBody Room room, @RequestParam RoomType roomType)
    {
        return roomService.addroomdetails(room,roomType);
    }

    @GetMapping("/getrooms")
    public List<Room> getAllRooms()
    {
        return roomService.getAllRooms();

    }
}
