import java.util.Scanner;
public class ConversionCalculator
 {
    public static void main(String[] args)
    {
        System.out.println("Welcome to metric converter!");

        
        Scanner scnr = new Scanner(System.in);

        String userIn = "";

        while(!userIn.equals("exit"))
        {
            System.out.println("Please input your query. (g = oz, kg = lb, mm = in, km = mi)");
            System.out.println("Enter 'exit' to exit the program");
            userIn = scnr.nextLine();


            if(userIn.equals("g = oz"))
            {
              grams(scnr);
            } 

            else if(userIn.equals("kg = lb"))
            {
              kilograms(scnr);
            } 

            else if(userIn.equals("mm = in"))
            {
              milimeters(scnr);
            } 

            else if(userIn.equals("km = mi"))
            {
              kilometers(scnr);
            }

            else if(userIn.equals("exit"))
            {
              break;
            }

            else
            {
                System.out.println("Bad input");
            } 
        }
  
    }
            
    public static void grams(Scanner scnr)
    {
        String userIn = "";
        System.out.println("Please enter an amount or 'exit' to change conversion");
        Float myAmount = (float) 0.0;
        userIn = scnr.nextLine();
        if (!userIn.equals("exit"))
        {
            System.out.println("inside grams " + userIn);
            myAmount = TryParseFloat(userIn);
            if (myAmount == null)
            {
                System.out.println("Bad input " + userIn);  
            }
            else
            {
                Float myOunce = (float) (myAmount * 0.035274);
                System.out.println("myOuunce = " + myOunce);
            }
            System.out.println("");
        }
    }

    public static void kilograms(Scanner scnr)
    {
        String userIn = "";
        System.out.println("Please enter an amount or 'exit' to change conversion");
        Float myAmount = (float) 0.0;
        userIn = scnr.nextLine();
        if (!userIn.equals("exit"))
        {
            System.out.println("inside kilgrams " + userIn);
            myAmount = TryParseFloat(userIn);
            if (myAmount == null)
            {
                System.out.println("Bad input " + userIn);  
            }
            else
            {
                Float myPounds = (float) (myAmount * 2.205);
                System.out.println("Pounds = " + myPounds);
            }
            System.out.println("");
        }
    }

    public static void milimeters(Scanner scnr)
    {
        String userIn = "";
        System.out.println("Please enter an amount or 'exit' to change conversion");
        Float myAmount = (float) 0.0;
        userIn = scnr.nextLine();
        if (!userIn.equals("exit"))
        {
            System.out.println("inside milimeters " + userIn);
            myAmount = TryParseFloat(userIn);
            if (myAmount == null)
            {
                System.out.println("Bad input " + userIn);  
            }
            else
            {
                Float myInches = (float) (myAmount * 0.0393701);
                System.out.println("Inches = " + myInches);
            }
            System.out.println("");
        }
    }

    public static void kilometers(Scanner scnr)
    {
        String userIn = "";
        System.out.println("Please enter an amount or 'exit' to change conversion");
        Float myAmount = (float) 0.0;
        userIn = scnr.nextLine();
        if (!userIn.equals("exit"))
        {
            System.out.println("inside kilometers " + userIn);
            myAmount = TryParseFloat(userIn);
            if (myAmount == null)
            {
                System.out.println("Bad input " + userIn);  
            }
            else
            {
                Float myMiles = (float) (myAmount * 0.621371);
                System.out.println("Miles = " + myMiles);
            }
            System.out.println("");
        }
    }

    public static Float TryParseFloat(String myFloat)
    {
        try
        {
            return Float.parseFloat(myFloat);
        }
        catch (NumberFormatException ex)
        {
            return null;
        }
    }
}
    
