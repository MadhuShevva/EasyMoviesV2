package com.easymovies;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testUserName() {
        User user = new User("Bob");
        assertEquals("Bob", user.getName());
    }
}
