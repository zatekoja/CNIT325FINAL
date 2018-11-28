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
public class OrderConfirmation 
{
    String fName, mName, orderNumber, address1, address2, city, state, zipcode,country, price;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
    }
    
    public OrderConfirmation(String customerInfo)
    {
        try
        {
            Properties props = new Properties();
            FileInputStream custFileIn = new FileInputStream(customerInfo);
            props.load(custFileIn);
            
            fName = props.getProperty("update once known");
            mName = props.getProperty("update once known");
            orderNumber = props.getProperty("update once known");
            address1 = props.getProperty("update once known");
            address2 = props.getProperty("update once known");
            city = props.getProperty("update once known");
            state = props.getProperty("update once known");
            country = props.getProperty("update once known");
            zipcode = props.getProperty("update once known");
            price = props.getProperty("update once known");
            
        }
        
        catch(IOException exc)
        {
            exc.printStackTrace();
        }
    }
    
        public String getFName()
        {
            return fName;
        }
        public String getMName()
        {
            return mName;
        }
        public String getOrderNum()
        {
            return orderNumber;
        }
        public String getAddress1()
        {
            return address1;
        }
        
        public String getAddress2()
        {
            return address2;
        }
        public String getCity()
        {
            return city;
        }
        public String getState()
        {
            return state;
        }
        public String getCountry()
        {
            return country;
        }
        public String setZipCode()
        {
            return zipcode;
        }
        public String getPrice()
        {
            return price;
        }
    
}
