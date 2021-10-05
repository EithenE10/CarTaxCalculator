/*Assignment 2 - Software Development
Author: Eithen O'Neil
Start Date: 11/06/2021
Program to test the Java class I created called Car
*/
import java.util.*;

public class CarTester
{  
   public static void main(String args[])
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      String regNo, make, model, carreg;
      int emissions, year, engineSize, option;
      double value;

      //Create object using user inputted values
      System.out.println("Please enter your Car registration number:");
      regNo = keyboardIn.nextLine();
      System.out.println("Please enter your Car's make:");
      make = keyboardIn.nextLine();
      System.out.println("Please enter your Car's model:");
      model = keyboardIn.nextLine();
      
      //Create do while loops to let user reinput when invalid value
      do
      {
      System.out.println("Please enter your Car's engine size(between 0-9999):");
      engineSize = keyboardIn.nextInt();
      }
      while 
      (engineSize <= 0 || engineSize > 9999); 
      do
      {     
      System.out.println("Please enter your Car's emissions in g/km(between 0-999):");
      emissions = keyboardIn.nextInt();
      }
      while (emissions <=0);
      do
      {
      System.out.println("Please enter your Car's year:");
      year = keyboardIn.nextInt();
      }
      while (year > 2021 || year < 1900);
      do
      {
      System.out.println("Please enter your Car's value:");
      value = keyboardIn.nextDouble();
      }
      while (value < 0 || value > 1000000);
      
      //Create the car object with these values using Constructor 2
      Car car1 = new Car(regNo, make, model, engineSize, emissions, year, value);
      
      //Create a system menu with a switch for options
      do
      {
         System.out.println();
         System.out.println("1. Enter reg number to view all car details");
         System.out.println("2. Enter reg number to view make, model and price");
         System.out.println("3. Calculate road tax");
         System.out.println("4. Check NCT renewal date");
         System.out.println("5. Calculate loan repayments");
         System.out.println("0. Exit");
         System.out.print("Select your option please");
         option = keyboardIn.nextInt();
         
         switch(option)
         {
            case 1:
            keyboardIn.nextLine();
            System.out.println("Enter registration number:");
            regNo = keyboardIn.nextLine();
            if(regNo.equalsIgnoreCase(car1.getregNo()))
            {
            System.out.println(car1);
            }
            else
            {
            System.out.println("This car does not exist");
            }
            break;
            
            case 2:
            keyboardIn.nextLine();
            System.out.println("Enter registration number:");
            regNo = keyboardIn.nextLine();
            if(regNo.equalsIgnoreCase(car1.getregNo()))
            {
            System.out.println("Car Make: "+make+ "\nCar model: " +model+ "\nCar's value: " +value);
            }
            else
            {
            System.out.println("This car does not exist");
            }
            break;
            
            case 3:
            
            System.out.println("\nYour yearly Road Tax cost is: "+car1.getRoadTax());
            break;

            case 4:
            
            System.out.println("\nYear of car: "+year);
            car1.checkNCTDate();
            break; 
                            
            case 5:
            System.out.print("Please enter a loan term length up to a maximum of 60 months (5 years)");
            int months = keyboardIn.nextInt();
            //Pass this to the method
            car1.getcalculateRepayments(months);
            //Get back from the method
            System.out.println("\nYour monthly repayment with an interest of 4% on the loan amount inputted is: "+car1.getcalculateRepayments(months));
            break;
            
            case 0:
            System.out.println("Thank you for using our system!");
            break;
            default:
            System.out.println("Error - Invalid option selected - Please try again");
            
         }
      }while(option !=0);
   }
}





   

         
        
  
         
            
         
         
      
      
      

      
      
      
      
      
      
      
      
      
