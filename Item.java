/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnit325finalproject;

/**
 *
 * @author ateko
 */
public class Item implements  java.io.Serializable {
    private String Itemname; 
    private String Itemdescription;

    /**
     * @return the Itemname
     */
    public String getItemname() {
        return Itemname;
    }

    /**
     * @param Itemname the Itemname to set
     */
    public void setItemname(String Itemname) {
        this.Itemname = Itemname;
    }

    /**
     * @return the Itemdescription
     */
    public String getItemdescription() {
        return Itemdescription;
    }

    /**
     * @param Itemdescription the Itemdescription to set
     */
    public void setItemdescription(String Itemdescription) {
        this.Itemdescription = Itemdescription;
    }
    
}
