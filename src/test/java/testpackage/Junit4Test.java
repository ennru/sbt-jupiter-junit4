package testpackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;


public class Junit4Test {

    @BeforeClass
    public static void before() {
        System.out.println("before class");
    }

    @Test
    public void myFirstTest() {
        assertEquals(3, 1 + 1);
        throw new RuntimeException("Junit4");
    }

    @Test
    public void myNextTest() {
        assertEquals(2, 1 + 1);
    }

}
