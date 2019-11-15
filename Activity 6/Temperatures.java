import java.util.ArrayList;
/**This class holds a set of integer
*values representing daily temps.
*
*Nathan Adkins-COMP 1210-001
*/
public class Temperatures {
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   /**constructor takes arraylist of temp.
   *@param temperaturesIn - list of temps 
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   /**returns low temp.
   *@return - int for low temp
   */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
/**returns high temp.
*@return - int for high temp
*/
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
/**returns lower minimum.
*@return - int for high temp
*@param lowIn 
*/ 
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
/**returns higher max.
*@return - int for higher max
*@param highIn - high temp 
*/
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
/**string representing number info.
*@return - string with number info
*/
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}