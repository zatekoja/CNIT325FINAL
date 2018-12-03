/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproj;


import java.io.IOException;
import java.util.Properties;
;
import java.io.*;
/**
 *
 * @author Stephen
 */
public class OrderConfirmation extends Order
{
    public String custID, Customerid, name, address, city, state, Country, zipcode, Phonoe, email, ConfirmationID;
    public double price, tax, total;
    private Order o;
    
    public OrderConfirmation(String Customerid,String name, String address, String city, String state, String Country,
            String zipcode,String Phone,String email, double orderprice, double ordertax, double ordertotal, String Confirmation)
    {
        super(Customerid, name, address, city, state, Country, zipcode, Phone,email, orderprice, ordertax,  ordertotal);
        this.ConfirmationID = Confirmation;     
    }
    public OrderConfirmation()
    {
        name = o.getName();
        address = o.getAddress();
        
    }
    
    public static void main (String [] args) throws IOException
    {
        try
        {
            File outputFile = new File("output.txt");
            FileWriter  outputWrite = new FileWriter(outputFile);
            PrintWriter printer = new PrintWriter(outputWrite);
            printer.println("Thank you for your order!");
            printer.print("Hello ");
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
    
  
