import java.text.DecimalFormat;
/** The IceCreamCone class has fields, a constructor, 
*and methods.
*Nathan Adkins COMP - 1210 - 001
*/
public class IceCreamCone {
   private String label = "";
   private double radius = 0;
   private double height = 0;
   /**The constructor sets the variables.
   *@param labelIn = input for label
   *@param radiusIn = input for radius 
   *@param heightIn = input for height 
   */
   public IceCreamCone(String labelIn, double radiusIn, double heightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setHeight(heightIn);
   }
   /**This method sets the label.
   *@param value = string for label
   *@return = boolean for if value was set  
   */
   public boolean setLabel(String value) {
      if (value == null) {
         return false;
      }
      else {
         label = value.trim(); 
         return true;
      }  
   }
   /**getLabel retrieves label. 
   *@return = string value for label 
   */
   public String getLabel() {
      return label;
   }
   /**getRadius retrives the radius.
   *@return = radius value 
   */
   public double getRadius() {
      return radius;
   }
   /**setRadius sets the radius value. 
   *@param value = radius value 
   *@return = boolean for if radius was set
   */
   public boolean setRadius(double value) {
      if (value > 0) {
         radius = value; 
         return true;
      }
      else {
         return false;
      }
   }
   /**getHeight gets height value. 
   *@return height = height value 
   */
   public double getHeight() {
      return height;
   }
   /** setHeight sets the height value.
   *@param value = height value 
   @return = boolean for if height was set along with assigning height 
   */
   public boolean setHeight(double value) {
      if (value > 0) {
         height = value;
         return true;
      }
      else {
         return false;
      }
   }
   /**calculates surface area.
   *@return = double for total surface area 
   */
   public double surfaceArea() {
      double surfaceAreaSphere = 2 * Math.PI * (Math.pow(radius, 2)); 
      double surfaceAreaCone = Math.PI * radius 
         * (Math.sqrt((Math.pow(height, 2)) + (Math.pow(radius, 2))));
      double totalSurfaceArea = surfaceAreaSphere + surfaceAreaCone;
      return totalSurfaceArea;
   }
   /**calculates total volume.
   @return = double for volume 
   */
   public double volume() {
      double sphereVolume = (2.0 / 3.0) * Math.PI * (Math.pow(radius, 3));
      double coneVolume = Math.PI * (Math.pow(radius, 2)) * (height / 3);
      double volume = (sphereVolume + coneVolume); 
      return volume;
   }
   /**print statement for all variables and calculations. 
   *@return = the string to be printed 
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0######");
      String statement = "";
      statement = "IceCreamCone " 
         + "\"" 
         + getLabel() 
         + "\"" 
         + " with radius = " 
         + df.format(radius) 
         + " and height = " 
         + df.format(height) 
         + " units has:" 
         + "\n"  
         + "\tsurface area = "  
         + df.format(surfaceArea()) 
         + " square units" 
         + "\n" 
         + "\tvolume = " 
         + df.format(volume()) 
         + " cubic units";
      return statement;
   }
}
