package com.easymovies;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Dune", 2021);
        User user = new User("John");
        Booking booking = new Booking(movie, user);

        System.out.println("Booking for: " + booking.getUserName());
        System.out.println("Movie: " + booking.getMovie().getTitle() + " (" + booking.getMovie().getYear() + ")");
    }
}
