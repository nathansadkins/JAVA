/**This class contains subclasses that inherit
*from OnlineTextItem. 
*Nathan Adkins - COMP - 1210 
*/ 
public class OnlineArticle extends OnlineTextItem { 
   private int wordCount; 
   /**constructor. 
   *@param nameIn - customers name
   *@param priceIn - price of item 
   */
   public OnlineArticle(String nameIn, double priceIn) { 
      super(nameIn, priceIn); 
      wordCount = 0; 
   }
   /**method will set the word count. 
   *@param wordCountIn - int representing word count 
   */
   public void setWordCount(int wordCountIn) { 
      wordCount = wordCountIn; 
   }
}