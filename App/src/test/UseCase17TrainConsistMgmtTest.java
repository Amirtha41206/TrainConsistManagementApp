package test;

import main.UseCase17TrainConsistMgmt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase17TrainConsistMgmtTest {

    @Test
    void testSort_BasicAlphabeticalSorting() {

        String[] input = {"Sleeper","AC Chair","First Class","General","Luxury"};

        String[] result = new UseCase17TrainConsistMgmt().sortBogieNames(input);

        assertArrayEquals(
                new String[]{"AC Chair","First Class","General","Luxury","Sleeper"},
                result
        );
    }

    @Test
    void testSort_UnsortedInput() {

        String[] input = {"Luxury","General","Sleeper","AC Chair"};

        String[] result = new UseCase17TrainConsistMgmt().sortBogieNames(input);

        assertArrayEquals(
                new String[]{"AC Chair","General","Luxury","Sleeper"},
                result
        );
    }

    @Test
    void testSort_AlreadySortedArray() {

        String[] input = {"AC Chair","First Class","General"};

        String[] result = new UseCase17TrainConsistMgmt().sortBogieNames(input);

        assertArrayEquals(
                new String[]{"AC Chair","First Class","General"},
                result
        );
    }

    @Test
    void testSort_DuplicateBogieNames() {

        String[] input = {"Sleeper","AC Chair","Sleeper","General"};

        String[] result = new UseCase17TrainConsistMgmt().sortBogieNames(input);

        assertArrayEquals(
                new String[]{"AC Chair","General","Sleeper","Sleeper"},
                result
        );
    }

    @Test
    void testSort_SingleElementArray() {

        String[] input = {"Sleeper"};

        String[] result = new UseCase17TrainConsistMgmt().sortBogieNames(input);

        assertArrayEquals(
                new String[]{"Sleeper"},
                result
        );
    }
}