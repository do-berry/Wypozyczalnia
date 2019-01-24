/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

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
import system.Dane;
import system.Egzemplarz;
import system.TestEntity;

/**
 *
 * @author USER
 */
@Category({TestEntity.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class FilmTest {
    Dane dane;
    @Parameterized.Parameter
    public int numer1;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
    Object[][] data1 = new Object[][]{ {0}, {1}, {2} };
    return Arrays.asList(data1);
    }
    @Before
    public void setUp() {
         dane = new Dane();
    }
    @Test
    public void testSzukajEgzemplarz() {
        System.out.println("szukajEgzemplarz");
        Egzemplarz result;
        Egzemplarz expResult[] = {dane.daneEgzemplarze[0], null, null};
        
        switch(numer1)
        {
            case 0:
                dane.daneFilmy[numer1].dodajEgzemplarz(0);
                dane.daneFilmy[numer1].dodajEgzemplarz(1);
                break;
            case 1:
                dane.daneFilmy[numer1].dodajEgzemplarz(2);
                dane.daneFilmy[numer1].dodajEgzemplarz(3);
                break;
            case 2:
                dane.daneFilmy[numer1].dodajEgzemplarz(4);
                dane.daneFilmy[numer1].dodajEgzemplarz(5);
                break;
        }
        result = dane.daneFilmy[numer1].szukajEgzemplarz(dane.daneEgzemplarze[numer1]);
        assertEquals(expResult[numer1], result);
    }
}
