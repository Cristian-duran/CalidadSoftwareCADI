package pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

    public FibonacciTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of calcular method, of class Fibonacci.
     */
    @Test
    public void testCalcular() {

        assertEquals(21, Fibonacci.calcular(8));
        assertEquals(34, Fibonacci.calcular(9));
        assertEquals(55, Fibonacci.calcular(10));
        assertEquals(89, Fibonacci.calcular(11));
    }

}
