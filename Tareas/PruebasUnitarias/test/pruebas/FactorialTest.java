package pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    public FactorialTest() {
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
     * Test of calcular method, of class Factorial.
     */
    @Test
    public void testCalcular() {
        assertEquals(1, Factorial.calcular(1));
        assertEquals(2, Factorial.calcular(2));
        assertEquals(6, Factorial.calcular(3));
        assertEquals(24, Factorial.calcular(4));
        assertEquals(120, Factorial.calcular(5));
    }

}
