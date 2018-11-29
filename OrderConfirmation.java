/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderconfirmation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Stephen
 */
public class OrderConfirmation extends Customer
{
    private String ConfirmationID;
    private Customer c;
    
    public OrderConfirmation(String customerInfo, String fName, String lName, String address, String zipcode)
    {
        this.ConfirmationID = ConfirmationID;
        fName = c.getFirstName();
        lName = c.getLastName();
        address = c.getAddress();
        zipcode = c.getZipcode();
            
    }
}
    
  
