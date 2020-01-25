import java.util.Scanner;
/**This class asks the user to input values for the ice cream cone. 
*
*Nathan Adkins 
*COMP - 1210 - 001 
*/
public class IceCreamConeApp {
/**Calls IceCreamCone and various other methods.
*@param args - not used 
*/
   public static void main(String[] args) {
      String labelIn = " ";
      double radiusIn = 0; 
      double heightIn = 0;
      System.out.println("Enter label, radius, and "
         + "height for an ice cream cone.");
      System.out.print("\tlabel: ");
      Scanner userInput = new Scanner(System.in);
      labelIn = userInput.nextLine();
      System.out.print("\tradius: ");
      radiusIn = userInput.nextDouble();
      if (radiusIn <= 0) {
         System.out.print("Error: radius must be greater than 0.");
         return;
      }
      System.out.print("\theight: ");
      heightIn = userInput.nextDouble();
      IceCreamCone ex1 = new IceCreamCone(labelIn, radiusIn, heightIn);
      if (heightIn <= 0) {
         System.out.print("Error: height must be greater than 0.");
         return;
      }
      System.out.print("\n" + ex1.toString()); 
   }
}