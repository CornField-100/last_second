package com.bagdouri.lastsecond;
import com.bagdouri.lastsecond.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingRepo extends JpaRepository<FlightBooking, Long> {
}
