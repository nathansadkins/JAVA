import java.util.Scanner;
/**This program solves for a specified
*formula after reading input values for x, y, and z. 
*
*Nathan Adkins COMP - 1210 - 001 
*9/5/19
*/
public class Formula
{
/**input values of type double for x, y, and z 
*and solves for the result of the formula. 
*@param args - Standard commandline arguments (not used)
*/
   public static void main(String[] args) 
   {
      Scanner userInput = new Scanner(System.in);
      double result = 0;
      double x = 0;
      double y = 0;
      double z = 0;
      System.out.println("result = (3x + 10.5) (2y + 7.5) (z + 5.5) / xyz");
      System.out.print("\tEnter x: "); 
      x = userInput.nextDouble(); 
      System.out.print("\tEnter y: "); 
      y = userInput.nextDouble(); 
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble(); 
      if (x * y * z == 0) {
         result = 0;
      }
      else {
         result = ((3 * x + 10.5) * (2 * y + 7.5) * (z + 5.5)) / (x * y * z);
      }
      System.out.print("result = ");
      System.out.print(result);
   }
     
}
