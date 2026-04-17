package test;

import main.UseCase19BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase19BinarySearchTest {

    @Test
    void testBinarySearch_BogieFound() {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        boolean result = new UseCase19BinarySearch().binarySearch(bogies, "BG309");

        assertTrue(result);
    }

    @Test
    void testBinarySearch_BogieNotFound() {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        boolean result = new UseCase19BinarySearch().binarySearch(bogies, "BG999");

        assertFalse(result);
    }

    @Test
    void testBinarySearch_FirstElementMatch() {

        String[] bogies = {"BG101","BG205","BG309"};

        boolean result = new UseCase19BinarySearch().binarySearch(bogies, "BG101");

        assertTrue(result);
    }

    @Test
    void testBinarySearch_LastElementMatch() {

        String[] bogies = {"BG101","BG205","BG309"};

        boolean result = new UseCase19BinarySearch().binarySearch(bogies, "BG309");

        assertTrue(result);
    }

    @Test
    void testBinarySearch_SingleElementArray() {

        String[] bogies = {"BG101"};

        boolean result = new UseCase19BinarySearch().binarySearch(bogies, "BG101");

        assertTrue(result);
    }

    @Test
    void testBinarySearch_EmptyArray() {

        String[] bogies = {};

        boolean result = new UseCase19BinarySearch().binarySearch(bogies, "BG101");

        assertFalse(result);
    }

    @Test
    void testBinarySearch_UnsortedInputHandled() {

        String[] bogies = {"BG309","BG101","BG550","BG205","BG412"};

        boolean result = new UseCase19BinarySearch().binarySearch(bogies, "BG205");

        assertTrue(result);
    }
}