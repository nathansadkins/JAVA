import java.util.Scanner;
/**This program allows the user to enter
*an amount of oil in ounces, which must not 
*exceed 1 billion, and then displays the number 
*of barrels, gallons, quarts, and ounces.
*
*Nathan Adkins COMP - 1210 - 001 
*9/5/19
*/ 
public class OilUnits {
/**prompts user to enter the amount of oil
*in ounces.
*@param args - Standard commandline arguments (not used)
*/ 
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      int oilAmountOunces = 54321; 
      int barrels = 0;
      int gallons = 0;
      int quarts = 0; 
      int ounces = 0;
      int barrelRemainder = 0;
      int gallonRemainder = 0;
      int quartRemainder = 0;
      System.out.print("Enter amount of oil in ounces: ");
      oilAmountOunces = userInput.nextInt();
      if (oilAmountOunces >= 1000000000) {
         System.out.println("Amount must not exceed 1,000,000,000.");
      }
      else {  
         System.out.println("Oil amount in units:");
         System.out.print("\tBarrels: ");
         barrels = (oilAmountOunces) / (128 * 42);
         System.out.println(barrels);
         System.out.print("\tGallons: ");
         barrelRemainder = oilAmountOunces % 5376;
         gallons = ((barrelRemainder) / 128);
         System.out.println(gallons);
         gallonRemainder = barrelRemainder % 128;
         System.out.print("\tQuarts: ");
         quarts = gallonRemainder / 32;
         System.out.println(quarts);
         System.out.print("\tOunces: ");
         ounces = gallonRemainder % 32; 
         System.out.println(ounces);
         System.out.print(oilAmountOunces + " oz = (" 
            + barrels + " bl * 5376 oz) + (" + gallons 
            + " gal * 128 oz) + (" + quarts + " qt * 32 oz) + (" 
            + ounces + " oz)");
      }
   }
}