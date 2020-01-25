import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
/**This class is the driver to create and 
*ice cream cone. 
*
*Nathan Adkins -- COMP - 1210 - 001
*10/11/19
*/
public class IceCreamConeListMenuApp {
/**This main method drives a switch statement
*to edit, create, and remove various ice cream
*cones. 
*@throws FileNotFoundException 
*@param args - argument 
*/
   public static void main(String[] args) throws FileNotFoundException {
      String labels = "";
      ArrayList<IceCreamCone> cone = new ArrayList<IceCreamCone>();
      IceCreamConeList coneList = new IceCreamConeList(labels, cone); 
      boolean cont = true;
      System.out.println("IceCreamCone List System Menu");
      System.out.println("R - Read File and Create IceCreamCone List");
      System.out.println("P - Print IceCreamCone List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add IceCreamCone");
      System.out.println("D - Delete IceCreamCone");
      System.out.println("F - Find IceCreamCone");
      System.out.println("E - Edit IceCreamCone");
      System.out.println("Q - Quit");
      Scanner input = new Scanner(System.in); 
      String userChoice;
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         userChoice = input.nextLine(); 
         userChoice = userChoice.toUpperCase();
         switch (userChoice) {
            case "R":
               System.out.print("\tFile Name: ");
               String fileName = input.nextLine();
               System.out.println("\tFile read in and IceCreamCone" 
                  + " List created");
               System.out.println();
               IceCreamConeList newList = coneList.readFile(fileName);
               break;
            case "P":
               System.out.print(coneList);
               System.out.println(); 
               break;
            case "S":
               System.out.println();
               System.out.print(coneList.summaryInfo());
               System.out.println();
               System.out.println();
               break;
            case "A":
               System.out.print("\tLabel: ");
               String labelIn = input.nextLine();
               System.out.print("\tRadius: ");
               double radiusIn = input.nextDouble();
               System.out.print("\tHeight: ");
               double heightIn = input.nextDouble(); 
               coneList.addIceCreamCone(labelIn, radiusIn, heightIn);
               System.out.println("\t*** IceCreamCone added ***");
               System.out.println();
               break;
            case "D":
               System.out.print("\tLabel: ");
               String labelIns = input.nextLine();
               IceCreamCone data = coneList.deleteIceCreamCone(labelIns);
               if (data == null) {
                  System.out.print("\t\"");
                  System.out.print(data.getLabel());
                  System.out.print("\"");
                  System.out.println(" not found");
                  System.out.println();
                  break;
               }
               else {
                  System.out.print("\t\"");
                  System.out.print(labelIns);
                  System.out.print("\"");
                  System.out.println(" deleted");
                  System.out.println();
                  break;
               }
            case "F":
               System.out.print("\tLabel: ");
               String findLabel = input.nextLine(); 
               IceCreamCone coneFound = coneList.findIceCreamCone(findLabel);
               if (coneFound == null) {
                  System.out.print("\t\"");
                  System.out.print(findLabel);
                  System.out.print("\"");
                  System.out.println(" not found");
                  System.out.println();
               }
               else {
                  System.out.print(coneFound);
                  System.out.println();
                  System.out.println();
               } 
               break; 
            case "E":
               System.out.print("\tLabel: ");
               labelIn = input.nextLine();
               System.out.print("\tRadius: ");
               radiusIn = input.nextDouble();
               System.out.print("\tHeight: ");
               heightIn = input.nextDouble();
               boolean isTrue;
               isTrue = coneList.editIceCreamCone(labelIn, radiusIn, heightIn);
               if (isTrue) { 
                  System.out.print("\t\"");
                  System.out.print(labelIn);
                  System.out.print("\"");
                  System.out.println(" successfully edited");
                  System.out.println();
                  break;
               }
               else {
                  System.out.print("\t\"");
                  System.out.print(labelIn);
                  System.out.print("\"");
                  System.out.println(" not found");
                  System.out.println();
                  break;
               }
            case "Q":
               cont = false; 
               break;
            default:
               System.out.println("\t*** invalid code ***");
               System.out.println();
            
         }
        
      }  while (!userChoice.equalsIgnoreCase("Q"));
   }
}
