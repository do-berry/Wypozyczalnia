/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalnia;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;
import system.Dane;
import system.TestControl;
import system.TestEntity;

/**
 *
 * @author USER
 */
@Category({TestControl.class, TestEntity.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WypozyczalniaTest {
    static Dane dane;
    static Wypozyczalnia instance;

    public WypozyczalniaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Wypozyczalnia();
        dane = new Dane();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dodajKlienta method, of class Wypozyczalnia.
     */
    @Test
    public void testDodajKlienta() {
        System.out.println("dodajKlienta");
        ProfilKlienta result;
        for(int i =0; i< 6; i++)
        {
            instance.dodajKlienta(dane.daneDoKlientow[i]);
            int size1 = instance.klienci.size();
            instance.dodajKlienta(dane.daneDoKlientow[i]);
            int size2 = instance.klienci.size();
            result = instance.klienci.get(size2 - 1);
            assertEquals(size1, size2);
            assertEquals(result, dane.daneKlienci[i]);
        }
    }

    /**
     * Test of dodajFilm method, of class Wypozyczalnia.
     */
    @Test
    public void testDodajFilm() {
        System.out.println("dodajFilm");
        Film result;
        for(int i = 0; i< 3; i++)
        {
            instance.dodajFilm(dane.daneDoFilmow[i]);
            int size1 = instance.filmy.size();
            instance.dodajFilm(dane.daneDoFilmow[i]);
            int size2 = instance.filmy.size();
            result = instance.filmy.get(size1 - 1);
            assertEquals(size1, size2);
            assertEquals(result, dane.daneFilmy[i]);
        }
    }

    /**
     * Test of szukajKlienta method, of class Wypozyczalnia.
     */

    @Test
    public void testSzukajKlienta() {
        System.out.println("szukajKlienta");
        ProfilKlienta result;
        for(int i =0; i< 5; i++)
        {
            instance.dodajKlienta(dane.daneDoKlientow[i]);
        }
        for(int i=0; i< 5; i++)
        {
            result = instance.szukajKlienta(dane.daneKlienci[i]);
            assertEquals(dane.daneKlienci[i], result);
        }
        result = instance.szukajKlienta(dane.daneKlienci[5]);
        assertEquals(null, result);
    }
}
