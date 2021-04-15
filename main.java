//A basic calculator program
/* To operate this program enter the 1st number,then the operation to be done(+,-,*,/) and finally the 2nd number. */

/* The program recognises invalid entries,if for example you put in "$" as the operation to be done or characters instead of numbers it displays where the wrong input was and prompts you to enter valid entries. */

import java.util.Scanner;


public class Calculator_v4
{
    public static void main(String[] args)
    {   
       double a = 0;
       double b = 0;
       double res = 0;
       
       //User input,using scanner
       Scanner ui = new Scanner(System.in);
       
       //1st number.
       /*Exception handling for invalid entries. */
       try
       {
         a = ui.nextDouble();
       }
       catch(Exception e)
       {
          System.out.println("Error, give a number!");
       }
       
       //Operation(+,-,* or /)
        String op = ui.next();
        
        //2nd number
        /*Exception handling for invalid entries. */
        try
        {
          b = ui.nextDouble();
        }
        catch(Exception e)
        {
            System.out.println("Error, give a number!");
        }
        
        //calculation by calling the appropriate method.
        if(op.equals("+"))
        {
          Addition(a,op,b,res);
        }
        else if(op.equals("-"))
        {
           Subtraction(a,op,b,res);
        }
        else if(op.equals("*"))
        {
           Multiplication(a,op,b,res);
        }
        else if(op.equals("/"))
        { 
           if(b == 0)   //check before division if the divider b=0
           {
              System.out.println("Error, division by zero!");
           }
           else
           {
             Division(a,op,b,res);
           }
        }
        else
        {
           System.out.println("Error, invalid  operation.");
        }
    }
    
  //calculation methods:
  static void Addition(double a,String op,double b,double res)
  {
    res = a + b;
    Result(a,op,b,res);
  }  
  
  static void Subtraction(double a,String op,double b,double res)
  {
    res = a - b;
    Result(a,op,b,res);
  }  
  
   static void Multiplication(double a,String op,double b,double res)
  {
    res = a * b;
    Result(a,op,b,res);
  }
    
   static void Division(double a,String op,double b,double res)
  {
    res = a / b;
    Result(a,op,b,res);
  }
  
  //Output method (it is called after the calculation is done)
  static void Result(double a,String op,double b,double res)
  {
     System.out.println(a+" "+op+" "+b+" " + "= "+res);
  }  
}
