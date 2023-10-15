package org.ncu.hirewheels.controller;

import org.ncu.hirewheels.entities.booking;
import org.ncu.hirewheels.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/add")
    public ResponseEntity<booking> addBooking(@RequestBody booking booking) {
        booking newBooking = bookingService.addBooking(booking);
        return new ResponseEntity<>(newBooking, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<booking> getBookingById(@PathVariable("id") Integer bookingId) {
        booking booking = bookingService.getBookingById(bookingId);
        if (booking != null) {
            return new ResponseEntity<>(booking, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<booking> updateBooking(@PathVariable("id") Integer bookingId, @RequestBody booking updatedBooking) {
        booking updated = bookingService.updateBooking(bookingId, updatedBooking);
        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteBooking(@PathVariable("id") Integer bookingId) {
        bookingService.deleteBooking(bookingId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
