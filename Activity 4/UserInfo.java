/**
*This program retrieves user info.
*Nathan Adkins - COMP 1210 - 001
*9/15/19
*/
public class UserInfo {
/**This class declares instance variables. 
*/
   //instance variable 
   private String firstName = "";
   private String lastName = "";
   private String location = "";
   private int age = 0;
   private int status = 0;
   private static final int OFFLINE = 0, ONLINE = 1; 
   //constructor
   /**This section is comprised of constructors.
    *@param firstNameIn A string of data
    *@param lastNameIn A string of data 
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified"; 
      age = 0;
      status = OFFLINE;
   }
   //methods
   /**This section concotates strings. 
   *@return output a string of data
   */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: "; 
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output; 
   }
   /**This section is comprised of constructors.
    *@param locationIn A string of data
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**This section is comprised of constructors.
    *@return ageIn - age value
    *@param ageIn - age value
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false; 
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**@return age - age number 
    */
   public int getAge() {
      return age; 
   }
   /**@return location - location data
   */
   public String getLocation() {
      return location;
   }
   /**declares status.
   */
   public void logOff() {
      status = OFFLINE; 
   }
   /**declares status. 
   */
   public void logOn() {
      status = ONLINE;
   }
   
   
}
