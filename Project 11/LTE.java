/**the LTE class is derived from cellular. 
*Nathan Adkins - COMP - 1210
*/
public class LTE extends Cellular {
/**static final for cost factor.*/
   public static final double COST_FACTOR = 4.0;
/**constructor. 
*@param nameIn - name 
*@param bandwidthIn - bandwidth 
*@param timeIn - time in 
*@param dataIn - data cap
*@param monthlyFixedIn - monthly cost
*/
   public LTE(String nameIn, double bandwidthIn, 
      double monthlyFixedIn, double timeIn, double dataIn) {
      super(nameIn, bandwidthIn, monthlyFixedIn, timeIn, dataIn);
   } 
  /**this method will calculate the monthly cost. 
  *@return double - monthly cost 
  */
   public double monthlyCost() { 
      double val; 
      if (dataUsage() <= getDataLimit()) {
         val = monthlyFixedCost;
         return val; 
      }
      else {
         val = (monthlyFixedCost + (dataUsage() - dataLimit) 
            * LTE.COST_FACTOR * 2);
         return val;  
      }
   }

}