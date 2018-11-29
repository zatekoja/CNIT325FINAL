/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproj;

/**
 *
 * @author Aron
 */
public class Supplier extends Person implements java.io.Serializable
{
    String firstName;
    String lastName;
    String address;
    String product;
    
    Person p1 = new Person("John", "Travolta", "60606", "Kidney");
    Person p2 = new Person("Eric", "Matson", "73958", "Heart");
    Person p3 = new Person("Betty", "White", "32478", "Liver");

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getZipCode() {
        return address;
    }

    public void setZipCode(String zipCode) {
        this.address = zipCode;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }   
    
}
