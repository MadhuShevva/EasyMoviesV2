package com.easymovies;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookingTest {

    @Test
    public void testBookingDetails() {
        Movie movie = new Movie("Interstellar", 2014);
        User user = new User("Alice");
        Booking booking = new Booking(movie, user);

        assertEquals("Interstellar", booking.getMovie().getTitle());
        assertEquals(2014, booking.getMovie().getYear());
        assertEquals("Alice", booking.getUser().getName());
        assertEquals("Alice", booking.getUserName());
    }
}
