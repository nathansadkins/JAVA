import java.util.Comparator;
/**bandwidth comparator is used to compare bandwidths.*/
public class BandwidthComparator implements Comparator<WirelessNetwork> {
/**compare method.
*@return int - compare values 
*@param n1 - network 1
*@param n2 - network 2
*/
   public int compare(WirelessNetwork n1, WirelessNetwork n2) {
      if (n1.getBandwidth() < n2.getBandwidth()) { 
         return -1; 
      }
      else if (n1.getBandwidth() > n2.getBandwidth()) {
         return 1; 
      } 
      else { 
         return 0; 
      }
   }
}