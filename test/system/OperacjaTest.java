/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class OperacjaTest {
    Dane dane;
   
    @Before
    public void setUp() {
        dane = new Dane(); 
    }

    /**
     * Test of porownajDaty method, of class Operacja.
     */
    @Test
    public void testPorownajDaty() {
        System.out.println("porownajDaty");
        boolean expResult[] = {true, false, false, false, false, false, false};
        boolean result;
        for(int i =0; i< 7; i++)
        {
            result = dane.daneOperacje[i].porownajDaty(dane.daneDaty[i]);
            System.out.println(dane.daneOperacje[i] + " == " + dane.daneDaty[i] + "  "+ expResult[i]);
        }
    }

}
