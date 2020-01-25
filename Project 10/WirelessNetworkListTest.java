import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
/**test for WirelessNetworkList.*/
public class WirelessNetworkListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**tests add wirelessnetwork and getwirelessnetwork.
   *@throws FileNotFoundException - throws file
   */
   @Test public void getNetAndaddNet() {
      WirelessNetworkList list = new WirelessNetworkList();
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      list.addWirelessNetwork(n1);
      WirelessNetwork[] param = list.getWirelessNetworksArray(); 
      Assert.assertEquals(7, param[0].getName().length());
   }
   /**tests add and setting of invalid records.*/
   @Test public void addAndSetInvalid() {
      WirelessNetworkList list = new WirelessNetworkList();
      String[] error = new String[1];
      error[0] = "error";
      list.addInvalidRecord("error");
      Assert.assertEquals(5, list.getInvalidRecordsArray()[0].length());
   }
}
