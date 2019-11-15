/**This class acts as a bank account. 
*Nathan Adkins
*Comp - 1210 - 001 
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   private static int loansCreated = 0; 

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   
/**This is the BankLoan constructor.
*@param customerNameIn - name of customer 
*@param interestRateIn - interest rate value
*/
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   /**This method will return if the amount is possible.
   *@return boolean - true if possible, false otherwise 
   *@param loanAmount - double of loan amount
   */
   public static boolean isAmountValid(double loanAmount) {
      boolean isTrue;
      if (loanAmount >= 0) { 
         isTrue = true;
      }
      else {
         isTrue = false; 
      }
      return isTrue; 
   }
   /**This method will return if the customer is in debt. 
   *@param param - BankLoan object 
   *@return boolean - true if in debt, otherwise false. 
   */ 
   public static boolean isInDebt(BankLoan param) {
      if (param.getBalance() > 0) { 
         return true; 
      }
      return false; 
   }
   /**The method will return how many loans have been created. 
   *@return int - integer of number of loans
   */ 
   public static int getLoansCreated() {
      return loansCreated; 
   }
   /**This method will reset the number of loans created. 
   *@return int - returns 0 
   */ 
   public static int resetLoansCreated() { 
      loansCreated = 0;
      return loansCreated;
   }
/**This method will allow a user to borrow from the bank.
*@param amount - the amount the user wishes to borrow 
*@return boolean - true if loan was made, otherwise false
*/ 
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
/**This method will allow the user to pay the bank.
*@param amountPaid - double represents the amount the user paid 
*@return double - new user balance
*/
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
  /**This method returns the users balance. 
  *@return double - user balance
  */ 
   public double getBalance() {
      return balance;
   }
   /**This method will set the interest rate for the user. 
   *@param interestRateIn - the double of new interest rate 
   *@return boolean - returns true if interest rate is valid 
   */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**This method will get the user's interest rate.
   *@return double - the users interest rate
   */
   public double getInterestRate() {
      return interestRate;
   }
   /**this method will charge additional interest to the user. 
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   /**Standard toString method. 
   *@return String - information about loan
   */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
