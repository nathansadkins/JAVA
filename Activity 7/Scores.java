/**This class will preform various calculations on 
*an array of numbers.
*
*Nathan Adkins -- COMP - 1210 - 001 
*
*/
public class Scores { 
   private int[] numbers;
   /**This method contains a contructor.
   *@param numbersIn - an array full of 
   *ints
   */
   public Scores(int[] numbersIn) {
      numbers = numbersIn; 
   }
   /**This method will find all even numbers in the 
   *array. 
   *@return int[] - an array of even ints
   */
   public int[] findEvens() {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      } 
      int[] evens = new int[numberEvens];
      int count = 0; 
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   /**This method will find all odd numbers in the 
   *array.
   *@return int[] - an array of odd ints
   */
   public int[] findOdds() {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberEvens++;
         }
      } 
      int[] evens = new int[numberEvens];
      int count = 0; 
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   /**This method will calculate the average of the 
   *array.
   *@return double - represents average of array
   */
   public double calculateAverage() {
      int sum = 0; 
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      double sumArr = (sum  / numbers.length); 
      return sumArr; 
      
   }
   /**This method will print a string full of information
   *about the array.
   *@return String - string full of info 
   */
   public String toString() {
      String result = ""; 
      for (int i = 0; i < numbers.length; i++) { 
         result += numbers[i] + "\t";
      }
      return result;
   }
   /**This method will print the string in reverse.
   *@return String - string full of info in reverse
   */
   public String toStringInReverse() { 
      String result = ""; 
      for (int i = numbers.length - 1; i >= 0; i--) { 
         result += numbers[i] + "\t";
      }
      return result;
   } 
}