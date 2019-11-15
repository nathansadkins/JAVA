/**This class will act as the customer.
*for the bank loan class
*
*Nathan Adkins - COMP 
*/ 
public class Customer implements Comparable<Customer> { 
   private String name, location; 
   private double balance;
/**this is the constructor.
*@param nameIn = customer name
*/ 
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   /**this method compares to customers. 
   *@return int - reference number
   *@param obj - object of type Customer
   */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
   /**the method will set the location.
   *@param locationIn - location of the customer
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**gives the customer an option to input
   *city and state.
   *@param city - customers city 
   *@param state - customers state
   */
   public void setLocation(String city, String state) { 
      location = city + ", " + state; 
   }
   /**this method will change the balance.
   *@param amount - amount to be added 
   */
   public void changeBalance(double amount) { 
      balance += amount; 
   }
   /**this method will get the location of 
   the customer.
   *@return string for customer location 
   */
   public String getLocation() {
      return location; 
   }
   /**this method will get the customer's balance.
   *@return double of customer's balance 
   */ 
   public double getBalance() {
      return balance; 
   }
   /**this is the string method.
   *@return - string of customer info 
   */ 
   public String toString() {
      String output = name + "\n" 
         + getLocation() + "\n"
         + "$" + getBalance();
      return output;
   }
}