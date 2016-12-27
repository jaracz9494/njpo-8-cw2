/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg08_cw2.losowanie;

/**
 *
 * @author Dominik
 */
public class Testy_czasowe {
    
    public Testy_czasowe() {
    }
    
    @Test(timeout=300)
    public void Test1() {
        losowanie los = new losowanie();
        los.losuj();
    }
    
    @Test(timeout=1000)
    public void Test2() {
        losowanie los = new losowanie();
        los.losuj();
        los.sortuj();
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
