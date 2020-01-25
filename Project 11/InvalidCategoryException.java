/**this class is designed to throw an error for 
*invalid category.
*Nathan Adkins COMP - 1210
*/
public class InvalidCategoryException extends Exception {
/**constructor. 
*@param categoryIn - a string rep. category name. 
*/
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}