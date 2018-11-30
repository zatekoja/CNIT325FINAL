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
public class Supplier extends Person implements java.io.Serializable {
    private String SupplierID;
    Item item = new Item();
    private String supplied_quantity;
	
	/**
	* name, address, contact
	*/
    public Supplier(String SupplierID,String name,String address,String phone_num,String city,String state, String Country,String email,String zipcode)
    {
	super(name, address, phone_num, city, state, Country, email, zipcode);
	this.SupplierID = SupplierID;
    }

	/**
	 * @return the Customer ID
	 */
	
	public String getSupplierID() {
		return SupplierID;
	}
	
	public void setSupplierID(String ID) {
		this.SupplierID = ID;
	}

    /**
     * @return the supplied_quantity
     */
    public String getSupplied_quantity() {
        return supplied_quantity;
    }

    /**
     * @param supplied_quantity the supplied_quantity to set
     */
    public void setSupplied_quantity(String supplied_quantity) {
        this.supplied_quantity = supplied_quantity;
    }
}
