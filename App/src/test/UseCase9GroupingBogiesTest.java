package test;

import main.Bogie;
import main.UseCase9GroupingBogies;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase9GroupingBogiesTest {

    @Test
    void testGrouping_BogiesGroupedByType() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 72)
        );

        Map<String, List<Bogie>> result =
                new UseCase9GroupingBogies().groupBogies(bogies);

        assertTrue(result.containsKey("Sleeper"));
        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56)
        );

        Map<String, List<Bogie>> result =
                new UseCase9GroupingBogies().groupBogies(bogies);

        assertEquals(2, result.size());
    }

    @Test
    void testGrouping_EmptyBogieList() {

        List<Bogie> bogies = new ArrayList<>();

        Map<String, List<Bogie>> result =
                new UseCase9GroupingBogies().groupBogies(bogies);

        assertTrue(result.isEmpty());
    }
}