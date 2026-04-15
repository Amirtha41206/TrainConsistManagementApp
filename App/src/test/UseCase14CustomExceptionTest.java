package test;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase14CustomExceptionTest {

    @Test
    void testException_ValidCapacityCreation() throws InvalidCapacityException {

        PassengerBogie b = new PassengerBogie("Sleeper", 72);

        assertEquals(72, b.capacity);
    }

    @Test
    void testException_NegativeCapacityThrowsException() {

        Exception exception = assertThrows(
                InvalidCapacityException.class,
                () -> new PassengerBogie("Sleeper", -10)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ZeroCapacityThrowsException() {

        assertThrows(
                InvalidCapacityException.class,
                () -> new PassengerBogie("AC", 0)
        );
    }
}