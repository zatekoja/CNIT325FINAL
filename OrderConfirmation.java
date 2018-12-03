/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnit325finalproject;


import java.io.IOException;
import java.util.Properties;
;
import java.io.*;
/**
 *
 * @author Stephen
 */
//"1","Max", "598 Carrol St, West Lafayette, IN", "6715559079", "West Lafayette", "Indiana", "USA", "Max@gmail.com", "47906"
public class OrderConfirmation extends Order
{ 
    public static void main (String [] args) throws IOException
    {
        try
        {
            File outputFile = new File("output.txt");
            FileWriter  outputWrite = new FileWriter(outputFile);
            PrintWriter printer = new PrintWriter(outputWrite);
            printer.println("Thank you for your order!");
            printer.print("Hello Max");
            printer.print("Your order number is 500");
            printer.print("Order 500 will be shipped to 598 Carrol St, West Lafayette, Indianaf 47906");
            
            
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
    
  
