/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnit325finalproject;

import java.awt.List;
import java.util.*;

/**
 *
 * @author Stephen
 */
public class Order 
{

    /**
     * @return the supplier
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * @param supplier the supplier to set
     */
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    /**
     * @return the itemdesc
     */
    public String getItemdesc() {
        return itemdesc;
    }

    /**
     * @param itemdesc the itemdesc to set
     */
    public void setItemdesc(String itemdesc) {
        this.itemdesc = itemdesc;
    }

    /**
     * @return the OrderID
     */
    public String getOrderID() {
        return OrderID;
    }

    /**
     * @param OrderID the OrderID to set
     */
    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }
    Customer customer = new Customer("1","Max", "598 Carrol St, West Lafayette, IN", "6715559079", "West Lafayette", "Indiana", "USA", "Max@gmail.com", "47906");
    private Supplier supplier = new Supplier("1", "Black Market Organs", "513 Illegal Way", "2435551498", "New York", "New York", "USA", "organs@bmo.com", "52903");
    private String itemdesc = "This item is a heart from Marylin Monroe";
    private String OrderID = "500";
    
    
}
