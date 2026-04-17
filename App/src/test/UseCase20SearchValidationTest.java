package test;

import main.UseCase20SearchValidation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase20SearchValidationTest {

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {

        String[] bogies = {};

        assertThrows(
                IllegalStateException.class,
                () -> new UseCase20SearchValidation().searchBogie(bogies, "BG101")
        );
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {

        String[] bogies = {"BG101","BG205"};

        boolean result = new UseCase20SearchValidation().searchBogie(bogies, "BG101");

        assertTrue(result);
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {

        String[] bogies = {"BG101","BG205","BG309"};

        boolean result = new UseCase20SearchValidation().searchBogie(bogies, "BG205");

        assertTrue(result);
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {

        String[] bogies = {"BG101","BG205","BG309"};

        boolean result = new UseCase20SearchValidation().searchBogie(bogies, "BG999");

        assertFalse(result);
    }

    @Test
    void testSearch_SingleElementValidCase() {

        String[] bogies = {"BG101"};

        boolean result = new UseCase20SearchValidation().searchBogie(bogies, "BG101");

        assertTrue(result);
    }
}