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
public class Delivery {

   //Variables are To and From Addresses
    
    private String AddressTo;
    private String AddressFrom;

    public String EstimatedArrival(String AddressTo, String AddressFrom) {
        //EstimatedArrival 
        String result = "Ship To: " + AddressTo 
                + "Your package will arrive in approximately 4 business days.";
        return result;
    }
}