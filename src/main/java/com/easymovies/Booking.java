package com.easymovies;

public class Booking {
    private Movie movie;
    private User user;

    public Booking(Movie movie, User user) {
        this.movie = movie;
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public User getUser() {
        return user;
    }

    public String getUserName() {
        return user.getName();
    }
}
