
package cnit325finalproject;

import java.util.*; 

public class Person implements java.io.Serializable{  
    


    protected name n01 = new name("Person"," Person");
    protected address a01 = new address("6776 via florenza"," City","State","Country","00000"); 
    protected contact c01 = new contact("08055573523","@yahoo.com ");

    /**
     * @param name
     * @param address
     * @param phone_num
     * @param city
     * @return the PUID
     */
    public Person (String name,String address,String phone_num,String city,String state, String Country,String email,String zipcode)
    {
        //
       this.setFirstname(name); 
       this.setAddress(address);
       this.setCity(city);
       this.setCountry(Country);
       this.setState(state);            
       this.setPhone_number(phone_num);
       this.setZip_code(zipcode);
       
       
        
         //CONSTRUCTOR
    }
    public String getLast_name() {
      
        return n01.getLast_name();
    }
    public void setLast_name(String last_name)
    {
        this.n01.setLast_name(last_name);
    }
    
    public String getMiddlename() {
        return n01.getMiddlename();
    }

    /**
     * @param Middlenaem the Middlenaem to set
     */
    public void setMiddlename(String Middlename) {
        this.n01.setMiddlename(Middlename);
    }

    /**
     * @return the last_name
     */
    
    public String getFirstname() {
        return n01.getFirstname();
    }

    /**
     * @param Firstname the Firstname to set
     */
    public void setFirstname(String Firstname) {
        n01.setFirstname(Firstname);
    }

    
    // end name 
    
    //start address 
    /**
     * @return the address
     */
     public String getAddress() {
        return a01.getAddress();
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.a01.setAddress(Address);
    }

    /**
     * @return the city
     */
    public String getCity() {
        return a01.getCity();
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.a01.setCity(city);
    }

    /**
     * @return the state
     */
    public String getState() {
        return a01.getState();
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.a01.setState(state);
    }

    /**
     * @return the zip_code
     */
    public String getZip_code() {
        return a01.getZip_code();
    }

    /**
     * @param zip_code the zip_code to set
     */
    public void setZip_code(String zip_code) {
        this.a01.setZip_code(zip_code);
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return a01.getCountry();
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.a01.setCountry(country);
    }

    //end address 
    //phone number
      public String getPhone_number() {
        return c01.getPhone_number();
    }

    /**
     * @param phone_number the phone_number to set
     */
    public void setPhone_number(String phone_number) {
        this.c01.setPhone_number(phone_number);
    }

    /**
     * @return the Birth_date
     */
  

    /**
     * @param age the age to set
     */
   

}

class name implements java.io.Serializable {
    private String Firstname; 
    private String Middlename; 
    private String last_name; 

    /**
     * @return the Firstname
     */
     public name (String e, String g)
    {
        Firstname = e; 
        last_name = g; 
         //CONSTRUCTOR
    }
    public String getFirstname() {
        return Firstname;
    }

    /**
     * @param Firstname the Firstname to set
     */
    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    /**
     * @return the Middlename
     */
    public String getMiddlename() {
        return Middlename;
    }

    /**
     * @param Middlename the Middlename to set
     */
    public void setMiddlename(String Middlename) {
        this.Middlename = Middlename;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    
   
    
}
class address implements java.io.Serializable
{
    private String Address; 
    private String city; 
    private String state; 
    private String zip_code; 
    private String country;     

    /**
     * @return the Address
     */
     public address (String address,String City,String State,String Country,String zipcode)
    {
        Address = address; 
        city = City; 
        state = State; 
        country = Country; 
        zip_code = zipcode;
         //CONSTRUCTOR
    }
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
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zip_code
     */
    public String getZip_code() {
        return zip_code;
    }

    /**
     * @param zip_code the zip_code to set
     */
    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

}
class contact implements java.io.Serializable
{
      private String phone_number; 
      private String Email; 
    
       public contact (String phone, String mail)
    {
        phone_number = phone; 
        Email = mail; 
         //CONSTRUCTOR
    }
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * @param phone_number the phone_number to set
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }
}

/**
 *
 * @author ateko
 */













