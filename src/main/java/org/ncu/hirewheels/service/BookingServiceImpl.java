package org.ncu.hirewheels.service;

import java.sql.Date;

import org.ncu.hirewheels.entities.booking;
import org.ncu.hirewheels.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {
    BookingRepository bookingRepository;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public booking addBooking(booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public booking getBookingById(Integer bookingId) {
        return bookingRepository.findById(bookingId).orElse(null);
    }

    @Override
    public booking updateBooking(Integer bookingId, booking updatedBooking) {
        // Check if the booking with the given ID exists
        if (bookingRepository.existsById(bookingId)) {
        	booking existingBooking = bookingRepository.getById(bookingId);
        	existingBooking.setAmount(updatedBooking.getAmount());
        	existingBooking.setPickupDate(updatedBooking.getPickupDate());
            existingBooking.setDropoffDate(updatedBooking.getDropoffDate());
            existingBooking.setBookingDate(updatedBooking.getBookingDate());
            return bookingRepository.save(existingBooking);
        }
        return null; // Booking with the given ID doesn't exist
    }

    @Override
    public void deleteBooking(Integer bookingId) {
        bookingRepository.deleteById(bookingId);
    }

}
