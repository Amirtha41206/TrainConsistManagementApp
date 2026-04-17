package test;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase15SafeCargoTest {

    @Test
    void testCargo_SafeAssignment() {

        GoodsBogieUC15 b = new GoodsBogieUC15("Cylindrical");
        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.cargo);
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {

        GoodsBogieUC15 b = new GoodsBogieUC15("Rectangular");
        b.assignCargo("Petroleum");

        assertNull(b.cargo);
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {

        GoodsBogieUC15 b1 = new GoodsBogieUC15("Rectangular");
        b1.assignCargo("Petroleum");

        GoodsBogieUC15 b2 = new GoodsBogieUC15("Cylindrical");
        b2.assignCargo("Petroleum");

        assertEquals("Petroleum", b2.cargo);
    }
}