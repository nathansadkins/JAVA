import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
/**
* This program  prints out a cone list.
* COMP 1210 
* 
* Nathan Adkins
*/
public class IceCreamConeListApp
{

/**
* This method prints out a cone list.
* @param args Command line (not used).
* @throws FileNotFoundException for scanning file title.
*/
   public static void main(String[] args) throws FileNotFoundException
   {
      double heightIn = 0;
      double radiusIn = 0;
      String listName = "";
      String labelIn = "";
   
      
      ArrayList<IceCreamCone> listOfCones = new ArrayList<IceCreamCone>();
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      System.out.print("\n");
      
      Scanner scanFile = new Scanner(new File(fileName));
   
      listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         labelIn = scanFile.nextLine();
         heightIn = Double.parseDouble(scanFile.nextLine());
         radiusIn = Double.parseDouble(scanFile.nextLine());
         
         IceCreamCone newCone = new IceCreamCone(labelIn, heightIn, radiusIn);
         listOfCones.add(newCone);           
      }
      
      IceCreamConeList coneList1 = new IceCreamConeList(listName, listOfCones);
      
      System.out.println(coneList1.toString());
      System.out.print("\n");
      System.out.println(coneList1.summaryInfo());
    
   }
}