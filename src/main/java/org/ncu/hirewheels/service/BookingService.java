package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.booking;

public interface BookingService {
    booking addBooking(booking booking);
    booking getBookingById(Integer bookingId);
    booking updateBooking(Integer bookingId, booking updatedBooking);
    void deleteBooking(Integer bookingId);
}
