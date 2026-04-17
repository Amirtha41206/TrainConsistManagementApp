package test;

import main.UseCase18LinearSearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase18LinearSearchTest {

    @Test
    void testSearch_BogieFound() {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        boolean result = new UseCase18LinearSearch().searchBogie(bogies, "BG309");

        assertTrue(result);
    }

    @Test
    void testSearch_BogieNotFound() {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        boolean result = new UseCase18LinearSearch().searchBogie(bogies, "BG999");

        assertFalse(result);
    }

    @Test
    void testSearch_FirstElementMatch() {

        String[] bogies = {"BG101","BG205","BG309"};

        boolean result = new UseCase18LinearSearch().searchBogie(bogies, "BG101");

        assertTrue(result);
    }

    @Test
    void testSearch_LastElementMatch() {

        String[] bogies = {"BG101","BG205","BG309"};

        boolean result = new UseCase18LinearSearch().searchBogie(bogies, "BG309");

        assertTrue(result);
    }

    @Test
    void testSearch_SingleElementArray() {

        String[] bogies = {"BG101"};

        boolean result = new UseCase18LinearSearch().searchBogie(bogies, "BG101");

        assertTrue(result);
    }
}