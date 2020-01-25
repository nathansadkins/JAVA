/**class contains methods to perform division.
*Nathan Adkins - COMP 1210
*/
public class Division {
/**integer division.
*@param numerator - number for numerator
*@param denomitator - number for denominator
*@return int - divison result
*/
   public static int intDivide(int numerator, int denomitator) {
      try {
         return numerator / denomitator; 
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   /**decimal division. 
   *@param numerator - number for numerator
   *@param denominator - number for denominator
   *@return float - division result
   */
   public static float decimalDivide(int numerator, int denominator) {
      float num = numerator; 
      float denom = denominator; 
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero");
      }
      return num / denom;
   }
}