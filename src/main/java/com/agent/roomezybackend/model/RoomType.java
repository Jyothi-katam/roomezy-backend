package com.agent.roomezybackend.model;


public enum RoomType
{
    SINGLE,       // Single room for one person
    DOUBLE,       // Double room for two people
    SUITE,        // Larger suite with living space
    FAMILY,       // Room for families
    STUDIO,       // Self-contained unit with kitchen
    PENTHOUSE,    // Luxurious top-floor room
    DELUXE,       // Premium room with upgraded amenities
    DORMITORY;    // Shared room in hostels

    public enum BookingStatus
    {
        PENDING,    // Booking has been created, but not yet confirmed
        CONFIRMED,  // Booking has been confirmed
        COMPLETED,  // Booking is complete
        CANCELLED;// Booking has been cancelled

    }
}