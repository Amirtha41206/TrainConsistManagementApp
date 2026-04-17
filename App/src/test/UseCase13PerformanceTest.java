package test;

import main.*;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase13PerformanceTest {

    @Test
    void testLoopFilteringLogic() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC", 50)
        );

        List<Bogie> result =
                new UseCase13Performance().filterWithLoop(bogies);

        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC", 50)
        );

        List<Bogie> result =
                new UseCase13Performance().filterWithStream(bogies);

        assertEquals(1, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC", 50)
        );

        UseCase13Performance app = new UseCase13Performance();

        assertEquals(
                app.filterWithLoop(bogies).size(),
                app.filterWithStream(bogies).size()
        );
    }
}