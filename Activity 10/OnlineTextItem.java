/**this class represents an online text item.
*that users can buy 
*Nathan Adkins - COMP - 1210 
*/ 
public abstract class OnlineTextItem extends InventoryItem { 
/**constructor. 
*@param nameIn - customers name 
*@param priceIn - price of item 
*/ 
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn); 
   }
   /**overrides calculate cost method. 
   *@return double - total cost
   */
   public double calculateCost() { 
      return price; 
   }

}