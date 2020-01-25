import java.text.DecimalFormat;
/**WirelessNetwork class is an abstract class that 
*stored wireless network data and provides methods to 
*access the data. 
*Nathan Adkins - COMP 1210 
*/ 
public abstract class WirelessNetwork implements Comparable<WirelessNetwork> { 
   protected String name; 
   protected double bandwidth; 
   protected double monthlyFixedCost = 0; 
   protected static int count = 0; 
   /**contructor. 
   @param nameIn - network name 
   @param bandwidthIn - bandwidth double 
   @param monthlyIn - fixed payment 
   */
   public WirelessNetwork(
      String nameIn, double bandwidthIn, double monthlyIn) { 
      name = nameIn;
      bandwidth = bandwidthIn; 
      monthlyFixedCost = monthlyIn;
      count++;
   }
   /**method will return 
   the name. 
   *@return String - name 
   */
   public String getName() {
      return name; 
   }
   /**comparision method. 
   *@return int - comparison value 
   *@param network - String representing network name 
   */
   public int compareTo(WirelessNetwork network) {
      return this.getName().toLowerCase().
         compareTo(network.getName().toLowerCase()); 
   }
   /**method will set the 
   *name. 
   *@param nameIn - string rep. name 
   */ 
   public void setName(String nameIn) { 
      name = nameIn;
   }
   /**method will return the bandwidth.
   *@return double - bandwidth
   */
   public double getBandwidth() { 
      return bandwidth; 
   }
   /**method will set the bandwidth. 
   *@param bandIn - bandwidth in
   */
   public void setBandwidth(double bandIn) { 
      bandwidth = bandIn; 
   }
   /**method will return monthly cost. 
   *@return double - monthly cost 
   */
   public double getMonthlyFixedCost() { 
      return monthlyFixedCost;
   }
   /**method will set the monthly cost. 
   *@param monthlyIn - monthly cost
   */
   public void setMonthlyFixedCost(double monthlyIn) {
      monthlyFixedCost = monthlyIn; 
   }
   /**method will get the count variable. 
   *@return int - count var
   */
   public static int getCount() { 
      return count; 
   }
   /**method will reset the count var. 
   */
   public static void resetCount() {
      count = 0; 
   }
   /**general to string.
   *@return String - info 
   */
   public String toString() {
      DecimalFormat d = new DecimalFormat("$#,##0.00");
      String output = getName() + " (class " 
         + this.getClass().getName() + ") Cost: " 
         + d.format(monthlyCost()) + "\n" + "Bandwidth: "
         + getBandwidth() + " Mbps";
      return output;
   }
   /**returns the montlyCost. 
   *@return double - monthly cost
   */
   public abstract double monthlyCost();
}