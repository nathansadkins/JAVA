import java.io.FileNotFoundException;
/**main method, driver class. 
*Nathan Adkins - COMP 1210
*/
public class WirelessNetworksPart3 {
/**contains the main method. 
*@throws FileNotFoundException when file not found 
*@throws InvalidCategoryException when user picks invalid category
*@param args param arguments used
*/
   public static void main(String[] args) 
   {
      try {
         if (args.length > 0) {
            String fileName = args[0];
            WirelessNetworkList netList = new WirelessNetworkList();
            netList.readFile(fileName);
            System.out.print(netList.generateReport());
            System.out.print(netList.generateReportByName());
            System.out.print(netList.generateReportByBandwidth());
            System.out.print(netList.generateReportByMonthlyCost());
            System.out.print(netList.generateInvalidRecordsReport());
         }
         else {
            System.out.println("File name expected as command "
               + "line argument.\nProgram ending.");
         }
         
      }
      catch (FileNotFoundException exception) {
         System.out.println("*** Attempted to read file: "
            + args[0] + " (No such file or directory)");
      }
   }
}