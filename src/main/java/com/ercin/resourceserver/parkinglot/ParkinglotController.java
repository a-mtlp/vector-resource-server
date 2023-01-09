package com.ercin.resourceserver.parkinglot;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class ParkinglotController {

    ParkingSlotService parkingSlotService;

    @PreAuthorize("hasRole('Kunde')")
    @GetMapping("/listOfAvailableParkinglots")
    public List<ParkingLot> getLots() {
        return this.parkingSlotService.getAvailableSlots();
    }

    @PreAuthorize("hasRole('Kunde')")
    @GetMapping("/bookparkinglot/{id}")
    public ParkingLotBooking bookParkingLot(@PathVariable Long id) {
        return this.parkingSlotService.bookParkingLot(id);
    }

    @PreAuthorize("hasRole('Gebäudeverwaltung')")
    @GetMapping("/getBookings")
    public List<ParkingLotBooking> getBookings() {
        return this.parkingSlotService.getBookings();
    }

    @PreAuthorize("hasRole('Gebäudeverwaltung')")
    @PutMapping("/editBooking/{id}")
    public ParkingLotBooking editBooking(@PathVariable Long id, @RequestBody ParkingLotBooking booking) {
        return this.parkingSlotService.editBooking(id, booking);
    }
}
