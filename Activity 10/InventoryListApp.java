/**class InventoryApp will act as the driver class 
*and main method. 
*Nathan Adkins - COMP - 1210 
*/ 
public class InventoryListApp { 
/**main driver for all classes. 
*@param args - not used
*/
   public static void main(String[] args) {
      InventoryItem.setTaxRate(0.05); 
      ItemsList myItems = new ItemsList();
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10)); 
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      System.out.print(myItems);
      System.out.println("\nTotal: " + myItems.calculateTotal(2.0));
   }
}