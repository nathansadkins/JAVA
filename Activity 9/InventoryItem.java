/**Class inventoryItem represents an inventory 
*item in a store.
*Nathan Adkins - COMP 1210 
*/ 
public class InventoryItem { 
   protected String name; 
   protected double price;
   private static double taxRate = 0;
/**Constructor for InventoryItem.
*@param nameIn - name of customer
*@param priceIn - price of item 
*/ 
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn; 
      price = priceIn;
   } 
 /**This method returns the customer name. 
 *@return String - customers name*/ 
   public String getName() {
      return name; 
   }
/**This method will calculate the cost of 
*an item. 
*@return double - cost of item 
*/ 
   public double calculateCost() {
      return price * (1 + taxRate);
   }
/**This method will set the tax rate. 
*@param taxRateIn - tax rate wanted 
*/ 
   public static void setTaxRate(double taxRateIn) { 
      taxRate = taxRateIn; 
   }
/**general toString method.
*@return String - user info
*/
   public String toString() { 
      return name + ": $" + calculateCost(); 
   }
}