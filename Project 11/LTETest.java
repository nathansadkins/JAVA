import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**test for LTE class.*/
public class LTETest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
 /**test for monthly cost.*/
   @Test public void monthlyCost1() {
      LTE n3 = new LTE("My iPad", 20.0, 30.00, 1200, 5.0);
      Assert.assertEquals(30.00, n3.monthlyCost(), 0.001);
   }
 /**test for monthly cost.*/
   @Test public void monthlyCost2() {
      LTE n3 = new LTE("My iPad", 20.0, 30.00, 1200, 2.0);
      Assert.assertEquals(38.00, n3.monthlyCost(), 0.001);
   }
}
