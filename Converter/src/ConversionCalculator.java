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
            System.out.println("Please input your query. For example, 1km = m.");
            System.out.println("Enter 'exit' to exit the program");
            userIn = scnr.nextLine();


            if(userIn.equals("g to oz"))
            {
              grams(scnr);
            } 
        }
  
    }
            
    public static void grams(Scanner scnr)
    {
        //System.out.println("abc " + myString);
        String userIn = "";
        System.out.println("Please an amount or 'exit' to change conversion");
        Float myAmount = (float) 0.0;
        userIn = scnr.nextLine();
        if (!userIn.equals("exit"))
        {
            System.out.println("inside grams " + userIn);
            myAmount = TryParseFloat(userIn);
            if (myAmount == null)
            {
                System.out.println("inside grams bad input " + userIn);  
            }
            else
            {
                Float myOunce = myAmount * 4;
                System.out.println("myOuunce = " + myOunce);
            }
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
    
