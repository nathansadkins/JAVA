import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**test for monthlycostcomparator.*/
public class MonthlyCostComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**compare.*/
   @Test public void compareTest1() {
      MonthlyCostComparator comp = new MonthlyCostComparator();
      WiFi n1 = new WiFi("My Wifi", 700, 0.00, 5.00);
      WiFi n2 = new WiFi("My Wifi", 450, 40.00, 5.00);
      int param = comp.compare(n1, n2); 
      Assert.assertEquals(1, param);
   }
   /**test.*/
   @Test public void compareTest2() {
      MonthlyCostComparator comp = new MonthlyCostComparator();
      WiFi n1 = new WiFi("My Wifi", 700, 100.00, 5.00);
      WiFi n2 = new WiFi("My Wifi", 450, 40.00, 5.00);
      int param = comp.compare(n1, n2); 
      Assert.assertEquals(-1, param);
   }
   /**test.*/
   @Test public void compareTest3() {
      MonthlyCostComparator comp = new MonthlyCostComparator();
      WiFi n1 = new WiFi("My Wifi", 700, 40.00, 5.00);
      WiFi n2 = new WiFi("My Wifi", 450, 40.00, 5.00);
      int param = comp.compare(n1, n2); 
      Assert.assertEquals(0, param);
   }

}
