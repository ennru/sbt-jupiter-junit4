package testpackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;


public class Junit4Test {

    @BeforeClass
    static void before() {
        System.out.println("before class");
    }

    @Test
    void myFirstTest() {
        assertEquals(3, 1 + 1);
        throw new RuntimeException("Junit4");
    }

    @Test
    void myNextTest() {
        assertEquals(2, 1 + 1);
    }

}
