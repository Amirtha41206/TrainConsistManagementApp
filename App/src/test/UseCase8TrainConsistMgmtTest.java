package test;

import main.UseCase8TrainConsistMgmt;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistMgmtTest {

    @Test
    void testTrainConsistSize() {

        UseCase8TrainConsistMgmt app = new UseCase8TrainConsistMgmt();
        List<String> consist = app.getTrainConsist();

        assertEquals(4, consist.size());
    }

    @Test
    void testContainsSleeper() {

        UseCase8TrainConsistMgmt app = new UseCase8TrainConsistMgmt();
        List<String> consist = app.getTrainConsist();

        assertTrue(consist.contains("Sleeper"));
    }
}