package kuliah.uts.airplane.service;

import kuliah.uts.airplane.entity.Booking;
import kuliah.uts.airplane.entity.Destination;
import kuliah.uts.airplane.model.CheckingAvailableSeatRequest;
import kuliah.uts.airplane.model.CheckingAvailableSeatResponse;
import kuliah.uts.airplane.model.CreateBookingRequest;
import kuliah.uts.airplane.model.CreateOrupdateDestinationRequest;
import kuliah.uts.airplane.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking create(CreateBookingRequest request) {
        // TODO: validation
        // TODO: checking customer exist
        // TODO: checking balance
        // TODO: checking destination exist
        // TODO: checking seat
        // TODO: create booking
        // TODO: create booking item
        // TODO: create invoice
        // TODO: create credit history
        return new Booking();
    }

    public CheckingAvailableSeatResponse checkingAvailableSeatResponse(CheckingAvailableSeatRequest request) {
        // TODO: validation
        // TODO: checking destination exist
        // TODO: checking seat in booking and booking item and destination
        return new CheckingAvailableSeatResponse();
    }

    public Booking payBooking(Integer id) {
        // TODO: validation
        // TODO: checking booking exist
        // TODO: update invoice to paid
        return new Booking();
    }
}

