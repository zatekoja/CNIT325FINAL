/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnit325finalproject;

/**
 * TEMPORARY CLASS - Takes input Address To and Address From
 * Returns a number of business days for estimated delivery
 */
public class Delivery extends OrderConfirmation {

   //Variables are To and From Addresses, and estimatedArrival that is "Determined" by OrderConfirmation information given
    
    private String AddressTo;
    private String AddressFrom;
    private String estimatedArrival;

    //

    public Delivery(String CustomerID, String name, String address, 
            String phone_num, String city, String state, String Country, String email, String zipcode) {
        super(CustomerID, name, address, phone_num, city, state, Country, email, zipcode);
        this.estimatedArrival = "Your package will arrive in approximately 4 business days.";
    }
    
    public String getEstimatedArrival() {
        return estimatedArrival;
    }

    public void setEstimatedArrival(String estimatedArrival) {
        this.estimatedArrival = estimatedArrival;
    }
   
    /*public String EstimatedArrival(String AddressTo, String AddressFrom) {
        //EstimatedArrival 
        String result = "Ship To: " + AddressTo 
                + "Your package will arrive in approximately 4 business days.";
        return result;
    }*/
}
