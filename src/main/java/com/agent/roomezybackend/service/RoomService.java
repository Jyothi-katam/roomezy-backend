package com.agent.roomezybackend.service;

import com.agent.roomezybackend.model.Room;
import com.agent.roomezybackend.model.RoomType;
import com.agent.roomezybackend.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService
{

    @Autowired
    private RoomRepository roomRepository;

    public Room addroomdetails(Room room, RoomType roomType)
    {
        Room newroom=new Room();
        newroom.setName(room.getName());
        newroom.setPrice(room.getPrice());
        newroom.setAvailable(room.isAvailable());
        newroom.setLocation(room.getLocation());
        newroom.setCity(room.getCity());
        newroom.setState(room.getState());
        newroom.setCountry(room.getCountry());
        newroom.setRoomType(roomType);

        // Convert the image to a byte array and save
        newroom.setImage(room.getImage());
        newroom.setAmenities(room.getAmenities());

        roomRepository.save(newroom);
        return newroom;

    }

    public List<Room> getAllRooms()
    {
        return roomRepository.findAll();
    }
}
