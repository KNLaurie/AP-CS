/**
 * Calculate fines of overdue books for CSA Meda Center
 *
 * @author Kaitlyn Laurie
 * @version 10/13/2019
 */

import java.util.Scanner;
public class Fines
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //initialize Scanner
        
        //Take in user information
        System.out.print("Enter name (Last, First) and Social Security Number (###-##-####): ");
        String userId = in.next();
        userId += in.nextLine();
        
        //Get title of overdue book
        System.out.print("Enter the title of the book: ");
        String bookTitle = in.next();
        bookTitle += in.nextLine();
        
        //Enter date checked out
        System.out.print("Enter date checked out: ");
        String checkoutDate = in.next(); 
        
        //Get how many days late
        System.out.print("Days late: ");
        String daysLate = in.next();
        
        //Enter Daily fine
        System.out.print("Daily fine: ");
        String dailyFine = in.next();
        
        //Calcualte overdue fee
        double overdueFee = Double.parseDouble(dailyFine) * Integer.parseInt(daysLate);
        
        //Separate name and generate account name
        String userName = userId.substring(0, userId.lastIndexOf(" "));
        String accountName = userName.substring(0, userName.indexOf(",")) + userName.substring(userName.indexOf(" ") + 1, userName.indexOf(" ") + 3) + userId.substring(userId.lastIndexOf("-"));
        
        //Generate overdue notice
        System.out.println("To: " + userName + "\t\tAccount: " + accountName);
        
        System.out.print("From: ");
        String senderName = in.next();
        
        System.out.println("Subject: Overdue Notice \n\n");
        System.out.println(bookTitle + " was checked out on: " + checkoutDate);
        System.out.println("This book is currently " + daysLate + " days late.");
        System.out.print("Your fine has accumulated to: " + overdueFee);
        
        
        

        
        
        
    }    
    

}
