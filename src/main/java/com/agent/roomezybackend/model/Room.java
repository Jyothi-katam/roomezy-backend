package com.agent.roomezybackend.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "rooms")
@AllArgsConstructor
@NoArgsConstructor
public class Room
{
// id, name, location, price, amenities, images, availability, city, state, room_type, etc.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String location;

    private double price;

    private String city;

    private String state;

    private String country;

    private boolean available;


    private String image;

    @JsonIgnore
    @Enumerated(EnumType.STRING)
    private RoomType roomType;

    @ElementCollection
    private List<String> amenities;


}
