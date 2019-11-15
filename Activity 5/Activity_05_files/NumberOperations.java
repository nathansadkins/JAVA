/**This class works with numbers.
*/
public class NumberOperations {
   private int number;
/**this is the constructor.
*@param numberIn - the number in
*/
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
 /**this method return the value of number. 
 *@return - number returned 
 */
   public int getValue() {
      return number;
   }
 /**this method return the data of odds.
 *@return - data of odds
 */ 
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   /**this method returns data.
   *@return - string of data 
   */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   /**this method determines what is greater.
   @param compareNumber - the number to be compared
   @return - if number is greater 
   */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1; 
      }
      else {
         return 0;
      }
   }
   /**string of message to user.
   *@return - string of data 
   */
   public String toString() {
      return number + "";
   }
}