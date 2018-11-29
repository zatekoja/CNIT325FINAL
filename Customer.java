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
    private String fName;
    private String lName;
    private String address;
    private String zipcode;
    private Person p;
    
    public Customer (String CustomerID)
    {
        this.CustomerID = CustomerID;
	fName = p.getName();
	lName = p.getLastname();
	address = p.getAddress();
	zipcode = p.getZipcode();
    }

	/**
	 * @return the Customer ID
	 */
	
	public String getCustomerID() {
		return CustomerID;
	}
	
    /**
     * @return the First Name
     */
    public String getFirstName() {
        return fName;
	}

    /**
     * @return the Last Name
     */
    public String getLastName() {
        return lName;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the Zipcode
     */
    public String getZipcode() {
        return Zipcode;
    }

    /**
     * @return the Message
     */
}
