import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**test for celluar class.*/
public class CellularTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**test for get time method.*/
   @Test public void getTimeTest() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals(1200, n2.getTime(), 0.001);
   }
   /**test for getName.*/
   @Test public void getNameTest() { 
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals("My Note", n2.getName()); 
   }
   /**test for set bandwidth.*/
   @Test public void setBandwidthTest() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      n2.setBandwidth(6.0);
      Assert.assertEquals(6.0, n2.getBandwidth(), 0.001);
   }
   /**Test for get count method.*/
   @Test public void getCountTest() {
      Cellular n21 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      n21.resetCount();
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals(1, n2.getCount());
   }
   /**test for set cost method.*/
   @Test public void setMonthlyFixedCost() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      n2.setMonthlyFixedCost(1.0);
      Assert.assertEquals(1.0, n2.getMonthlyFixedCost(), 0.001);
   }
   /**Test for set count method.*/
   @Test public void resetCountTest() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      n2.resetCount();
      Assert.assertEquals(0, n2.getCount());
   }
   /**test for getMonthlyCost.*/
   @Test public void getMonthlyFixedCostTest() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals(20.00, n2.getMonthlyFixedCost(), 0.001);
   }
   /**test for setName.*/
   @Test public void setNameTest() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      n2.setName("name");
      Assert.assertEquals("name", n2.getName()); 
   }
   /**test for set time method.*/
   @Test public void setTimeTest() { 
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      n2.setTime(1);
      Assert.assertEquals(1, n2.getTime(), 0.001);
   }
   /**test for getDataLimit.*/
   @Test public void getDataLimitTest() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals(1.0, n2.getDataLimit(), 0.001);
   }
   /**test for setDataLimit.*/
   @Test public void setDataLimitTest() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      n2.setDataLimit(1); 
      Assert.assertEquals(1, n2.getDataLimit(), 0.001);
   }
   /**test for dataUsage method.*/
   @Test public void dataUsageTest() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals(0.75, n2.dataUsage(), 0.0001);
   }
   /**test for monthlycost method.*/
   @Test public void monthlyCostTest1() { 
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals(20.00, n2.monthlyCost(), 0.001);
   } 
   /**test for monthlycost method.*/
   @Test public void monthlyCostTest2() {
      Cellular n2 = new Cellular("My Note", 50.0, 20.00, 1200, 1.0);
      Assert.assertEquals(26.5, n2.monthlyCost(), 0.001);
   }
   /**test for to string method.*/
   @Test public void toStringTest() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      String output = n2.toString();
      Assert.assertEquals(output, n2.toString()); 
   }

}
