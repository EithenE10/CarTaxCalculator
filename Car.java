/*Assignment 2 - Software Development
Author: Eithen O'Neil
Start Date: 11/06/2021
Program to create a Java class for a Car
*/

public class Car
{
   //Add Instance Variables
   private String regNo;
   private String make;
   private String model;
   private String checkNCTDate;
   private int engineSize;
   private int emissions;
   private int year;
   private int months;
   private double value;
   private double calculateRepayments;
   private double interest;
   private double newvalue;
   private double calculateRoadTax;
   private double tax;
   private double monthlytax;
   
   
   
   //Add constructors
   
   //Constructor 1 - User default constructor
   public Car()    
   {
      regNo = "";
      make = "";
      model = "";
      engineSize = 0;
      emissions = 0;
      year = 0;
      value = 0.00;
   }
   
   //Constructor 2 - Accepts all car details
   public Car(String num, String carmake, String carmodel, int esize, int emiss, int caryear, double carvalue)
   {
      regNo = num;
      make = carmake;
      model = carmodel;
      engineSize = esize; 
      emissions = emiss;
      year = caryear;
      value = carvalue;
   }

   //Add Methods
   //Set Methods - Mutator Methods set all the values of the instance variables
   
   public void setregNo(String num)
   {
      regNo = num;
   }
   public void setmake(String carmake)
   {
      make = carmake;
   }
   public void setmodel(String carmodel)
   {
      model = carmodel;
   }
   public void setengineSize(int esize)
   {
      engineSize = esize;
   }
   public void setemissions(int emiss)
   {
      emissions = emiss;
   }
   public void setyear(int caryear)
   {
      year = caryear;
   }
   public void setvalue(int carvalue)
   {
      value = carvalue;
   }
   
  
  
   //Get methods - Accessor methods - Return the value of the instance variables
  
   public String getregNo()
   {
      return regNo;
   }
   
   public String getmake()
   {
      return make;
   }
   
   public String getmodel()
   {
      return model;
   }
   
   public double getenginesize()
   {
      return engineSize;
   }
   
   public int getemissions()
   {
      return emissions;
   }
   
   public int getyear()
   {
      return year;
   }
   
   public double getvalue()
   {
      return value;
   }
   

   //Method 1. Calculate the Loan Repayments by month
      public double getcalculateRepayments(int months)
      {
         interest = value * 0.04;
         newvalue = value + interest;
         calculateRepayments = newvalue / months;
         return calculateRepayments;
      }
   
  // Method 2 - Calculate the Road Tax
      public double getRoadTax()
      {
      
      if(year <= 1991)
      {
         tax = 0.00;
      }
      
      else
         {
         
         if (year >= 2008)

         if(emissions <= 0)
         {
            tax = 120.00;
         }
         else if(emissions >=1 && emissions <=80)
         {
            tax = 170.00;
         }
         else if(emissions >=81 && emissions <=120)
         {
            tax = 180.00;
         }
         else if(emissions >=121 && emissions <=140)
         {
            tax = 270.00;
         }
         else if(emissions >=141 && emissions <=170)
         {
            tax = 400.00;
         }
         else if(emissions >=171 && emissions <=225)
         {
            tax = 790.00;
         }
         else if(emissions >=226)
         {
            tax = 1250.00;
         }
         
         if (year <=2007)
           
         if(engineSize >=0 && engineSize <=1000)
         {
            tax = 200.00;
         }
         else if(engineSize >=1001 && engineSize <=1400)
         {
            tax = 350.00;
         }
         else if(engineSize >=1401 && engineSize <=1700)
         {
            tax = 500.00;
         }
         else if(engineSize >=1701 && engineSize <=2000)
         {
            tax = 650.00;
         }
         else if(engineSize >=2000)
         {
            tax = 1000.00;
         }
      }
         double monthlytax;
         monthlytax = tax;
         return monthlytax;
      }
   

   // Method 3 - Return if NCT is due or not.   
     public String checkNCTDate() 
     {
        if(year <= 2017 && year >= 2011) 
         {
            System.out.println("NCT is not due until next year (2022)");
         }
            if(year <= 1991 && year >= 1982)            
            {
               System.out.println("NCT is not due until next year (2022)");
            }
            else if(year <=2010 && year >= 1992)
            {
               System.out.println("NCT is due this year");
            }
            
            return checkNCTDate;
         }
            

    @Override
    public String toString()
   {
      return "Registration Number: "+regNo+ "\nCar make: "+make+ "\nCar model: "+model+ "\nEngine Size: "+engineSize+ "\nEmissions: "+emissions+ "\nCar's year: "+year+ "\nCar's value "+value;
   }
}

   





   










//Raise salary by specified amount if i need to change amounts?? recording 5 05:11
//Recording 6 10:00 currently. Need to insert methods before calculating in tester program.
   