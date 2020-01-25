import java.util.Arrays;
import java.util.Scanner; 
import java.io.FileNotFoundException;
import java.io.File;
/**class wirelessnetworklist will create an array of wirelessnetworks.
*Nathan Adkins - COMP 1210 */
public class WirelessNetworkList {

   private WirelessNetwork[] netArr;
   private String[] invalidRecArr; 
   /**constructor.*/
   public WirelessNetworkList() {
      netArr = new WirelessNetwork[0];
      invalidRecArr = new String[0];
   }
   /**getWirelessNetworksArray will get wireless array.
   *@return WirelessNetwork[] - array of networks
   */
   public WirelessNetwork[] getWirelessNetworksArray() {
      return netArr;
   }
   /**get invalid record array.
   *@return String[] - string for array data
   */
   public String[] getInvalidRecordsArray() {
      return invalidRecArr;
   }
   /**method will add a wirelessnetwork.
   *@param network - wirelessnetwork obj
   */
   public void addWirelessNetwork(WirelessNetwork network) {
      netArr = Arrays.copyOf(netArr, netArr.length + 1);
      netArr[netArr.length - 1] = network;
   }
   /**will add an invalid record. 
   *@param val - string rep. the name of invalid record array.
   */
   public void addInvalidRecord(String val) {
      invalidRecArr = Arrays.copyOf(invalidRecArr, invalidRecArr.length + 1);
      invalidRecArr[invalidRecArr.length - 1] = val; 
   }
   /**method will readFile. 
   *@param dataFile - string for file name
   @throws FileNotFoundException - throws if file not found 
   */
   public void readFile(String dataFile) throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(dataFile)); 
      while (scanFile.hasNext())
      {
         String line = scanFile.nextLine();
         Scanner scanNetwork = new Scanner(line);
         scanNetwork.useDelimiter(",");
         char firstChar = scanNetwork.next().charAt(0);
         String name = scanNetwork.next();
         double bandwidth = Double.parseDouble(scanNetwork.next());
         double monthlyCost = Double.parseDouble(scanNetwork.next());
         WirelessNetwork netObj;
         switch (firstChar) {
            case 'W':
               double modemCost = Double.parseDouble(scanNetwork.next());
               netObj = new WiFi(name, bandwidth, monthlyCost, modemCost);
               addWirelessNetwork(netObj);
               break; 
            case 'C':
               double time = Double.parseDouble(scanNetwork.next());
               double dataLimit = Double.parseDouble(scanNetwork.next());
               netObj = new Cellular(
                  name, bandwidth, monthlyCost, time, dataLimit);
               addWirelessNetwork(netObj);
               break;
            case 'L':
               double timeIn = Double.parseDouble(scanNetwork.next());
               double dataLimitIn = Double.parseDouble(scanNetwork.next());
               netObj = new LTE(
                  name, bandwidth, monthlyCost, timeIn, dataLimitIn);
               addWirelessNetwork(netObj);
               break;
            case 'F':
               double timeIns = Double.parseDouble(scanNetwork.next());
               double dataLimitIns = Double.parseDouble(scanNetwork.next());
               netObj = new FiveG(
                  name, bandwidth, monthlyCost, timeIns, dataLimitIns);
               addWirelessNetwork(netObj);
               break;
            default:
               addInvalidRecord(name);
               break; 
         }
      }
   }
   /**generates report based on original order read in. 
   *@return String - report that has been generated
   */
   public String generateReport() {
      String result = "";
      for (WirelessNetwork x : netArr) {
         
         result +=  x.toString() + "\n\n"; 
      }
      String output = "-------------------------------"
         + "\nMonthly Wireless Network Report\n"
         + "-------------------------------\n"
         + result;
      return output;
   }
   /**generates report based on the natural ordering.
   *@return String - report sorted and returned.
   */
   public String generateReportByName() {
      String result = "";
      String output;
      Arrays.sort(netArr);
      for (int i = 0; i < netArr.length; i++) {
         result += netArr[i] + "\n\n";
      }
      output = "-----------------------------------------"
            + "\nMonthly Wireless Network Report (by Name)\n"
            + "-----------------------------------------\n"
            + result;
      return output;
   }
   /**generates report based on the bandwidth. 
   *@return String - report sorted and generated
   */
   public String generateReportByBandwidth() {
      String result = "";
      String output;
      Arrays.sort(getWirelessNetworksArray(), new BandwidthComparator());
      for (int i = 0; i < netArr.length; i++) {
         result += netArr[i] + "\n\n";
      }
      output = "----------------------------------------------"
            + "\nMonthly Wireless Network Report (by Bandwidth)\n"
            + "----------------------------------------------\n"
            + result;
      return output;
   }
   /**generates report based on monthly cost.
   *@return String - report sorted by monthly cost
   */
   public String generateReportByMonthlyCost() {
      Arrays.sort(getWirelessNetworksArray(), new MonthlyCostComparator());
      String result = "";
      String output;
      for (int i = 0; i < netArr.length; i++) {
         result += netArr[i] + "\n\n";
      }
      output = "-------------------------------------------------"
            + "\nMonthly Wireless Network Report (by Monthly Cost)\n"
            + "-------------------------------------------------\n"
            + result;
      return output;
      
   }
}