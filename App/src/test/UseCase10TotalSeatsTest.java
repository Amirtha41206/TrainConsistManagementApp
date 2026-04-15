package test;

import main.Bogie;
import main.UseCase10TotalSeats;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TotalSeatsTest {

    @Test
    void testReduce_TotalSeatCalculation() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 40)
        );

        int total = new UseCase10TotalSeats().getTotalSeats(bogies);

        assertEquals(168, total);
    }

    @Test
    void testReduce_SingleBogieCapacity() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72)
        );

        int total = new UseCase10TotalSeats().getTotalSeats(bogies);

        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {

        List<Bogie> bogies = new ArrayList<>();

        int total = new UseCase10TotalSeats().getTotalSeats(bogies);

        assertEquals(0, total);
    }
}