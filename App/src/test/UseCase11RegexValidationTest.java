package test;

import main.UseCase11RegexValidation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase11RegexValidationTest {

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(new UseCase11RegexValidation().isValidTrainID("TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(new UseCase11RegexValidation().isValidTrainID("TRAIN12"));
        assertFalse(new UseCase11RegexValidation().isValidTrainID("TRN12A"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(new UseCase11RegexValidation().isValidCargoCode("PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(new UseCase11RegexValidation().isValidCargoCode("PET-ab"));
        assertFalse(new UseCase11RegexValidation().isValidCargoCode("PET123"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(new UseCase11RegexValidation().isValidTrainID(""));
        assertFalse(new UseCase11RegexValidation().isValidCargoCode(""));
    }
}