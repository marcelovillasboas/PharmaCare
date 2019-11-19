package TestPackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class DoseJUnitTest {
    
    static pharmacare.PharmaCareGUI pmInstance;
    
    public DoseJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println ("Setup ...");
        pmInstance = new pharmacare.PharmaCareGUI();
    }
    
    @After
    public void tearDown() {
        System.out.println ("Tear down ...");
        pmInstance = null;
    }

    @Test
    public void testDoses() 
    {
        boolean expectedResult = true;
        boolean result = pmInstance.checkMg("mg");
        System.out.println("*** Prime Number Test ***");
        Assert.assertEquals(expectedResult, result);
    }
}
