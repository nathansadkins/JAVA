/**Class ItemsList will hold an array of 
*inventoryItem objects. 
*Nathan Adkins - COMP - 1210
*/
public class ItemsList { 
   private InventoryItem[] inventory; 
   private int count;
   /**constructor.*/ 
   public ItemsList() { 
      inventory = new InventoryItem[20];
      
   }
   /**class addItem will add an item 
   *to the inventory. 
   *@param itemIn - item to be added
   */
   public void addItem(InventoryItem itemIn) { 
      inventory[count] = itemIn;
      count++;
   }
   /**class calculateTotal will calculate the 
   *total cost of the inventory. 
   *@param electronicsSurcharge 
   *@return double - cost
   */ 
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) { 
         if (inventory[i] instanceof ElectronicsItem) { 
            total += inventory[i].calculateCost() + electronicsSurcharge; 
         }
         else {
            total += inventory[i].calculateCost(); 
         }
      }
      return total;
   }
   /**general toString method. 
   *@return String
   */
   public String toString() { 
      String output = "All inventory: \n\n";
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }
   
}