/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproj;

import java.awt.List;
import java.util.*;

/**
 *
 * @author Stephen
 */
public class Order extends Customer implements ListofItems
{
    private String custID,fullname,custaddress,phone_num, custemail, custcity, custstate, custcountry, custzipcode;
    private double price, tax, total;
    //this class needs to calculate price, 
    private Customer c = new Customer();
    public Order(String Customerid,String name, String address, String city, String state, String Country,
            String zipcode,String Phone,String email, int orderprice, int ordertax, int ordertotal)
    {
        custID = Customerid;
        fullname = name;
        custaddress = address;
        phone_num = Phone;
        custemail = email;
        custcity = city;
        custstate = state;
        custcountry = Country;
        custzipcode = zipcode;
        price = orderprice;
        tax = ordertax;
        total = ordertotal; 
    }
    public Order()
    {
        custID = c.getCustomerID();
        fullname = c.getName();
        custaddress = c.getAddress();
        phone_num = c.getPhone_num();
        custcity = c.getCity();
        custstate = c.getState();
        custcountry = c.getCountry();
        custemail = c.getEmail();
        custzipcode = c.getZipcode();
        price = 500;
        tax = 1.07;
        total = price * tax;
    }
}
