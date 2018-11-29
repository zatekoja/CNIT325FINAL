package cnit325finalproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ateko
 */
public class Person implements  java.io.Serializable {
    private String FirstName; 
    private String Lastname; 
    private String Address; 
    private String Zipcode; 
    
     public Person (String name,String Lastname,String message)
    {
        FirstName = name; 
        Lastname = Lastname;
         
    }


    /**
     * @return the Name
     */
    public String getName() {
        return FirstName;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.FirstName = Name;
    }

    /**
     * @return the Idnum
     */
    public String Lastname() {
        return Lastname;
    }

    /**
     * @param Idnum the Idnum to set
     */
    public void Lastname(String Lastname) {
        this.Lastname = Lastname;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Zipcode
     */
    public String getZipcode() {
        return Zipcode;
    }

    /**
     * @param Zipcode the Zipcode to set
     */
    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    /**
     * @return the Message
     */
   

   
}
