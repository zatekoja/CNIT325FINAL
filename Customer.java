package cnit325finalproject;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ateko
 */
public class Customer extends Person implements java.io.Serializable {
    private String CustomerID;
    
	
	/**
	* name, address, contact
	*/
    public Customer(String CustomerID,String name,String address,String phone_num,String city,String state, String Country,String email,String zipcode)
    {
	super(name, address, phone_num, city, state, Country, email, zipcode);
	this.CustomerID = CustomerID;
    }

	/**
	 * @return the Customer ID
	 */
	
	public String getCustomerID() {
		return CustomerID;
	}
}
