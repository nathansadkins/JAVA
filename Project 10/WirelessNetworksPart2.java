import java.io.FileNotFoundException;
/**contains the main method and drives the program as a whole. 
*Nathan Adkins - COMP 1210
*/
public class WirelessNetworksPart2 {
/**contains main method. 
*@param args - not used
*@throws FileNotFoundException - when file is not found
*/
   public static void main(String[] args) throws FileNotFoundException  {
      try {
         if (args.length > 0) {
            String fileName = args[0];
            WirelessNetworkList netList = new WirelessNetworkList();
            netList.readFile(fileName);
            System.out.println(netList.generateReport());
            System.out.println(netList.generateReportByName());
            System.out.println(netList.generateReportByBandwidth());
            System.out.println(netList.generateReportByMonthlyCost());
         }
      }
      catch (FileNotFoundException exception) {
         System.out.println("File name expected as command "
            + "line argument.\n Program ending.");
      }
   }
}