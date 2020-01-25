/**class wifi is derived form wireless network. 
*Nathan Adkins - COMP - 1210 
*/ 
public class WiFi extends WirelessNetwork {
   private double modemCost;
   /**constructor.
   *@param nameIn - string for name 
   *@param bandwidthIn - bandwidth cost
   *@param monthlyCostIn - monthly cost
   *@param modemCostIn - modem cost 
   */
   public WiFi(String nameIn, double bandwidthIn, 
      double monthlyCostIn, double modemCostIn) {
      super(nameIn, bandwidthIn, monthlyCostIn);
      modemCost = modemCostIn;
   }
   /**method gets the modemCost.
   *@return double - modem cost 
   */
   public double getModemCost() {
      return modemCost;
   }
   /**sets the modem cost.
   *@param modemIn - modem cost in 
   */
   public void setModemCost(double modemIn) {
      modemCost = modemIn;
   }
   /**method calculates the monthly cost. 
   *@return double - monthly cost 
   */
   public double monthlyCost() { 
      return monthlyFixedCost + modemCost;
     
   }
   
}