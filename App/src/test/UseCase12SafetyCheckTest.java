package test;

import main.UseCase12SafetyCheck;
import main.GoodsBogie;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase12SafetyCheckTest {

    @Test
    void testSafety_AllBogiesValid() {

        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Coal")
        );

        assertTrue(new UseCase12SafetyCheck().isTrainSafe(bogies));
    }

    @Test
    void testSafety_CylindricalWithInvalidCargo() {

        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Coal")
        );

        assertFalse(new UseCase12SafetyCheck().isTrainSafe(bogies));
    }

    @Test
    void testSafety_EmptyBogieList() {

        List<GoodsBogie> bogies = new ArrayList<>();

        assertTrue(new UseCase12SafetyCheck().isTrainSafe(bogies));
    }
}