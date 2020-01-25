import org.junit.Before;
import org.junit.Test;

/**test class for wirelessnetworkspart3.*/
public class WirelessNetworksPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**test case mainTest.
   *@throws InvalidCategoryException when user enters wrong category*/
   @Test public void mainTest() throws InvalidCategoryException {
      String[] args1 = {"wireless_network_data1.csv"};
      WirelessNetworksPart3 net = new WirelessNetworksPart3();
      WirelessNetworksPart3.main(args1);
   }
   /**test case for mainTest.
   *@throws InvalidCategoryException when user enters wrong category*/
   @Test public void mainTest2() throws InvalidCategoryException {
      String [] args1 = {};
      WirelessNetworksPart3.main(args1);
   }

   
}
