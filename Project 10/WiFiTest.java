import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**test for WiFi class.*/
public class WiFiTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**test for getModem method.*/
   @Test public void getModemTest() {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Assert.assertEquals(5.00, n1.getModemCost(), 0.0001);
   }
   /**test for setModemCost method.*/
   @Test public void setModemCostTest() {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      n1.setModemCost(2.00);
      Assert.assertEquals(2.00, n1.getModemCost(), 0.001);
   }
   /**test for monthlyCost method.*/
   @Test public void monthlyCostTest() {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Assert.assertEquals(45.00, n1.monthlyCost(), 0.001);
   }
}
