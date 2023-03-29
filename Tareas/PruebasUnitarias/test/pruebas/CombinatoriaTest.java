package pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CombinatoriaTest {

    public CombinatoriaTest() {
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
     * Test of calcular method, of class Combinatoria.
     */
    @Test
    public void testCalcular() {
        assertEquals(10, Combinatoria.calcular(5, 2));
        assertEquals(1, Combinatoria.calcular(5, 5));
        assertEquals(1, Combinatoria.calcular(6, 6));
        assertEquals(35, Combinatoria.calcular(7, 3));
        assertEquals(210, Combinatoria.calcular(10, 4));

    }

}
