import java.util.Scanner;
import java.text.DecimalFormat;
/**This program is to accept coded footbal ticket information
*as input that includes the ticket price, discount, time, date,
*section, row, seat, followed by the description of the game.
*
*Nathan Adkins - COMP - 1210 - 0001 
*9/11/19
*/
public class TicketDecoder {
/**user inputs ticket code.
*@param args Command line arguments - not used
*/ 
   public static void main(String [] args) {
      String ticketCode = "";
      String game = "";
      String date = "";
      String month = "";
      String day = "";
      String year = ""; 
      String time = "";
      String hour = "";
      String minute = "";
      String section = "";
      String row = "";
      String seat = "";
      String price = "";
      String discount = "";
      double cost = 0;
      double prizeNumber = 0;
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter your ticket code: ");
      ticketCode = userInput.nextLine();
      if (ticketCode.length() < 26) {
         System.out.println();
         System.out.println("Invalid Ticket Code.");
         System.out.println("Ticket code must have at least "
            + "26 characters.");
      } 
      else {
         ticketCode = ticketCode.trim();
         game = ticketCode.substring(25, ticketCode.length()); 
         System.out.println();
         System.out.print("Game: ");
         System.out.print(game);
         System.out.print("   Date: ");
         date = ticketCode.substring(11, 19);
         month = date.substring(0, 2);
         day = date.substring(2, 4);
         year = date.substring(4, 8);
         System.out.print(month + "/" + day + "/" + year);
         time = ticketCode.substring(7, 11);
         hour = time.substring(0, 2);
         minute = time.substring(2, 4);
         System.out.print("   Time: ");
         System.out.println(hour + ":" + minute); 
         section = ticketCode.substring(19, 21);
         row = ticketCode.substring(21, 23);
         seat = ticketCode.substring(23, 25);
         System.out.print("Section: ");
         System.out.print(section);
         System.out.print("   Row: ");
         System.out.print(row);
         System.out.print("   Seat: ");
         System.out.println(seat); 
         DecimalFormat df = new DecimalFormat("$#,##0.00");
         price = ticketCode.substring(0, 3);
         double dPrice = Double.parseDouble(price); 
         System.out.print("Price: ");
         System.out.print(df.format(dPrice));
         DecimalFormat sf = new DecimalFormat("0%");
         discount = ticketCode.substring(5, 7);
         double dDiscount = Double.parseDouble(discount);
         dDiscount = dDiscount / 100;
         System.out.print("   Discount: ");
         System.out.print(sf.format(dDiscount));
         System.out.print("   Cost: ");
         cost = dPrice - (dPrice * dDiscount); 
         System.out.println(df.format(cost));
         System.out.print("Prize Number: ");
         DecimalFormat ls = new DecimalFormat("000000");
         prizeNumber = Math.random();
         String number = Double.toString(prizeNumber);
         System.out.print(number.substring(2, 9)); 
      }
   }
}