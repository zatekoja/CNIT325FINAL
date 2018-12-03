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
    private String name, address, phone_num, city, state, Country, email, zipcode;

    
    
	/**
	* name, address, contact
     * @param CustomerID
     * @param name
     * @param address
     * @param phone_num
     * @param city
     * @param zipcode
     * @param state
     * @param Country
     * @param email
	*/
	//Declaration of each variable
    public Customer(String CustomerID,String name,String address,String phone_num,String city,String state, String Country,String email,String zipcode)
    {
	super(name, address, phone_num, city, state, Country, email, zipcode);
	this.CustomerID = CustomerID;
    }

	/**
	 * @return the Customer ID
	 */
	
	//Getters and Setters for each variable
	public String getCustomerID() {
		return CustomerID;
	}
	
	public void setCustomerID(String ID) {
		this.CustomerID = ID;
	}
        
        public String getName() {
               return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getAddress() {
            return address;
        }
        
        public void setAddress(String address) {
            this.address = address;
        }
        
        public String getCity() {
            return city;
        }
        
        public void setCity(String city) {
            this.city = city;
        }
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

}
