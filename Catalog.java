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

    public String getKidney() {
        return kidney;
    }

    public void setKidney(String kidney) {
        this.kidney = kidney;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getLiver() {
        return liver;
    }

    public void setLiver(String liver) {
        this.liver = liver;
    }

    public int getPriceKidney() {
        return priceKidney;
    }

    public void setPriceKidney(int priceKidney) {
        this.priceKidney = priceKidney;
    }

    public int getPriceHeart() {
        return priceHeart;
    }

    public void setPriceHeart(int priceHeart) {
        this.priceHeart = priceHeart;
    }

    public int getPriceLiver() {
        return priceLiver;
    }

    public void setPriceLiver(int priceLiver) {
        this.priceLiver = priceLiver;
    }

    public String getDescKidney() {
        return descKidney;
    }

    public void setDescKidney(String descKidney) {
        this.descKidney = descKidney;
    }

    public String getDescHeart() {
        return descHeart;
    }

    public void setDescHeart(String descHeart) {
        this.descHeart = descHeart;
    }

    public String getDescLiver() {
        return descLiver;
    }

    public void setDescLiver(String descLiver) {
        this.descLiver = descLiver;
    }
   
    public Catalog()
    {
            
    }
    public static void main(String [] args)
    {
       
    }
       
}   
