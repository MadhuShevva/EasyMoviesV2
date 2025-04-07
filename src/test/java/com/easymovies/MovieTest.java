package com.easymovies;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

    @Test
    public void testMovieDetails() {
        Movie movie = new Movie("Inception", 2010);
        assertEquals("Inception", movie.getTitle());
        assertEquals(2010, movie.getYear());
    }
}
