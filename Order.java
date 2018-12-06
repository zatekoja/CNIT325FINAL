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
    Customer customer = new Customer();
    private Supplier supplier = new Supplier();
    private String itemdesc = "This item is a heart from Marylin Monroe"; //where is location of this?
    private String OrderID = "500"; //where is location of this?
    
    
}
