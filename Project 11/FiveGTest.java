import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**test for ckass FiveGTest.*/
public class FiveGTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
    /**test for monthly cost.*/
   @Test public void monthlyCost1() {
      FiveG n4 = new FiveG("My Phone", 10.0, 50.00, 1200, 10.0);
      Assert.assertEquals(50.00, n4.monthlyCost(), 0.001);
   }
 /**test for monthly cost.*/
   @Test public void monthlyCost2() {
      FiveG n4 = new FiveG("My Phone", 80.0, 50.00, 1200, 10.0);
      Assert.assertEquals(80.00, n4.monthlyCost(), 0.001);
   }

  
}
