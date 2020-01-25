/**Class electronicsItem inherits from InventoryItem.
*Nathan Adkins COMP - 1210 
*/
public class ElectronicsItem extends InventoryItem { 
/**instance variables.*/
   public static final double SHIPPING_COST = 1.5;
   protected double weight; 
/**Constructor for electronics Item.
*@param nameIn - customers name 
*@param priceIn - item price 
*@param weightIn - item weight 
*/
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) { 
      super(nameIn, priceIn);
      weight = weightIn; 
   }
   /**overrides the calculateCost method to take
   *into account shipping. 
   *@return double - total cost 
   */
   public double calculateCost() { 
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}