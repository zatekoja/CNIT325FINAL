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
public class Customer implements  java.io.Serializable {
    private String CustomerID;
	private Person p;
    
    public Customer (String CustomerID, String fName, String lName, String address1, String address2, String city, String state,
		String zipcode, String country, String price)
    {
        this.CustomerID = CustomerID;
		fName = p.getFirstName();
		lName = p.getLastName();
		address1 = p.getAddress1();
		address2 = p.getAddress2();
		city = p.getCity();
		state = p.getState();
		zipcode = p.getZipcode();
		country = p.getCountry();
		price = p.getPrice();
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
     * @return the Address1
     */
    public String getAddress1() {
        return address1;
    }
	
	/**
     * @return the Address2
     */
    public String getAddress2() {
        return address2;
    }

	/**
	 * @return the City
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * @return the State
	 */
	public String getState() {
		return state;
	}
	
    /**
     * @return the Zipcode
     */
    public String getZipcode() {
        return Zipcode;
    }
	
	/**
	 * @return the Ccountry
	 */
	public String getCountry() {
		return country;
	}
	
	/**
	 * @return the Price
	 */
	public String getPrice() {
		return price;
	}

    /**
     * @return the Message
     */
}
