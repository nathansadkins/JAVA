/**this class will inherit from OnlineTextForm
*and includes the authors name. 
*Nathan Adkins - COMP - 1210 
*/ 
public class OnlineBook extends OnlineTextItem { 
   protected String author; 
/**constructor. 
*@param nameIn - book name 
*@param priceIn - total price 
*/
   public OnlineBook(String nameIn, double priceIn) { 
      super(nameIn, priceIn); 
      author = "Author Not Listed";
   }
   /**general to string method.
   *@return String - general info
   */
   public String toString() { 
      return name + " - " + author + ": $" + calculateCost(); 
   }
   /**this method will set the authors name. 
   *@param nameIn - authors name
   */
   public void setAuthor(String nameIn) {
      author = nameIn;
   }
}