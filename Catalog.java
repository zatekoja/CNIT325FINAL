/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnit325finalproject;

import java.io.IOException;
import java.util.Properties;
import java.util.*;
import java.io.*;

/**
 *
 * @author Aron
 */
public class Catalog 
{
    String kidney;
    String heart;
    String liver;
    int priceKidney = 20000;
    int priceHeart = 50000;
    int priceLiver = 30000;
    String descKidney = "Looking for a better way to cleanse your urine? Look no further! Selling one kidney to one lucky customer!";
    String descHeart = "Finding trouble keeping up at the gym? This listing is for you! Selling a human heart!";
    String descLiver = "Spending too much time at Harry's? We've got you covered! Selling a liver to the highest bidder!";

    String getKidney()
    { 
        return kidney;
    }
    
    String getHeart()
    { 
        return heart;
    }
    
    String getLiver()
    { 
        return liver;
    }
   
    public Catalog()
    {
            
    }
    public static void main(String [] args)
    {
       
    }
       
}   
