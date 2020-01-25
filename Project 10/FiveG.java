/**the 5G class is derived from celluar. 
*Nathan Adkins - COMP - 1210 
*/
public class FiveG extends Cellular { 
/**final cost factor value.*/
   public static final double COST_FACTOR = 5.0;
/**constructor. 
*@param nameIn - name 
*@param bandwidthIn - bandwidth 
*@param timeIn - time in 
*@param dataIn - data cap
*@param monthlyFixedIn - monthly cost*/
   public FiveG(String nameIn, double bandwidthIn, 
      double monthlyFixedIn, double timeIn, double dataIn) {
      super(nameIn, bandwidthIn, monthlyFixedIn, timeIn, dataIn);
   } 
/**calculates the monthly cost.
*@return double - monthly cost 
*/
   public double monthlyCost() {
      double val; 
      if (dataUsage() <= getDataLimit()) {
         return monthlyFixedCost; 
      }
      else {
         val = (monthlyFixedCost + (dataUsage() - dataLimit) 
            * FiveG.COST_FACTOR * 3);
         return val;  
      }
   }
}