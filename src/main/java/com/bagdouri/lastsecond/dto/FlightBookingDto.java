package com.bagdouri.lastsecond.dto;

import com.bagdouri.lastsecond.service.FlightBookingService;

import java.time.LocalDateTime;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingDto {

    private Long id;
    private String customerFirstName;
    private String customerLastName;
    private String customerIdNumber;
    private String departureAirport;
    private LocalDateTime departureDateTime;
    private String arrivalAirport;
    private LocalDateTime arrivalDateTime;
    private double price;

}
