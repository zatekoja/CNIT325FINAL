/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnit325finalproject;


/**
 *
 * @author Stephen
 */
public interface Orderable 
{ 
    void nullSupplier(Supplier supplier); //checks for null supplier
    void nullItemDesc(String itemdesc); //checks for null itemdesc
    void nullOrderID(String OrderID); //checks for null OrderID
}
