import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

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
      return 
         listName;
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
   public ArrayList<IceCreamCone> getList() {
      return iceCreamObjects;
   }
   /**this method will read the file containing 
   *the iceCreamCone objects.
   *@return ArrayList<IceCreamCone> - array of cones 
   *@param fileName - the file name of data 
   *@throws FileNotFoundException - file not found
   */
   public IceCreamConeList readFile(String fileName) 
                  throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileName));
      listName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         String labelIn = scanFile.nextLine();
         double heightIn = Double.parseDouble(scanFile.nextLine());
         double radiusIn = Double.parseDouble(scanFile.nextLine());
         IceCreamCone cone = new IceCreamCone(labelIn, heightIn, radiusIn);
         iceCreamObjects.add(cone);
      }
      IceCreamConeList newConeList = new IceCreamConeList(listName, 
         iceCreamObjects);
      return newConeList;
      
   }
   /**this method adds an icecreamcone.
   *@param label - ice cream cone label 
   *@param radius - ice cream cone radius
   *@param height - ice cream cone height 
   */
   public void addIceCreamCone(String label, double radius, double height) {
      IceCreamCone cone = new IceCreamCone(label, radius, height);
      iceCreamObjects.add(cone);
   }
   /**this method will find and return a specific ice cream cone.
   *@param label - the label of the ice cream cone to be found 
   *@return - specific ice cream cone object
   */
   public IceCreamCone findIceCreamCone(String label) {
      for (int i = 0; i < iceCreamObjects.size(); i++) {
         String iceCreamLabel = iceCreamObjects.get(i).getLabel();
         if (iceCreamLabel.equalsIgnoreCase(label)) {
            return iceCreamObjects.get(i);
         }
      }
      return null; 
   }
   /**this method will delete a specific ice cream cone.
   *@return - returns the deleted ice cream cone 
   *@param label - label of the ice cream cone to be deleted
   */
   public IceCreamCone deleteIceCreamCone(String label) {
      IceCreamCone coneDelete = findIceCreamCone(label); 
      if (coneDelete != null) {
         iceCreamObjects.remove(coneDelete);
         return coneDelete;
      }
      else {
         return null;
      } 
   }
   /**this method will edit an ice cream cone.
   *@param label - label of ice cream cone to be edited
   *@param radius - the new radius of ice cream cone
   *@param height - the new height of ice cream cone 
   *@return boolean - true if ice cream cone is found and changed
   *otherwise false
   */
   public boolean editIceCreamCone(String label, double radius, double height) {
      IceCreamCone editCone = findIceCreamCone(label);
      if (editCone != null) {
         editCone.setRadius(radius);
         editCone.setHeight(height);
         return true;
      }
      return false;
   }
   /**string method.
   *@return String - string of data about objects 
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
      result += "----- Summary for " +  getName() + " -----";
      result += "\nNumber of IceCreamCone Objects: " + numberOfIceCreamCones();
      result += "\nTotal Surface Area: " + fmt.format(totalSurfaceArea());
      result += "\nTotal Volume: " + fmt.format(totalVolume());
      result += "\nAverage Surface Area: " + fmt.format(averageSurfaceArea());
      result += "\nAverage Volume: " + fmt.format(averageVolume());
      return result; 
   }
}