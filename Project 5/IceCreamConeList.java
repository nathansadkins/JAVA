import java.util.ArrayList;
import java.text.DecimalFormat;
/**This class stores the name of the 
*the list and an arraylist of icecream cone
*object. 
*Nathan Adkins 
*/
public class IceCreamConeList {
   private String listName = "";
   private ArrayList<IceCreamCone> iceCreamObjects;
/**constructor.
*@param value - value
*@param param - object value
*/
   public IceCreamConeList(String value, ArrayList<IceCreamCone> param) {
      listName = value;
      iceCreamObjects = param;
   }
   /**returns string representing name of list. 
   *@return - list name 
   */
   public String getName() {
      return listName;
   }
   /**returns number of ice cream cones.
   *@return - number of ice cream cones
   */
   public int numberOfIceCreamCones() {
      if (iceCreamObjects.size() == 0) {
         return 0;
      }
      else {
         return iceCreamObjects.size();
      }
   }
   /**calculates total surface area.
   *@return - total surface area
   */
   public double totalSurfaceArea() {
      double sA = 0;
      if (iceCreamObjects.size() == 0) {
         return 0.0;
      }
      else {
         int i = 0;
         while (i < iceCreamObjects.size()) {
            sA += iceCreamObjects.get(i).surfaceArea();
            i++;
         }
         return sA;
      }
   }
   /**returns total volume.
   *@return - total volume
   */
   public double totalVolume() {
      double tV = 0;
      if (iceCreamObjects.size() == 0) {
         return 0;
      }
      else {
         int i = 0;
         while (i < iceCreamObjects.size()) {
            tV += iceCreamObjects.get(i).volume();
            i++;
         }
         return tV;
      }
   }
   /**calculates average surface area.
   *@return - average surface area
   */
   public double averageSurfaceArea() {
      double averageSurface = 0;
      if (totalSurfaceArea() > 0) {
         averageSurface = totalSurfaceArea() / iceCreamObjects.size();
         return averageSurface;
      }
      else {
         return 0;
      }
   }
   /**calculates average volume.
   *@return - averageVolume
   */
   public double averageVolume() {
      double averageVol = 0;
      if (totalVolume() > 0) {
         averageVol = totalVolume() / iceCreamObjects.size();
         return averageVol;
      }
      else {
         return 0;
      }
   }
   /**returns string of data.
   *@return - string 
   */
   public String toString() {
      String result = listName + "\n";
      int index = 0;
      while (index < iceCreamObjects.size()) {
         result += "\n" + iceCreamObjects.get(index) + "\n";
         index++;
      }
      return result;
   }
   /**returns string of summary.
   *@return - summary
   */
   public String summaryInfo()
   {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " +  listName + " -----";
      result += "\nNumber of IceCreamCone Objects: " + numberOfIceCreamCones();
      result += "\nTotal Surface Area: " + fmt.format(totalSurfaceArea());
      result += "\nTotal Volume: " + fmt.format(totalVolume());
      result += "\nAverage Surface Area: " + fmt.format(averageSurfaceArea());
      result += "\nAverage Volume: " + fmt.format(averageVolume());
      
      return result; 
   }
   
}