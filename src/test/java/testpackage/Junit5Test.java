package testpackage;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Junit5Test {

    @BeforeAll
    static void before() {
        System.out.println("before");
    }

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @DisplayName("naesta test")
    void myNextTest() {
        assertEquals(2, 1 + 1);
    }

}
