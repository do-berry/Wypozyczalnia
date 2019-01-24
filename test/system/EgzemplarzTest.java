/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

/**
 *
 * @author USER
 */
@Category({TestEntity.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class EgzemplarzTest {
    Dane dane;
    
    @Parameterized.Parameter
    public int numer1;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
    Object[][] data1 = new Object[][]{ {0}, {1}, {2}, {3}, {4}, {5} };
    return Arrays.asList(data1);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @Before
    public void setUp() {
        dane = new Dane();
    }

    /**
     * Test of dodajRezerwacje method, of class Egzemplarz.
     */
    @Test
    public void testDodajRezerwacje() {
        System.out.println("dodajRezerwacje");
         for(int i=0; i< 6; i++)
        {
            dane.daneEgzemplarze[i].dodajRezerwacje(dane.daneOperacje[i]);
            assertEquals(dane.daneOperacje[i], dane.daneEgzemplarze[i].rezerwacje.get(0));
        }
    }
    
    /**
     * Test of sprawdzRezerwacje method, of class Egzemplarz.
     */
    @Test
    public void testSprawdzRezerwacje() {
        System.out.println("sprawdzRezerwacje " + numer1);

        boolean expResult[] = {true, false, false, false, false, false};
        boolean result;  
        dane.daneEgzemplarze[numer1].dodajRezerwacje(dane.daneOperacje[numer1]);
        result = dane.daneEgzemplarze[numer1].sprawdzRezerwacje(dane.daneDaty[numer1]);
        System.out.println(dane.daneEgzemplarze[numer1].rezerwacje.get(0) + " == " + dane.daneDaty[numer1] + "  "+ expResult[numer1]);
        assertEquals(expResult[numer1], result);
    }
}
