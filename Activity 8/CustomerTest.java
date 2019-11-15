import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**This class is the test method for 
*class Customer. 
*/ 
public class CustomerTest {
/** Fixture initialization (common initialization
*   for all tests). **/
   @Before public void setUp() {
   }
/**This method tests the setLocation class. */
   @Test public void setLocationTest1() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston, MA");
      Assert.assertEquals("Boston, MA", cstmr.getLocation());
   }
/**This method tests the setLocation class. */
   @Test public void setLocationTest2() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Atlanta", "GA");
      Assert.assertEquals("Atlanta, GA", cstmr.getLocation());
   }
/**This method tests the changeBalance method. */ 
   @Test public void changeBalanceTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.changeBalance(100);
      Assert.assertEquals(100, cstmr.getBalance(), 0.000001); 
   }
/**This method tests the toString method. */ 
   @Test public void toStringTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn", "AL"); 
      cstmr.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
   }
/**This method tests the compare method. */
   @Test public void compareToTest1() { 
      Customer cstmr1 = new Customer("Lane, Jane");
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr1.changeBalance(500);
      cstmr2.changeBalance(500);
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
   }
/**This method tests the compare method. */
   @Test public void compareToTest2() { 
      Customer cstmr1 = new Customer("Lane, Jane");
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr1.changeBalance(100);
      cstmr2.changeBalance(500);
      Assert.assertTrue(cstmr1.compareTo(cstmr2) < 0);
   }
/**This method tests the compare method. */
   @Test public void compareToTest3() { 
      Customer cstmr1 = new Customer("Lane, Jane");
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr1.changeBalance(1000);
      cstmr2.changeBalance(500);
      Assert.assertTrue(cstmr1.compareTo(cstmr2) > 0);
   }
}