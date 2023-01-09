package com.ercin.resourceserver.parkinglot;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ParkingLot {
    private Long id;

    private Integer parkingLotNumber;

    private Boolean isBooked;

    private Boolean isActive;

    private Double power;

}
