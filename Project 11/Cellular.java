/**class celluar extends form WirelessNetwork.
*Nathan Adkins - COMP - 1210 
*/
public class Cellular extends WirelessNetwork { 
   protected double time; 
   protected double dataLimit; 
   /**final var for cost factor. */
   public static final double COST_FACTOR = 1.0; 
   /**constructor.
   *@param nameIn - name 
   *@param bandwidthIn - bandwidth 
   *@param timeIn - time in 
   *@param dataLimitIn - data cap
   *@param monthlyCostIn - monthly cost
   */
   public Cellular(String nameIn, double bandwidthIn, 
      double monthlyCostIn, double timeIn, double dataLimitIn) {
      super(nameIn, bandwidthIn, monthlyCostIn);
      time = timeIn; 
      dataLimit = dataLimitIn; 
   }
   /**method will get time value. 
   *@return double - time 
   */
   public double getTime() {
      return time; 
   }
   /**method will set time value. 
   *@param timeIn - time value
   */
   public void setTime(double timeIn) { 
      time = timeIn; 
   }
   /**method will get dataLimit.
   @return double - dataLimit
   */
   public double getDataLimit() {
      return dataLimit;
   }
   /**method will set the data cap. 
   *@param dataIn - data value 
   */
   public void setDataLimit(double dataIn) {
      dataLimit = dataIn; 
   }
   /**method will calculate the data usage.
   *@return double - data usage
   */
   public double dataUsage() {
      double val = (bandwidth / 8000) * time; 
      return val; 
   }
   /**method will find the monthly cost. 
   *@return double - monthly cost
   */
   public double monthlyCost() { 
      if (dataUsage() <= dataLimit) {
         return monthlyFixedCost;
      }
      else {
         return (monthlyFixedCost + (dataUsage() - dataLimit) 
            * Cellular.COST_FACTOR);
      }
   }
   /**general to string method. 
   *@return String - info 
   */
   public String toString() { 
      String output = super.toString() 
         + "\nTime: " + getTime() + " seconds"
         + "\nData Limit: "
         + getDataLimit() + " GB\n"
         + "Data Used: " + dataUsage() + " GB";
      return output; 
   }
}