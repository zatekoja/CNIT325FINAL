/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproj;

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
    String eye;
    String foot;
    
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
    
    String getEye()
    { 
        return eye;
    }
    
    String getFoot()
    { 
        return foot;
    }

    public Catalog(String fileName)
    {
        try
        {
            //create a new properties object
            Properties props = new Properties();
            //load the properties from the file
            props.load(getClass().getResourceAsStream("CatalogProps.properties"));
            //load each specific property into the instance variable
            kidney = props.getProperty("CatalogProps.kidney");
            heart = props.getProperty("CatalogProps.heart");
            liver = props.getProperty("CatalogProps.liver");
            eye = props.getProperty("CatalogProps.eye");
            foot = props.getProperty("CatalogProps.foot");


        }
        catch(IOException exc) //catches an IO exception
        { 
            exc.printStackTrace(); //shows the output and code trace if something goes wrong
        }
    
    }
    public static void main(String [] args)
    {
        
       //instantiate a new SimpleDataSource object and load the name of the external properties file
        Catalog sds = new Catalog("CatalogProps.properties");
        //return each value from the properties file to the output console. This will confirm correct operation
        System.out.println("Available hearts from: " + sds.getHeart());
        System.out.println("Available kidneys from: " + sds.getKidney());
        System.out.println("Available livers from: " + sds.getLiver());
        System.out.println("Availble eyes from: " + sds.getEye());
        System.out.println("Available feet from: " + sds.getFoot());
    }
       
}   
