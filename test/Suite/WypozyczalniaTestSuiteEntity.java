/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Suite;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import system.EgzemplarzTest;
import system.OperacjaTest;
import system.TestControl;
import wypozyczalnia.FilmTest;
import wypozyczalnia.WypozyczalniaTest;

/**
 *
 * @author Dominika
 */
@Categories.SuiteClasses({WypozyczalniaTest.class, EgzemplarzTest.class, OperacjaTest.class, FilmTest.class})
@RunWith(Categories.class)
@Categories.ExcludeCategory(TestControl.class)
public class WypozyczalniaTestSuiteEntity {
/*
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    */
}
