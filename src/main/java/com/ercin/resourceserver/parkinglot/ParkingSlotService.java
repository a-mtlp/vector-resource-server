package com.ercin.resourceserver.parkinglot;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingSlotService {
    public List<ParkingLot> getAvailableSlots() {
        return List.of(
                new ParkingLot(12L, 12453, false, true, 100.0),
                new ParkingLot(13L, 34526, false, true, 80.0),
                new ParkingLot(14L, 75696, false, true, 70.0),
                new ParkingLot(15L, 13464, false, true, 60.0),
                new ParkingLot(16L, 46923, false, true, 12.0)
        );
    }

    public ParkingLotBooking bookParkingLot(Long parkinglotid) {
        return new ParkingLotBooking();
    }

    public List<ParkingLotBooking> getBookings() {
        return List.of();
    }

    public ParkingLotBooking editBooking(Long id, ParkingLotBooking booking) {
        return new ParkingLotBooking();
    }
}
