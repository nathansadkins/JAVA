import java.util.Comparator;
/**compares two objects based on monthly cost. 
*Nathan Adkins - COMP 1210 
*/
public class MonthlyCostComparator implements Comparator<WirelessNetwork> {
/**compares to wireless networks objects. 
*@param n1 - network 1 
*@param n2 - network 2
*@return int - comparison value
*/
   public int compare(WirelessNetwork n1, WirelessNetwork n2) {
      if (n1.monthlyCost() > n2.monthlyCost()) { 
         return -1; 
      }
      else if (n1.monthlyCost() < n2.monthlyCost()) {
         return 1; 
      } 
      else { 
         return 0; 
      }
   }
}